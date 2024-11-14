package com.ashfaq.dev.prac;

import java.util.stream.Collectors;

public class RemoveUnderScore {
	public static void main(String[] args) {
		String sampleString = "Hey_Developer_GM";

		String collect = sampleString.chars().mapToObj(x -> (char) x).toList().stream().filter(d -> d != '_')
				.map(d -> d.toString()). // need to do as character cannot use joining func so need to convert to char
				collect(Collectors.joining());

		System.out.println(collect);

	}
}
