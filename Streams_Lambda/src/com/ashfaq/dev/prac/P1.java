package com.ashfaq.dev.prac;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;

public class P1 {

	public static void main(String[] args) {

//		List<Integer> intList = List.of(1, 2, 3, 4, 5);
//		int sum = intList.stream().mapToInt(Integer::intValue).sum();
////		System.out.println(sum);
//		Integer reduce = intList.stream().reduce(0, (a1, a2) -> a1 + a2);
////		System.out.println(reduce);
//
////		IntStream.range(0, 10).forEach(System.out::println);
//
//		List<String> sampleStringnames = List.of("Sonu", "Tony", "Chintu");
//
//		String collect = sampleStringnames.stream().collect(Collectors.joining("-", ",", "/"));
//		System.out.println(collect);// ,Sonu-Tony-Chintu/
//
//		Map<Boolean, List<String>> collect2 = sampleStringnames.stream()
//				.collect(Collectors.partitioningBy(s -> s.length() > 4));
//
//		System.out.println(collect2);// {false=[Sonu, Tony], true=[Chintu]}

		int reduce = IntStream.range(1, 11).reduce(0, (a, b) -> a + b);

//		ListData.listLoader().stream().map(User::getfName).forEach(System.out::println);

//		FunctionalInterface -> apply
//		Predicate -> test
//		Consumer -> accept 
//		Supplier -> get

//		User USer = ListData.listLoader().stream().filter(data -> data.getId() == 100).findAny().orElseGet(() -> {
//			return new User();
//		});
//		System.out.println(USer);

//		List<User> collect = ListData.listLoader().stream().limit(10).collect(Collectors.toList());

		Map<User, Long> collect2 = ListData.listLoader().stream().limit(5)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect2);

		Map<String, Long> schoolCollect = ListData.listLoader().stream().limit(5)
				.collect(Collectors.groupingBy(User::getSchoolName, Collectors.counting()));

//		System.out.println(schoolCollect);

//		ListData.listLoader().stream().limit(5).sorted(Comparator.comparing(User::getlName).reversed())
//				.forEach(System.out::println);

		User user = ListData.listLoader().stream().limit(5).max(Comparator.comparing(User::getId)).get();
		System.out.println(user);

		String x = "abcj";
		
		

	}

}
