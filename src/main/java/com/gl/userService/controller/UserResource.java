package com.gl.userService.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;

import com.gl.userService.model.UserModel;
import com.gl.userService.service.UserService;

@Path(value = "/user")
public class UserResource {
	
	@Inject
	UserService userService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String pushUser(UserModel userModel) {

		String user = userService.pushUser(userModel);
		return user;
	}

	@Path(value = "/{userId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UserModel getUser(@PathParam(value = "userId") Long userId) {

		UserModel user = userService.getUser(userId);
		return  user;

	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUser(UserModel userModel) {

		return userService.updateUser(userModel);
	}
	  
	 

}
