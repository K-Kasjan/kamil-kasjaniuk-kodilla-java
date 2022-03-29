package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String LIST_NAME = "Test";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION );

        //When
        taskListDao.save(taskList);

        //Then
        List<TaskList> readTask = taskListDao.findByListName(LIST_NAME);
        assertEquals(1,readTask.size());
        assertEquals(LIST_NAME, readTask.get(0).getListName());

        //CleanUp
        taskListDao.delete(readTask.get(0));
    }
}
