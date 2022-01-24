package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[]{10,12,14,16,18,20};

        //When
        double averageGiven = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(15,averageGiven);
    }
}
