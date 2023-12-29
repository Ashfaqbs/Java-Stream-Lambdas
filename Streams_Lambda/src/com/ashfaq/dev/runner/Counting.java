/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */



package com.ashfaq.dev.runner;

import java.util.Map;
import java.util.stream.Collectors;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;

public class Counting {
	
	public static void main(String[] args) {
		
		
		
		Map<String, Long> schoolUserCount = ListData.listLoader().stream()
		        .collect(Collectors.groupingBy(User::getSchoolName, Collectors.counting()));

System.out.println(schoolUserCount);		
		
	}

}
