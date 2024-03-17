package com.ashfaq.dev.runner;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using reduce to sum all numbers in the list
        Integer sum = numbers.stream()
                             .reduce(0, (total, number) -> total + number);

        // Printing the sum
        System.out.println("The sum of all numbers is: " + sum);
    }
}

//In this example, reduce() takes two parameters:
//
//Identity: The initial value. In this case, it's 0 because we're summing up numbers and we start from 0.
//Accumulator: A BiFunction where you specify how to combine two elements. Here, it takes two integers (total and number) 
//and returns their sum. This function is applied repeatedly across the stream to cumulate the result.
//In layman's terms, think of reduce() as a process where you start with an initial value (0 in this case),
//and then go through each element in the list, adding each element's value to a running total. After you've gone
//through all elements, you end up with the final sum.
//
//reduce() is a powerful operation that can be used for more than just summing numbers; it can combine elements of a 
//		stream in any manner you define, allowing for great flexibility in processing sequences of data.