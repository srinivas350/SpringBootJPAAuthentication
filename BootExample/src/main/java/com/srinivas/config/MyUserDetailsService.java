package com.srinivas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.srinivas.model.Users;
import com.srinivas.repositories.MyUserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private MyUserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Users user=repo.findByUsername(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("404 Not Found");
		}
		return new UserPrinciples(user);
	}

}
