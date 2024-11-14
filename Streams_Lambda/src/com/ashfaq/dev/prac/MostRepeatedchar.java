package com.ashfaq.dev.prac;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedchar {

	public static void main(String[] args) {

		String dataString = "ajajaqlk";

		List<Character> list = dataString.chars().mapToObj(data -> (char) data).toList();

		Map<Character, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Set<Entry<Character, Long>> entrySet = collect.entrySet();

//		System.out.println(entrySet);
//		[q=1, a=3, j=2, k=1, l=1]

//		System.out.println(collect.keySet());
//		[q, a, j, k, l]

//		System.out.println(collect.values());
//		[1, 3, 2, 1, 1]

		Long long1 = entrySet.stream().map((z) -> {
			return z.getValue();
		}).sorted(Comparator.reverseOrder()).findFirst().get();
//		System.out.println(long1);

		Entry<Character, Long> entry = entrySet.stream().filter(c -> c.getValue().equals(long1)).findFirst().get();
		System.out.println(entry);

	}

}
