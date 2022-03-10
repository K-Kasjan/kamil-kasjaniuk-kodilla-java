package com.kodilla.patterns.strategy.social;

public abstract class User {
    private String username;
    protected SocialPublisher socialPublisher;

    public User(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    String sharePost(){
        return socialPublisher.share();
    }
}
