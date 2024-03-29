package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class Calculator {

    @Autowired
    private Display display;

    double add(double a, double b){
        double result = a + b;
        displayValue(result);
        return result;
    }
    double sub(double a, double b){
        double result = a - b;
        displayValue(result);
        return result;
    }
    double mul(double a, double b){
        double result = a * b;
        displayValue(result);
        return result;
    }
    double div(double a, double b){
        double result = a / b;
        displayValue(result);
        return result;
    }

    private void displayValue(double val){
        display.displayValue(val);
    }
}
