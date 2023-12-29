/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */



package com.ashfaq.dev.utils;

import com.ashfaq.dev.models.User;
import com.ashfaq.dev.models.UserDTO;

public class UserMapper {

	
	public static User maptoUser(UserDTO dto)
	{
		return new User(dto.getId(), dto.getfName(),dto.getlName(), dto.getSchoolName());
	}
}
