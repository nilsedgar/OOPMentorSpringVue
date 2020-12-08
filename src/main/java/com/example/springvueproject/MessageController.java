package com.example.springvueproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController

public class MessageController {

    @RequestMapping("/messages")
    public List<Message> getAllMessages(){
        return Arrays.asList(
                new Message("Nils", "Hello! This is message."),
                new Message("Nils", "It feels like I'm talking to myself..."),
                new Message("Nils", "Can't think of anything to say.")
        );
    }

}
