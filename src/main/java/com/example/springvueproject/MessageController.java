package com.example.springvueproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MessageController {

    @Autowired
    private MessageService messageService;

    //@RequestMapping("/messages")
    public List<Message> getAllMessages(){
        return messageService.getAllMessages();
    }

    //@RequestMapping(method= RequestMethod.POST, value="/messages")
    public void addMessage(@RequestBody Message message){
        messageService.addMessage(message);
    }

    //@RequestMapping(method= RequestMethod.DELETE, value="/messages")
    public void removeMessage(@RequestBody Message message){
        messageService.removeMessage(message);
    }

}
