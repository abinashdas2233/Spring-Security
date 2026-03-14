package com.kodewish.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewish.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);

}
