/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.ashfaq.dev.runner;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;

public class Sorting {

	public static void main(String[] args) {

		List<User> sortedByName = ListData.listLoader().stream().sorted(Comparator.comparing(User::getfName))
				.collect(Collectors.toList());
		
		System.out.println(sortedByName.stream().forEach(System.out::println));

	}
}
