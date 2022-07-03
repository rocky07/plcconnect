package com.myapp.plcconnect.controller;

import java.util.List;

import com.myapp.plcconnect.model.AuthenticationRequest;
import com.myapp.plcconnect.model.AuthenticationResponse;
import com.myapp.plcconnect.model.Message;
import com.myapp.plcconnect.repo.MessageRepo;
import com.myapp.plcconnect.util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    // api saves payload
    @Autowired
    MessageRepo messageRepo;

  
   @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    JwtUtil jwtUtil;

  
    private String generateToken;

    @RequestMapping("/postmessage")
    public String postMessage(@RequestBody Message message){
        //call repo and update
        messageRepo.save(message);
        return null;
    }
    //api retrives all payload
    @RequestMapping("/getmessage")
    public List<Message> getAllMessage(){
        return messageRepo.findAll();
    }

    //load home page

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    // jwt authenticate

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest req) throws Exception {

    try{
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword()));
    }catch(BadCredentialsException e){
        throw new Exception("incorrect username/password" ,e);
    }
    final UserDetails userDetails=userDetailsService.loadUserByUsername(req.getUsername());
    generateToken = jwtUtil.generateToken(userDetails);
    return ResponseEntity.ok(new AuthenticationResponse(generateToken));

    }
}
