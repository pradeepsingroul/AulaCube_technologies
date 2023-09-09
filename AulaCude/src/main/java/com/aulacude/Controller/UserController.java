package com.aulacude.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aulacude.Entities.User;
import com.aulacude.Repository.UserRepo;
import com.aulacude.Services.UserServices;

@RestController
public class UserController {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserServices userService;

	// by this method we are registering to the user by passing the user details
	@PostMapping("/users")
    public ResponseEntity<User> registerPlayerHandler(@RequestBody User user){
		user.setPassword(passwordEncoder.encode(user.getPassword()));
        User player1 = userService.registerUser(user);
        return new ResponseEntity<>(player1, HttpStatus.CREATED);
    }
	
}
