package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CalculatorTestSuite {

    @Test
    void calculatorAddTest(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(5, 5);
        //Then
        Assertions.assertEquals(10,result);
    }
    @Test
    void calculatorSubTest(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(5, 5);
        //Then
        Assertions.assertEquals(0,result);
    }
    @Test
    void calculatorMulTest(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(5, 5);
        //Then
        Assertions.assertEquals(25,result);
    }
    @Test
    void calculatorDivTest(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(5, 5);
        //Then
        Assertions.assertEquals(1,result);
    }
    @Test
    void calculatorDivByZeroTest(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(5, 0);
        //Then
        Assertions.assertTrue(Double.isInfinite(result));
    }

}
