package com.gl.userService.dao;

import com.gl.userService.model.UserModel;

public interface UserDao {
	
	public String pushUser(UserModel userModel);
	
	public UserModel getUser(Long userId);
	
	public String updateUser(UserModel userModel);

}
