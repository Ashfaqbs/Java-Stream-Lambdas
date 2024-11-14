package com.ashfaq.dev.prac;

import java.util.Arrays;
import java.util.List;

public class StringLenth {

	public static void main(String[] args) {
		String[] sampleStrings = { "Hey", "Developer", "GM" };

		List<Integer> list = Arrays.stream(sampleStrings).map(data -> {
			return data.length();
		}).toList();

		System.out.println(list);
	}

}
