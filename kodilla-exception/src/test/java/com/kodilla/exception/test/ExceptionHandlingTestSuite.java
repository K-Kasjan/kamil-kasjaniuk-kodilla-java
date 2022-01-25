package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {

    @Test
    void testProbablyIWillThrowException(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        //y == 1.5
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9,1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1d,1.5d));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2d,1.5));
        //x>2
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2d,1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2d,1d));
        //x<1
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0d,1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0d,1d));

        // 1 =< x < 2 && y != 1.5
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1d,0d));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99d,0d));
    }
}
