package com.myapp.plcconnect.repo;

import java.util.List;

import com.myapp.plcconnect.model.Message;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long>{
    //public List<Message> findbyClient_id();
}
