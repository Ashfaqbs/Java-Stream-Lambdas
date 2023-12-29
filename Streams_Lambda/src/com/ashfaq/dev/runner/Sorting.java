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

		List<User> sortedByNameAESC = ListData.listLoader().stream().sorted(Comparator.comparing(User::getfName))
				.collect(Collectors.toList());
		
		sortedByNameAESC.stream().forEach(System.out::println);
		
		System.out.println();
		List<User> sortedByNameDESC = ListData.listLoader().stream().sorted(Comparator.comparing(User::getfName).reversed())
				.collect(Collectors.toList());
		
		sortedByNameDESC.stream().forEach(System.out::println);

	}
}
