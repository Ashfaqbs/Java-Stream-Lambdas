package com.ashfaq.dev.prac;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrpByOddOrEven {

	public static String isEven(int n) {

		return (n % 2 == 0) ? "Even" : "Odd";

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		Map<String, List<Integer>> collect = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(GrpByOddOrEven::isEven));

		System.out.println(collect);

		Map<Boolean, List<Integer>> collect2 = Arrays.stream(arr).boxed()
				.collect(Collectors.partitioningBy((d) -> d % 2 == 0));

		System.out.println(collect2);

	}

}
