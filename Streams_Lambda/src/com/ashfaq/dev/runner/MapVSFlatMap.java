package com.ashfaq.dev.runner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVSFlatMap {
//	In Java, map() and flatMap() are both methods used for transforming elements
//	in a stream, but they serve different purposes and are used in different scenarios.
//
//	map(): This method applies a given function to each element of a stream and returns a 
//	new stream containing the results. It is used when you want to transform each element of a 
//	stream into a single new element. For example, you might use map() to square each number in a 
//	list of integers.
//	flatMap(): This method is similar to map(), but it takes
//	a function that returns a stream for each element of the original stream. It then flattens 
//	these streams into a single stream. This is useful when each element of the original stream can be 
//	transformed into multiple elements. For example, you might use flatMap() to flatten a list of lists into a single list.

	public static void main(String[] args) {
//		This code squares each number in the list.

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(squares);

//		This code flattens a list of lists into a single list.

		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
		List<Integer> flattenedList = listOfLists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(flattenedList);

	}

}
