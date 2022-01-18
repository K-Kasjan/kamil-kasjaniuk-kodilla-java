package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {

    public static void main(String[] args) {
        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);*/

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("Temporary text 1", (text) -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("Temporary text 2", (text) -> text.toLowerCase()));
        System.out.println(poemBeautifier.beautify("Temporary text 3", (text) -> {
            String beautyString = "-";
            for(int i=0;i<text.length();i++){
                beautyString += text.charAt(i)+"-";
            }
            return beautyString;
        }));
        System.out.println(poemBeautifier.beautify("Temporary text 4", (text) -> {
            String beautyString = "";
            for(int i=0;i<text.length();i++){
                beautyString += text.charAt(text.length()-1 - i);
            }
            return beautyString;
        }));
    }
}