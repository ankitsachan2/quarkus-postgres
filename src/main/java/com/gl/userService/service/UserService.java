package com.gl.userService.service;

import com.gl.userService.model.UserModel;

public interface UserService {
	
	public String pushUser(UserModel userModel);
	
public UserModel getUser(Long userId);
	
	public String updateUser(UserModel userModel);

}
