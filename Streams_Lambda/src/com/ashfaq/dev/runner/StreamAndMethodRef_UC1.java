/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.ashfaq.dev.runner;

import java.util.List;
import java.util.stream.Collectors;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.models.UserDTO;
import com.ashfaq.dev.utils.ListData;
import com.ashfaq.dev.utils.UserMapper;

public class StreamAndMethodRef_UC1 {

	public static void main(String[] args) {

		List<User> listLoader = ListData.listLoader();

//		DTO designPattern USER -> USERDTO UserMapper::maptoUserDTO

		List<UserDTO> collectUserDTO = listLoader.stream().map((data) -> UserMapper.maptoUserDTO(data))
				.collect(Collectors.toList());

		System.out.println(collectUserDTO);

		
		
		//Shorter Version of code using method refrence

		
	}

}
