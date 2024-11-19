package com.ashfaq.dev.prac;

import java.util.Arrays;
import java.util.Comparator;

public class SortString {

	public static void main(String[] args) {

		String[] arr = { "Apple", "Ball", "Dog", "Cat" };

		Arrays.stream(arr).sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

	}

}
