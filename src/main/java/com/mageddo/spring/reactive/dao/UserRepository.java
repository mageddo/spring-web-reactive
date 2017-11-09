package com.mageddo.spring.reactive.dao;

import com.mageddo.spring.reactive.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
	
	UserEntity findById(int userId);
}
