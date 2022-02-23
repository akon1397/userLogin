package com.cloud.userLogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cloud.userLogin.model.User;
import com.cloud.userLogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);
	

}
