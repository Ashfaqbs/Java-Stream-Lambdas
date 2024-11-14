package com.ashfaq.dev.prac;

public class Test {

	static int strToInt(String data) {
		if (data.length() <= 0)
			;
//		throw exception

		int sum = 0;
		
		

		for (int i = 0; i < data.length(); i++) {
//			sum += (data.charAt(i) - '0');

			sum += (data.charAt(i)-'0') * (int)Math.pow(10,data.length()-i-1 );
			
		}

		System.out.println(sum);

		return 0;

	}

	public static void main(String[] args) {

		String dataString = "2345";

		strToInt(dataString);

	}
}
