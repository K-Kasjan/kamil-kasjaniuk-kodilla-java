package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private Statistics statistics;

    @Test
    void testPostsCount0(){
        //Given
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(100);
        List<String> forumUserList = new LinkedList<>();
        IntStream.iterate(0, i -> i+1).limit(10)
                .forEach(i -> forumUserList.add(i+""));
        when(statistics.usersNames()).thenReturn(forumUserList);
        StatisticsHandler statisticsHandler = new StatisticsHandler(statistics);

        //When
        int postsCount = statisticsHandler.getPostsCount();
        int usersCount = statisticsHandler.getUsersCount();
        int commentsCount = statisticsHandler.getCommentsCount();
        float postsPerUserCount = statisticsHandler.getPostsPerUser();
        float commentsPerUserCount = statisticsHandler.getCommentsPerUser();
        float commentsPerPostCount = statisticsHandler.getCommentsPerPost();

        //Then
        assertEquals(0, postsCount);
        assertEquals(10, usersCount);
        assertEquals(100, commentsCount);
        assertEquals(0, postsPerUserCount);
        assertEquals(10, commentsPerUserCount);
        assertEquals(0, commentsPerPostCount);
    }
    @Test
    void testPostsCount100(){
        //Given
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(100);
        List<String> forumUserList = new LinkedList<>();
        IntStream.iterate(0, i -> i+1).limit(10)
                .forEach(i -> forumUserList.add(i+""));
        when(statistics.usersNames()).thenReturn(forumUserList);
        StatisticsHandler statisticsHandler = new StatisticsHandler(statistics);

        //When
        int postsCount = statisticsHandler.getPostsCount();
        int usersCount = statisticsHandler.getUsersCount();
        int commentsCount = statisticsHandler.getCommentsCount();
        float postsPerUserCount = statisticsHandler.getPostsPerUser();
        float commentsPerUserCount = statisticsHandler.getCommentsPerUser();
        float commentsPerPostCount = statisticsHandler.getCommentsPerPost();

        //Then
        assertEquals(100, postsCount);
        assertEquals(10, usersCount);
        assertEquals(100, commentsCount);
        assertEquals(10, postsPerUserCount);
        assertEquals(10, commentsPerUserCount);
        assertEquals(1, commentsPerPostCount);
    }
    @Test
    void testCommentsCount0(){
        //Given
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(0);
        List<String> forumUserList = new LinkedList<>();
        IntStream.iterate(0, i -> i+1).limit(10)
                .forEach(i -> forumUserList.add(i+""));
        when(statistics.usersNames()).thenReturn(forumUserList);
        StatisticsHandler statisticsHandler = new StatisticsHandler(statistics);

        //When
        int postsCount = statisticsHandler.getPostsCount();
        int usersCount = statisticsHandler.getUsersCount();
        int commentsCount = statisticsHandler.getCommentsCount();
        float postsPerUserCount = statisticsHandler.getPostsPerUser();
        float commentsPerUserCount = statisticsHandler.getCommentsPerUser();
        float commentsPerPostCount = statisticsHandler.getCommentsPerPost();

        //Then
        assertEquals(100, postsCount);
        assertEquals(10, usersCount);
        assertEquals(0, commentsCount);
        assertEquals(10, postsPerUserCount);
        assertEquals(0, commentsPerUserCount);
        assertEquals(0, commentsPerPostCount);
    }
    @Test
    void testLessCommentsThanPosts(){
        //Given
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(10);
        List<String> forumUserList = new LinkedList<>();
        IntStream.iterate(0, i -> i+1).limit(10)
                .forEach(i -> forumUserList.add(i+""));
        when(statistics.usersNames()).thenReturn(forumUserList);
        StatisticsHandler statisticsHandler = new StatisticsHandler(statistics);

        //When
        int postsCount = statisticsHandler.getPostsCount();
        int usersCount = statisticsHandler.getUsersCount();
        int commentsCount = statisticsHandler.getCommentsCount();
        float postsPerUserCount = statisticsHandler.getPostsPerUser();
        float commentsPerUserCount = statisticsHandler.getCommentsPerUser();
        float commentsPerPostCount = statisticsHandler.getCommentsPerPost();

        //Then
        assertEquals(100, postsCount);
        assertEquals(10, usersCount);
        assertEquals(10, commentsCount);
        assertEquals(10, postsPerUserCount);
        assertEquals(1, commentsPerUserCount);
        assertEquals(0.1f, commentsPerPostCount);
    }
    @Test
    void testLessPostsThanComments(){
        //Given
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.commentsCount()).thenReturn(100);
        List<String> forumUserList = new LinkedList<>();
        IntStream.iterate(0, i -> i+1).limit(10)
                .forEach(i -> forumUserList.add(i+""));
        when(statistics.usersNames()).thenReturn(forumUserList);
        StatisticsHandler statisticsHandler = new StatisticsHandler(statistics);

        //When
        int postsCount = statisticsHandler.getPostsCount();
        int usersCount = statisticsHandler.getUsersCount();
        int commentsCount = statisticsHandler.getCommentsCount();
        float postsPerUserCount = statisticsHandler.getPostsPerUser();
        float commentsPerUserCount = statisticsHandler.getCommentsPerUser();
        float commentsPerPostCount = statisticsHandler.getCommentsPerPost();

        //Then
        assertEquals(10, postsCount);
        assertEquals(10, usersCount);
        assertEquals(100, commentsCount);
        assertEquals(1, postsPerUserCount);
        assertEquals(10, commentsPerUserCount);
        assertEquals(10, commentsPerPostCount);
    }
    @Test
    void testUserCount0(){
        //Given
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(100);
        List<String> forumUserList = new LinkedList<>();
        when(statistics.usersNames()).thenReturn(forumUserList);
        StatisticsHandler statisticsHandler = new StatisticsHandler(statistics);

        //When
        int postsCount = statisticsHandler.getPostsCount();
        int usersCount = statisticsHandler.getUsersCount();
        int commentsCount = statisticsHandler.getCommentsCount();
        float postsPerUserCount = statisticsHandler.getPostsPerUser();
        float commentsPerUserCount = statisticsHandler.getCommentsPerUser();
        float commentsPerPostCount = statisticsHandler.getCommentsPerPost();

        //Then
        assertEquals(100, postsCount);
        assertEquals(0, usersCount);
        assertEquals(100, commentsCount);
        assertEquals(0, postsPerUserCount);
        assertEquals(0, commentsPerUserCount);
        assertEquals(1, commentsPerPostCount);
    }
    @Test
    void testUserCount100(){
        //Given
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(100);
        List<String> forumUserList = new LinkedList<>();
        IntStream.iterate(0, i -> i+1).limit(100)
                .forEach(i -> forumUserList.add(i+""));
        when(statistics.usersNames()).thenReturn(forumUserList);
        StatisticsHandler statisticsHandler = new StatisticsHandler(statistics);

        //When
        int postsCount = statisticsHandler.getPostsCount();
        int usersCount = statisticsHandler.getUsersCount();
        int commentsCount = statisticsHandler.getCommentsCount();
        float postsPerUserCount = statisticsHandler.getPostsPerUser();
        float commentsPerUserCount = statisticsHandler.getCommentsPerUser();
        float commentsPerPostCount = statisticsHandler.getCommentsPerPost();

        //Then
        assertEquals(100, postsCount);
        assertEquals(100, usersCount);
        assertEquals(100, commentsCount);
        assertEquals(1, postsPerUserCount);
        assertEquals(1, commentsPerUserCount);
        assertEquals(1, commentsPerPostCount);
    }
}
