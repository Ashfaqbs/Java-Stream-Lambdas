/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */



package com.ashfaq.dev.runner;

import java.util.List;
import java.util.stream.Collectors;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;

public class SimpleMapping {

	public static void main(String[] args) {
		
		List<String> userNames =ListData.listLoader().stream()
		        .map(User::getfName)
		        .collect(Collectors.toList());

		System.out.println(userNames);
	}
	
}
