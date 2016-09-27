package com.mzherdev.guestbook.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by mzherdev on 26.09.16.
 */


public class Post implements Serializable {

    private String userName;
    private String userEmail;
    private String text;
    private Date date;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String email) {
        this.userEmail = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Post{" +
                ", userName='" + userName + '\'' +
                ", email='" + userEmail + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
