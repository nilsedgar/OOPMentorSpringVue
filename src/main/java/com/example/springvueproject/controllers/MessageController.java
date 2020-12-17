package com.example.springvueproject.controllers;

import com.example.springvueproject.services.MessageService;
import com.example.springvueproject.entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/messages")
    public List<Message> getAllMessages(){
        return messageService.getAllMessages();
    }

    @PostMapping("/message")
    public void sendMessage(@RequestBody Message message){
        if(message.getDateSent() == null) {
            message.setDateSent(new Date());
        }
        messageService.insert(message);
    }



    public void deleteMessage(Long id){

    }

    //@RequestMapping(value = "/message", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)


}