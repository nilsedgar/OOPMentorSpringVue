package com.example.springvueproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MessageService {

    private List<Message> messages = new ArrayList<>(Arrays.asList(
            new Message("Nils", "Hello! This is message."),
                new Message("Nils", "It feels like I'm talking to myself..."),
                new Message("Nils", "Can't think of anything to say.")
        ));

    public List<Message> getAllMessages(){
        return messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }
}
