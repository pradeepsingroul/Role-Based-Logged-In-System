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

import org.springframework.web.bind.annotation.RestController;

import com.login.Entity.Role;
import com.login.Entity.RoleType;
import com.login.services.RoleServices;


@RestController
@RequestMapping("/api/v3/")
public class RoleController {
	
	@Autowired
	private RoleServices rServices;
	
	@PostMapping("/roles/new")
	public ResponseEntity<Role> createNewRole(@RequestBody Role role){
		Role role1 = rServices.createRole(role);
		return new ResponseEntity<Role>(role1, HttpStatus.CREATED);
	}
	
	@GetMapping("/roles/{role}")
	public ResponseEntity<Role> RoleByEmail(@PathVariable("role") RoleType role){
		Role role1 = rServices.getRoleByName(role);
		return new ResponseEntity<Role>(role1, HttpStatus.OK);
	}
	
	@GetMapping("/roles/{id}")
	public ResponseEntity<Role> RoleByEmail(@PathVariable("id") Long id){
		Role role = rServices.getRoleById(id);
		return new ResponseEntity<Role>(role, HttpStatus.OK);
	}
	
	
	@PutMapping("/roles/update")
	public ResponseEntity<Role> updateRoleEntity(@RequestBody Role role){
		Role role1 = rServices.updateRole(role);
		return new ResponseEntity<Role>(role1, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/roles/delete/{id}")
	public ResponseEntity<Role> deletEntity(@PathVariable("id") Long id){
		Role role1 = rServices.deleteRoleById(id);
		return new ResponseEntity<Role>(role1, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/roles")
	public ResponseEntity<List<Role>> getAllRolesEntity(){
		List<Role> roles = rServices.getAllRoles();
		return new ResponseEntity<List<Role>>(roles, HttpStatus.OK);
	}
	
	
	
	
	
	

}
