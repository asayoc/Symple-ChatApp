package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {

    private Integer messageid;
    private String username;
    private String messagetext;

    // GETTERS
    public Integer getMessageId() { return this.messageid; }
    public String getUsername() {
        return this.username;
    }
    public String getMessagetext() { return this.messagetext; }

    // SETTERS
    public void setMessageId(Integer messageid) { this.messageid = messageid; }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setMessagetext(String messagetext) {
        this.messagetext = messagetext;
    }

}
