package com.ashfaq.dev.prac;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordOccurrenceAnalyzer {
	public static void main(String[] args) {
		String filePath = "src/com/ashfaq/dev/utils/sample.txt"; // Path to the file

		try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
			// Analyze word occurrences

			Map<String, Integer> wordCount = lines.flatMap(line -> Stream.of(line.split("\\W+"))) // Split by non-word
																									// characters
					.filter(word -> !word.isEmpty()) // Filter out empty words
					.map(String::toLowerCase) // Convert words to lowercase
					.collect(Collectors.toMap(word -> word, // Key: the word
							word -> 1, // Value: initial count
							Integer::sum // Merge function for duplicates
					));

			// Print the word occurrences
			wordCount.forEach((word, count) -> System.out.println(word + ": " + count));

		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}
	}
}
