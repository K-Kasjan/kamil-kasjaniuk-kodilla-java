package com.kodilla.testing.forum.statistics;

public class StatisticsHandler {
    int usersCount;
    int postsCount;
    int commentsCount;
    float postsPerUser;
    float commentsPerUser;
    float commentsPerPost;

    public StatisticsHandler(Statistics statistics){
        calculateAdvStatistics(statistics);
    }

    public void calculateAdvStatistics(Statistics statistics){
        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        this.postsPerUser = (usersCount == 0) ? 0 : (float) postsCount / usersCount;
        this.commentsPerUser = (usersCount == 0) ? 0 : (float) commentsCount / usersCount;
        this.commentsPerPost = (postsCount == 0) ? 0 : (float) this.commentsCount / this.postsCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public float getPostsPerUser() {
        return postsPerUser;
    }

    public float getCommentsPerUser() {
        return commentsPerUser;
    }

    public float getCommentsPerPost() {
        return commentsPerPost;
    }
}
