package com.ashfaq.dev.prac;

public class Sum {
	public static void main(String[] args) {

		Calc x = (a, b) -> {

			return a + b;
		};

		int sum = x.add(1, 2);
		System.out.println(sum);

	}
}

interface Calc {

	int add(int a, int b);
}