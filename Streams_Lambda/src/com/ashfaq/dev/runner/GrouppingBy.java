/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */



package com.ashfaq.dev.runner;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;

public class GrouppingBy {
	
	public static void main(String[] args) {
		
		List<User> listLoader = ListData.listLoader();
		
		
		Map<String, List<User>> collect = listLoader.stream().collect(Collectors.groupingBy(User::getSchoolName));
		
		
		System.out.println(collect);
		
	}

}
