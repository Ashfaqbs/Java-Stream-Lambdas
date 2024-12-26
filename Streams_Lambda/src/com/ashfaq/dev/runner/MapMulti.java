package com.ashfaq.dev.runner;

import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Stream;

public class MapMulti {
	public static void main(String[] args) {
//		// Example of a hypothetical zip method
//		Stream<String> stream1 = Stream.of("Java", "Kotlin", "Scala");
//		Stream<Integer> stream2 = Stream.of(8, 11, 15);
//
//		Stream<SimpleEntry<String, Integer>> zippedStream = Stream.zip(stream1, stream2, SimpleEntry::new);
//
//		zippedStream.forEach(pair -> System.out.println(pair.getKey() + " - " + pair.getValue()));
//		// Output might be:
//		// Java - 8
//		// Kotlin - 11
//		// Scala - 15

		// Example of a hypothetical mapMulti method
		Stream<String> languages = Stream.of("Java 8", "Kotlin 1.3", "Scala 2.13");

		Stream<String> versionStream = languages.mapMulti((language, consumer) -> {
			String[] parts = language.split("\\s");
			consumer.accept(parts[0]); // Language name
			consumer.accept(parts[1]); // Version number
		});

		versionStream.forEach(System.out::println);
		// Output might be:
		// Java
		// 8
		// Kotlin
		// 1.3
		// Scala
		// 2.13
	}
}
