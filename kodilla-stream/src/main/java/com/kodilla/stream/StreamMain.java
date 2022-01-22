package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        forum.addForumUserToList(new ForumUser(
                0,
                "username_001",
                'M',
                1995,
                10,
                12,
                0
        ));
        forum.addForumUserToList(new ForumUser(
                1,
                "username_002",
                'M',
                1996,
                10,
                12,
                1
        ));
        forum.addForumUserToList(new ForumUser(
                2,
                "username_003",
                'F',
                1997,
                10,
                12,
                1
        ));
        forum.addForumUserToList(new ForumUser(
                3,
                "username_004",
                'M',
                1998,
                10,
                12,
                1
        ));
        forum.addForumUserToList(new ForumUser(
                4,
                "username_005",
                'M',
                2005,
                10,
                12,
                12
        ));


        Map<Integer,ForumUser> sortedForum = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M' &&
                        forumUser.getDateOfBirth().plusYears(20).isBefore(LocalDate.now()) &&
                        forumUser.getPostsCounter() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID,forumUser -> forumUser));

        System.out.println(sortedForum);

    }
}