package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        String resultInString ="";
        try{
            resultInString = "Division result :"+firstChallenge.divide(3, 0);
        }catch(ArithmeticException ex){
            resultInString = "Do not divide by 0!";
            ex.printStackTrace();
        }finally{
            System.out.println(resultInString);
        }

    }
}