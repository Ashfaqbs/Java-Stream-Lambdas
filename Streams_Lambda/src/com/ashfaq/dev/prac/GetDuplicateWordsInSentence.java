package com.ashfaq.dev.prac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetDuplicateWordsInSentence {

	public static void main(String[] args) {

		String x = "this an that this an";

		HashMap<String, Integer> map = new HashMap<>();

		String[] stringArr = x.split(" ");

		for (int i = 0; i < stringArr.length; i++) {
			if (map.containsKey(stringArr[i])) {

				map.put(stringArr[i], map.get(stringArr[i]) + 1);

			} else {
				map.put(stringArr[i], 1);
			}

		}

		map.entrySet().stream().filter(data -> data.getValue() > 1).forEach(System.out::println);

//		Or 
		LinkedHashMap<String, Long> collect = Arrays.stream(stringArr)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		collect.entrySet().stream().filter(data -> data.getValue() > 1).forEach(System.out::println);

	}

}
