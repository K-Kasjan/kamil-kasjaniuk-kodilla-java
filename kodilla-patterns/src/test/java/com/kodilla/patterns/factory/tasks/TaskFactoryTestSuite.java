package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testMakeTasks(){
        //Given
        TasksFactory tasksFactory = new TasksFactory();
        //When
        Task shopping = tasksFactory.makeTask(tasksFactory.SHOPPING_TASK);
        Task painting = tasksFactory.makeTask(tasksFactory.PAINTING_TASK);
        Task diving = tasksFactory.makeTask(tasksFactory.DIVING_TASK);
        Task nullExpected = tasksFactory.makeTask("Kodilla");
        //Then
        Assertions.assertEquals(ShoppingTask.class,shopping.getClass());
        Assertions.assertEquals(PaintingTask.class,painting.getClass());
        Assertions.assertEquals(DivingTask.class,diving.getClass());
        Assertions.assertNull(nullExpected);
    }
}
