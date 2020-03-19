package com.gl.userService.dao;

import java.util.Optional;

import javax.inject.Inject;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Repository;

import com.gl.userService.entity.UserEntity;
import com.gl.userService.model.UserModel;
import com.gl.userService.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Inject
	UserRepository userRepo;

	@Override
	public String pushUser(UserModel userModel) {
		// TODO Auto-generated method stub
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity = mapper.map(userModel, UserEntity.class);
		
		Optional<UserEntity> optUser = userRepo.findById(userModel.getUserId());
		
		if(!optUser.isPresent()) {
			
			userRepo.save(userEntity);
			return " user record created succesfully";
		}
		return "user alreday Available";
	}

	@Override
	public UserModel getUser(Long userId) {
		// TODO Auto-generated method stub
		
		Optional<UserEntity> optionalEntity = userRepo.findByUserId(userId);
		if(optionalEntity.isPresent()) {
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			UserModel userModel = mapper.map(optionalEntity.get(), UserModel.class);
			return userModel;
		}
		
		UserModel model = new UserModel();
		model.setUserName("user Not Availabe");
		return model;
	}

	@Override
	public String updateUser(UserModel userModel) {
		// TODO Auto-generated method stub
		
		Optional<UserEntity> optionalEntity = userRepo.findByUserId(userModel.getUserId());
		if(optionalEntity.isPresent()) {
			UserEntity userEntity = optionalEntity.get();
			userEntity.setUserName(userModel.getUserName());
			userEntity.setUserDetails(userModel.getUserDetails());
			
			userRepo.save(userEntity);
			
			return "user Updated successfully";
			
		}
		return "user Not Avaible";
		
	}

}
