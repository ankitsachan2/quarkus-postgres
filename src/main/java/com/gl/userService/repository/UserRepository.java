package com.gl.userService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.userService.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	Optional<UserEntity> findByUserId(Long user_id);

}
