package com.aulacude.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aulacude.Entities.User;
import com.aulacude.Repository.UserRepo;



@Service
public class UserDetailsServices implements UserDetailsService{
	
	
	
	@Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepo.findByEmail(username);
        if (optionalUser.isPresent()){
            User user = optionalUser.get();
            List<GrantedAuthority> authorities = new ArrayList<>();
    

            return  new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),authorities);
            
        }else throw new BadCredentialsException("User details not found with this userName :"+username);
    }

}
