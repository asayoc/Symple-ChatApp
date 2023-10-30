package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.model.*;
import com.udacity.jwdnd.c1.review.repository.MessageMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    private String messagetext;
    private List<ChatMessage> messages;
    private MessageMapper messageMapper;
    public MessageService(MessageMapper message) {
        this.messageMapper = message;
        this.messages = new ArrayList<>();
    }
    public String upperCase() {
        return this.messagetext.toUpperCase();
    }

    public String lowerCase() {
        return this.messagetext.toLowerCase();
    }

    public void addMessage(ChatForm chatForm) {

        String msg;
        this.messagetext = chatForm.getMessagetext();

        if(chatForm.getMessageType().equals("2")){
            msg = this.upperCase();
        } else if(chatForm.getMessageType().equals("3")) {
            msg = this.lowerCase();
        } else {
            msg = this.messagetext;
        }
        messageMapper.insert(chatForm.getUsername(), msg);

    }

    public List<ChatMessage> getMessages() {
        if(messageMapper.getMessages() == null) {
            this.messages = new ArrayList<>();
        } else {
            this.messages = messageMapper.getMessages();
        }
        return new ArrayList<>(this.messages);
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("Initialize Bean: MessageService()");
        this.messages = new ArrayList<>();
    }
}
