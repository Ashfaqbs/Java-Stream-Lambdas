package com.ashfaq.dev.prac;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String dataString = "alnad";

		Optional<Entry<Character, Long>> first = dataString.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(d -> d.getValue() == 1).findFirst();

		if (first.isPresent()) {
			System.out.println(first);
		} else {
			System.out.println(-1);
		}

		// this by default gives hashmap where the orderd is not so we need to use
		// Linkedhashmap

		Optional<Entry<Character, Long>> first2 = dataString.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(d -> d.getValue() == 1).findFirst();

		if (first2.isPresent()) {
			System.out.println(first2);
		} else {
			System.out.println(-1);
		}
		
	}
}
