/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */



package com.ashfaq.dev.runner;

import java.util.Optional;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;

public class FindingByFindFirst {

	public static void main(String[] args) {
		
		Optional<User> userWithId3byFindFirst =ListData.listLoader().stream()
		        .filter(user -> user.getId() == 3)
		        .findFirst();

		System.out.println(userWithId3byFindFirst);
		
		Optional<User> userWithId3ByFindAny =ListData.listLoader().stream()
		        .filter(user -> user.getId() == 3)
		        .findAny();
		
		System.out.println(userWithId3byFindFirst);
		
	}
}
