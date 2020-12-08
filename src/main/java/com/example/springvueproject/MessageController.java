package com.example.springvueproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/messages")
    public List<Message> getAllMessages(){
        return messageService.getAllMessages();
    }

}
