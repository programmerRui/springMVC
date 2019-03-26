package com.neusoft.po;

import java.util.Date;

public class User {
    private String username;
    private String password;
    private String love;
    private Date date;

    public User() {
    }

    public User(String username, String password, String love, Date date) {
        this.username = username;
        this.password = password;
        this.love = love;
        this.date = date;
    }

    public User(String username, String password, String love) {
        this.username = username;
        this.password = password;
        this.love = love;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", love='" + love + '\'' +
                ", date=" + date +
                '}';
    }
}
