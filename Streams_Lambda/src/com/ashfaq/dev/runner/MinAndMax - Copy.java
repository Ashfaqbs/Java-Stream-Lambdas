/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.ashfaq.dev.runner;

import java.util.Comparator;
import java.util.Optional;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;

public class MinAndMax {

	public static void main(String[] args) {

		Optional<User> min = ListData.listLoader().stream().min(Comparator.comparing(User::getId));
		System.out.println(min);
		Optional<User> max = ListData.listLoader().stream().max(Comparator.comparing(User::getId));

		System.out.println(max);

	}
}
