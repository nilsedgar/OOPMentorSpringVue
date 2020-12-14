package testpackage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import testpackage.entities.Message;
import testpackage.services.MessageService;

import java.util.Date;
import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @GetMapping("/messages")
    public List<Message> messages(){
        return messageService.getAllMessages();
    }

    @PostMapping("/message")
    public void sendMessage(@RequestBody Message message){
        if(message.getDateSent() == null) {
            message.setDateSent(new Date());
        }
        messageService.insert(message);
    }

}