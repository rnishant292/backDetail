package com.isf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.isf.model.db.UserDetails;
import com.isf.repo.UserDetailsRepository;

@Service
public class UserService {
	@Autowired
	private UserDetailsRepository userRepo;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JWTService jwtService;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public UserDetails register (UserDetails user){ 
		user.setUsPwd(encoder.encode(user.getUsPwd()));
		return userRepo.save(user);
	}

	
	public String verify (UserDetails user) {
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsEmail(), user.getUsPwd()));
		if(authentication.isAuthenticated()){
		
			return jwtService.generateToken(user.getUsEmail());//"login Success";
		}
		return "fail";
	}
}