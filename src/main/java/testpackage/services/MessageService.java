package testpackage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testpackage.entities.Message;
import testpackage.repositories.MessageRepository;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAllMessages(){
        return messageRepository.findAll();
    }

    public void insert(Message message) {
        messageRepository.save(message);
    }
}
