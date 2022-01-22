package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private int postsCounter;

    public ForumUser(int userID, String username, char sex, LocalDate dateOfBirth, int postsCounter) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postsCounter = postsCounter;
    }
    public ForumUser(int userID, String username, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postsCounter) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.postsCounter = postsCounter;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsCounter() {
        return postsCounter;
    }

    public void setPostsCounter(int postsCounter) {
        this.postsCounter = postsCounter;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postsCounter=" + postsCounter +
                '}';
    }
}
