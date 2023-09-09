package com.aulacude.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aulacude.Entities.User;
import com.aulacude.Services.UserServices;


@RestController
public class LoginController {
	
	@Autowired
	private UserServices userService;

	
	// login method it will take authenctication object and return user details if it exist
	@GetMapping("/users/login")
	private ResponseEntity<User> getLoggenInPlayerDetailHandler(Authentication auth){
		User player = userService.login(auth.getName());
		return new ResponseEntity<>(player,HttpStatus.ACCEPTED);
	}
	
	
}
