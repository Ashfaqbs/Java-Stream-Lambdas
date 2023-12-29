/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */



package com.ashfaq.dev.runner;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;

public class AveragingAndSumming {

	
	public static void main(String[] args) {
		
		
		double averageFirstNameLength = ListData.listLoader().stream()
		        .mapToInt(user -> user.getfName().length())
		        .average()
		        .orElse(0.0);

		
		int sumOfUserIds = sampleUserList.stream()
		        .mapToInt(User::getId)
		        .sum();

		
	}
}
