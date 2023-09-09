package com.aulacude.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulacude.Entities.User;
import com.aulacude.Exceptions.UserExceptions;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	public Optional<User> findByEmail(String email) throws UserExceptions;
}
