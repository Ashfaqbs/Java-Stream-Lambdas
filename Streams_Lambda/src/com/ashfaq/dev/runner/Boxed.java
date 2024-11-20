package com.ashfaq.dev.runner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Boxed {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

//	In Java 8 streams, 
//	the boxed() method is used to convert a stream of primitive types (e.g., IntStream, LongStream, DoubleStream)
//	into a stream of their corresponding wrapper classes (e.g., Stream<Integer>, Stream<Long>, Stream<Double>)

//		Arrays.stream(arr).collect(Collectors.toList());
//		Compilation issue Type mismatch: cannot convert from Collector<Object,capture#1-of ?,List<Object>> to Supplier<R>

		// converts int to Integer
		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(collect);
	}
}
