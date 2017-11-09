package com.mageddo.spring.reactive.controller;

import com.mageddo.spring.reactive.dao.UserRepository;
import com.mageddo.spring.reactive.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class UserController {

	private UserRepository userRepository;

	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseEntity<UserEntity> geatUser(@PathVariable("id") int userId){
		return ResponseEntity.ok(userRepository.findById(userId));
	}
}
