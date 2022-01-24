package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .forEach(System.out::println);
        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();
//        can be replaced with
//        double average = Arrays.stream(numbers).asDoubleStream()
//                .average().getAsDouble();
        System.out.println(average);
        return average;
    }
}
