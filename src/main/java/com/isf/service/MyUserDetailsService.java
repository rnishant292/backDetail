package com.isf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.isf.model.db.UserPrincipal;
import com.isf.repo.UserDetailsRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

@Autowired
private UserDetailsRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String usEmail) throws UsernameNotFoundException {
	
		com.isf.model.db.UserDetails user = userRepo.findByUsEmail(usEmail);
			if(user == null){
			System.out.println("User Not Found: "+user.getUsEmail()+usEmail+user);
			throw new UsernameNotFoundException("User Not Found");	
		}
		return new UserPrincipal(user);
	  }
}