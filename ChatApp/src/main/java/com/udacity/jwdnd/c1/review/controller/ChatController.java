package com.udacity.jwdnd.c1.review.controller;

import com.udacity.jwdnd.c1.review.service.*;
import com.udacity.jwdnd.c1.review.model.*;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;

import java.security.Principal;
import java.util.ArrayList;

@Controller
@RequestMapping("/chat")
public class ChatController {

    private final MessageService messageService;
    private String user;

    public ChatController (MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String getChat(@ModelAttribute("chatForm") ChatForm chatForm, Model model, Principal user) {
        this.user = user.getName();
        model.addAttribute("currentUser", this.user);
        model.addAttribute("messages", this.messageService.getMessages());
        return "chat";
    }

    @PostMapping
    public String postChat(@ModelAttribute("chatForm") ChatForm chatForm, Model model) {
        chatForm.setUsername(this.user);
        messageService.addMessage(chatForm);
        model.addAttribute("currentUser", this.user);
        model.addAttribute("messages",messageService.getMessages());
        return "chat";
    }
}
