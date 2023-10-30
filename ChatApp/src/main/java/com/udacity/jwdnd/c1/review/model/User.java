package com.udacity.jwdnd.c1.review.model;

public class User {

    private Integer userid;
    private String username;
    private String salt;
    private String password;
    private String firstname;
    private String lastname;

    public User(Integer userid, String username, String salt, String password, String firstname, String lastname) {
        this.userid = userid;
        this.username = username;
        this.salt = salt;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // GETTERS
    public Integer getUserId() {
        return this.userid;
    }
    public String getUsername() {
        return this.username;
    }
    public String getSalt() {
        return this.salt;
    }
    public String getPassword() {
        return this.password;
    }
    public String getFirstName() {
        return this.firstname;
    }
    public String getLastName() {
        return this.lastname;
    }

    // SETTERS
    public void setUserId(Integer userid) {
        this.userid = userid;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void getSalt(String salt) {
        this.salt = salt;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void getFirstName(String firstname) {
        this.firstname = firstname;
    }
    public void getLastName(String lastname) {
        this.lastname = lastname;
    }
}
