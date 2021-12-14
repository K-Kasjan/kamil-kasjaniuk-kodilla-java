package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        if(Calculator.add(10,10) == 20){
            System.out.println("Calculator.add() test OK");
        }else{
            System.out.println("Calculator.add() test Failed");
        }
        if(Calculator.subtract(30,10) == 20){
            System.out.println("Calculator.subtract() test OK");
        }else{
            System.out.println("Calculator.subtract() test Failed");
        }
    }
}