package com.udacity.jwdnd.c1.review.model;

public class ChatForm {

    private String username;
    private String messagetext;
    private String messageType;

    public String getUsername() { return this.username; }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessagetext() {
        return this.messagetext;
    }
    public void setMessagetext(String messagetext) {
        this.messagetext = messagetext;
    }

    public String getMessageType() {
        return this.messageType;
    }
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

}
