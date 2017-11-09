package com.mageddo.spring.reactive.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

public class UserController {

	@GetMapping("/user/{id}")
	public Mono<User> geatUser(@PathVariable("id") int userId){

	}
}
