package com.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.login.Entity.User;
import com.login.services.UserServices;

@RestController
@RequestMapping("/api/v3")
public class UserController {
	
	@Autowired
	private UserServices uServices;
	
	@PostMapping("/users/new")
	public ResponseEntity<User> createNewUser(@RequestBody User user){
		System.out.println("I am new....");
		User user1 = uServices.createUser(user);
		return new ResponseEntity<User>(user1, HttpStatus.CREATED);
	}
	
	@GetMapping("/usersByEmail/{email}")
	public ResponseEntity<User> UserByEmail(@PathVariable("email") String email){
		User user = uServices.getUserByEmail(email);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> UserById(@PathVariable("id") Long id){
		User user = uServices.getUserById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	
	@PutMapping("/users/update")
	public ResponseEntity<User> updateUserEntity(@RequestBody User user){
		User user1 = uServices.updateUser(user);
		return new ResponseEntity<User>(user1, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/users/delete/{email}")
	public ResponseEntity<User> deletEntity(@PathVariable("id") Long id){
		User user1 = uServices.deleteUserById(id);
		return new ResponseEntity<User>(user1, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsersEntity(){
		List<User> users = uServices.getAllUsers();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	
	
	
	
	

}
