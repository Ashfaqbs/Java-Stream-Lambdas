/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.ashfaq.dev.runner;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.utils.ListData;
import com.ashfaq.dev.utils.UserMapper;

public class Limit {

	public static void main(String[] args) {
//		ListData.listLoader().stream().forEach(System.out::println);

		ListData.listLoader().stream().limit(5).forEach(System.out::println);

		ListData.listLoader().stream().limit(5).map(UserMapper::maptoUserDTO).toList();
		// dont accept -ve values , and limites till the values give and perform opt

	}

}
