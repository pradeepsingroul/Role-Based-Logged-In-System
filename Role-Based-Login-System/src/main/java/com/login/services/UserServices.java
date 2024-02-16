package com.login.services;

import java.util.List;

import com.login.DTO.LoginDTO;
import com.login.Entity.User;
import com.login.exceptions.UserException;

public interface UserServices {
	
	User createUser(User user) throws UserException;
	
	User loginUser(LoginDTO login) throws UserException;

	List<User> getAllUsers()throws UserException;

	User getUserByEmail(String email) throws UserException;

	User getUserById(Long id) throws UserException;

	User deleteUserById(Long id) throws UserException;

	User updateUser(User user) throws UserException;

	
}
