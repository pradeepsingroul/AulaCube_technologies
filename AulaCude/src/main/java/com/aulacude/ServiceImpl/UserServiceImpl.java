package com.aulacude.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulacude.Entities.User;
import com.aulacude.Exceptions.UserExceptions;
import com.aulacude.Repository.UserRepo;
import com.aulacude.Services.UserServices;

@Service
public class UserServiceImpl implements UserServices{
	

	@Autowired
	private UserRepo userRepository;
	

	

	@Override
	public User login(String email) throws UserExceptions {
		Optional<User> opt = userRepository.findByEmail(email);
		 if(opt.isPresent()){
	        return opt.get();
	     }else{
	        throw new UserExceptions("user does not exist..");
	     }
		
		
	}

	@Override
	public User registerUser(User user) throws UserExceptions {
		Optional<User> opt = userRepository.findByEmail(user.getEmail());
		if(opt.isEmpty()) {
			return userRepository.save(user);
		}else {
			throw new UserExceptions("User already exist with the email :"+user.getEmail());
		}
	}

}
