package com.example.springvueproject.controllers;

import com.example.springvueproject.services.MessageService;
import com.example.springvueproject.entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/messages")
    public List<Message> getAllMessages(){
        return messageService.getAllMessages();
    }

    @GetMapping("/messages/{id}")
    public Optional<Message> getMessageById(@PathVariable Long id){
        return messageService.getMessageById(id);
    }

    @DeleteMapping("/messages/{id}")
    public void deleteMessageById(@PathVariable Long id){
        messageService.deleteMessageById(id);
    }

    @PostMapping("/message")
    public void sendMessage(@RequestBody Message message){
        if(message.getDateSent() == null) {
            message.setDateSent(new Date());
        }
        messageService.insert(message);
    }





    //@RequestMapping(value = "/message", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)


}