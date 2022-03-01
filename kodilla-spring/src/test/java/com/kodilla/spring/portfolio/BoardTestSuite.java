package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.inProgressList.addTask("in progress");
        board.toDoList.addTask("to do");
        board.doneList.addTask("done");
        //Then
        Assertions.assertEquals("in progress",board.inProgressList.tasks.get(0));
        Assertions.assertEquals("to do",board.toDoList.tasks.get(0));
        Assertions.assertEquals("done",board.doneList.tasks.get(0));
    }
}
