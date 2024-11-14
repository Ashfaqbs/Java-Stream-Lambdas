package com.ashfaq.dev.prac;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P1 {

	public static void main(String[] args) {

		List<Integer> intList = List.of(1, 2, 3, 4, 5);
		int sum = intList.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum);
		Integer reduce = intList.stream().reduce(0, (a1, a2) -> a1 + a2);
//		System.out.println(reduce);

//		IntStream.range(0, 10).forEach(System.out::println);

		List<String> sampleStringnames = List.of("Sonu", "Tony", "Chintu");

		String collect = sampleStringnames.stream().collect(Collectors.joining("-", ",", "/"));
		System.out.println(collect);// ,Sonu-Tony-Chintu/

		Map<Boolean, List<String>> collect2 = sampleStringnames.stream()
				.collect(Collectors.partitioningBy(s -> s.length() > 4));

		System.out.println(collect2);// {false=[Sonu, Tony], true=[Chintu]}

	}

}
