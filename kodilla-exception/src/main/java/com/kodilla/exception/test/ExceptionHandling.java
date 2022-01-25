package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String returnedString = "";
        try {
            secondChallenge.probablyIWillThrowException(3d,2d);
            returnedString = "You missed exception";
        } catch (Exception e) {
            returnedString = "Exception thrown! Well done";
        }finally {
            System.out.println(returnedString);
        }
    }
}
