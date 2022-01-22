package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public void addForumUserToList(ForumUser forumUser){
        this.forumUserList.add(forumUser);
    }

    public List<ForumUser> getUserList() {
        return forumUserList;
    }
}
