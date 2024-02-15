package com.login.services;

import java.util.List;

import com.login.Entity.Role;
import com.login.Entity.User;
import com.login.exceptions.UserException;

public class UserServicesImpl  implements UserServices{

	@Override
	public User createUser(String name, String password, List<Role> roles) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName(String name) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Long id) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserById(Long id) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
