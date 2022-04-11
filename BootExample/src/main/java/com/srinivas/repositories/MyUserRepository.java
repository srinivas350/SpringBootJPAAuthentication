package com.srinivas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srinivas.model.Users;

public  interface MyUserRepository extends JpaRepository<Users, Long> {
	
	public Users findByUsername(String username);

}
