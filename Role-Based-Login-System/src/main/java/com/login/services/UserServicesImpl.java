package com.login.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.login.Entity.User;
import com.login.exceptions.UserException;
import com.login.repository.UserRepository;

@Service
public class UserServicesImpl  implements UserServices{
	
	@Autowired
	private UserRepository uRepo;

	@Override
	public User createUser(User user) throws UserException {
		Optional<User> opt = uRepo.findByEmail(user.getEmail());
		if(opt.isEmpty()) {
			return uRepo.save(user);
		}else {
			throw new UserException("User already exist with the email: "+user.getEmail());
		}
	}

	@Override
	public List<User> getAllUsers() throws UserException {
		List<User> users = uRepo.findAll();
		if(users.isEmpty()) throw new UserException("Users does not exist....");
		else return users;
		
	}

	@Override
	public User getUserByEmail(String email) throws UserException {
		Optional<User> opt = uRepo.findByEmail(email);
		if(opt.isEmpty()) throw new UserException("User does not exist with the email: "+email);
		else {
			User user = opt.get();
			return user;
		}
	}

	@Override
	public User getUserById(Long id) throws UserException {
		Optional<User> opt = uRepo.findById(id);
		if(opt.isEmpty()) throw new UserException("User does not exist with the Id: "+id);
		else {
			User user = opt.get();
			return user;
		}
	}

	@Override
	public User deleteUserById(Long id) throws UserException {
		Optional<User> opt = uRepo.findById(id);
		if(opt.isEmpty()) throw new UserException("User does not exist with the Id: "+id);
		else {
			User user = opt.get();
			user.setActive(false);
			return uRepo.save(user);
		}
	}

	@Override
	public User updateUser(User user) throws UserException {
		Optional<User> opt = uRepo.findByEmail(user.getEmail());
		if(opt.isEmpty()) throw new UserException("User does not exist with the email: "+user.getEmail());
		else {
			return uRepo.save(user);
		}
	}

}
