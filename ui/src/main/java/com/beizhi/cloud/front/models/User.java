package com.beizhi.cloud.front.models;

/**
 * Created by eric on 16/11/7.
 */
public class User {
    private String username;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
