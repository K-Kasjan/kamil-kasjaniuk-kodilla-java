package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggedTestSuite {

    Logger logger = Logger.INSTANCE;

    @Test
    void testGetLastLog(){
        //Given
        logger.log("404");
        //When
        String expectedLog = logger.getLastLog();
        //Then
        Assertions.assertEquals("404",expectedLog);
    }
}
