package com.kodilla.testing.collection;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Odd Number Exterminator Test")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


    @DisplayName("when empty List given, empty List expected")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumberExterminator exterminator = new OddNumberExterminator();
        //When
        List<Integer> list = new ArrayList<>();
        List<Integer> returnedList = exterminator.exterminate(list);
        System.out.println("Testing empty List");
        //Then
        Assertions.assertEquals(returnedList,new ArrayList<Integer>());

    }

    @DisplayName("when Integer List given, only even numbers expected")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumberExterminator exterminator = new OddNumberExterminator();

        //When
        /*List<Integer> normalList = new ArrayList<>();
        normalList.add(0);
        normalList.add(1);*/

        List normalList = Arrays.asList(new int[]{0,1});

        List<Integer> returnedList = exterminator.exterminate(normalList);
        System.out.println("Testing Normal List");

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(0);

        //Then
        Assertions.assertEquals(returnedList,expectedList);
    }
}
