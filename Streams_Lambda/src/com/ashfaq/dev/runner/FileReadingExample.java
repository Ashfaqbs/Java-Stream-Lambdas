package com.ashfaq.dev.runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReadingExample {
	public static void main(String[] args) {
		// Define the path to the file
		Path filePath = Paths.get("src/com/ashfaq/dev/utils/sample.txt");

		// Use a try-with-resources block to ensure proper resource management
//		The Files.lines() method is designed to handle large files efficiently. It reads the file line by line, processing one line at a time instead of loading the entire file into memory.
//		Files.lines(): Reads the file lazily as a Stream of lines (Stream<String>). Each line of the file is an element in the Stream.

		try (Stream<String> lines = Files.lines(filePath)) {
			// Process each line from the file
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		 in Spring-based projects
//		The ClassPathResource is part of the Spring Framework and makes it easy to load resources without worrying about the exact file location.
		// Create a ClassPathResource instance for the file
//		ClassPathResource resource = new ClassPathResource("sample.txt");
//
//		// Read the file using InputStream
//		try (InputStream inputStream = resource.getInputStream();
//				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
//
//			// Read all lines and collect them as a single string
//			String content = reader.lines().collect(Collectors.joining("\n"));
//			System.out.println("File Content:");
//			System.out.println(content);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
