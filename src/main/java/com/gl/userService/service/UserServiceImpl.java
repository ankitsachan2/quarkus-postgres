package com.gl.userService.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.userService.dao.UserDao;
import com.gl.userService.model.UserModel;
@RequestScoped
public class UserServiceImpl implements UserService{
	
	@Inject
	UserDao userDao;
	
	@Override
	public String pushUser(UserModel userModel) {
		// TODO Auto-generated method stub
		return userDao.pushUser(userModel);
	}

	@Override
	public UserModel getUser(Long userId) {
		// TODO Auto-generated method stub
		return userDao.getUser(userId);
	}

	@Override
	public String updateUser(UserModel userModel) {
		// TODO Auto-generated method stub
		return userDao.updateUser(userModel);
	}

}
