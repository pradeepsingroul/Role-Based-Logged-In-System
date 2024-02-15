package com.login.services;

import java.util.List;

import com.login.Entity.Role;
import com.login.Entity.User;
import com.login.exceptions.UserException;

public interface UserServices {
	
	User createUser(String name, String password, List<Role> roles) throws UserException;
	List<User> getAllUsers()throws UserException;
	User getUserByName(String name) throws UserException;
	User getUserById(Long id) throws UserException;
	User deleteUserById(Long id) throws UserException;
	User updateUser(User user) throws UserException;
	
}
