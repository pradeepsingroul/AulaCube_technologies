package com.aulacude.Services;

import org.springframework.stereotype.Service;

import com.aulacude.Entities.User;
import com.aulacude.Exceptions.UserExceptions;


public interface UserServices {
	
	public User registerUser(User user) throws UserExceptions;
	
	public User login(String email) throws UserExceptions;

}
