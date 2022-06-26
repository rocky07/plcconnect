package com.myapp.plcconnect.controller;

import java.util.List;

import com.myapp.plcconnect.model.Message;
import com.myapp.plcconnect.repo.MessageRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    // api saves payload
    @Autowired
    MessageRepo messageRepo;
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


    //login page
}
