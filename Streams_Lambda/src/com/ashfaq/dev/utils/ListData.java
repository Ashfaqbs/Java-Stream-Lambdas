/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.ashfaq.dev.utils;

import java.util.ArrayList;
import java.util.List;

import com.ashfaq.dev.models.User;

public class ListData {

	public static List<User> listLoader() {

		List<User> sampleUserList = new ArrayList<>();

		sampleUserList.add(new User(1, "Anil", "Samal", "SchoolA"));
		sampleUserList.add(new User(2, "Sonu", "Samal", "SchoolB"));
		sampleUserList.add(new User(3, "Monu", "Samal", "SchoolA"));
		sampleUserList.add(new User(4, "Monty", "Samal", "SchoolC"));
		sampleUserList.add(new User(5, "Chintu", "Samal", "SchoolB"));
		sampleUserList.add(new User(6, "Jony", "Samal", "SchoolA"));
		sampleUserList.add(new User(7, "Sony", "Samal", "SchoolB"));
		sampleUserList.add(new User(8, "Katy", "Samal", "SchoolB"));

		return sampleUserList;
	}

}
