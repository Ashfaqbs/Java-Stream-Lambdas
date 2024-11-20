package com.ashfaq.dev.runner;

import java.util.List;

public class MaptoObject {

	public static void main(String[] args) {
		// converting String to char list using mapToObj
		String appleString = "Apple";
		List<Character> list = appleString.chars().mapToObj(x -> (char) x).toList();
		System.out.println(list); //[A, p, p, l, e]

	}

}
