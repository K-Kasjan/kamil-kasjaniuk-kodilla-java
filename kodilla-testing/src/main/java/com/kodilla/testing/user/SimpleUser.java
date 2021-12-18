package com.kodilla.testing.user;

public class SimpleUser {
    private String username;

    String realName;

    public String getUsername() {
        return username;
    }

    public SimpleUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public SimpleUser(String username) {
        this.username = username;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }
}


