/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */



package com.ashfaq.dev.runner;

import java.util.List;
import java.util.stream.Collectors;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;

public class Filtering {
 public static void main(String[] args) {
	
	 List<User> highSchoolAUsers = ListData.listLoader().stream()
		        .filter(user -> "High School A".equals(user.getSchoolName()))
		        .collect(Collectors.toList());

	 System.out.println(highSchoolAUsers);
	 
}
}
