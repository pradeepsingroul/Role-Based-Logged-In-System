package com.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.DTO.LoginDTO;
import com.login.Entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

	Optional<User> findByEmail(String email);
	

	Optional<User> findByEmailAndPassword(String email, String password);

	
}
