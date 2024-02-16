package com.login.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.Entity.Role;
import com.login.Entity.RoleType;
import com.login.exceptions.RoleException;
import com.login.exceptions.UserException;
import com.login.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleServices{
	
	@Autowired
	private RoleRepository rRepo;

	@Override
	public Role createRole(Role role) throws RoleException {
		Optional<Role> opt  = rRepo.findByName(role.getName());
		if(opt.isEmpty()) return rRepo.save(role);
		else throw new RoleException("The role is Already exist....");
	}

	@Override
	public List<Role> getAllRoles() throws RoleException {
		List<Role> roles = rRepo.findAll();
		if(roles.isEmpty()) throw new RoleException("Role does not exist...");
		else return roles;
	}

	@Override
	public Role getRoleByName(RoleType name) throws RoleException {
		Optional<Role> opt  = rRepo.findByName(name);
		if(opt.isEmpty()) throw new RoleException("The role is does not exist....");
		else  {
			Role role = opt.get();
			return role;
		}
	}

	@Override
	public Role getRoleById(Long id) throws RoleException {
		Optional<Role> opt  = rRepo.findById(id);
		if(opt.isEmpty()) throw new RoleException("The role is does not exist....");
		else  {
			Role role = opt.get();
			return role;
		}
	}

	@Override
	public Role deleteRoleById(Long id) throws RoleException {
		Optional<Role> opt  = rRepo.findById(id);
		if(opt.isEmpty()) throw new RoleException("The role is does not exist....");
		else  {
			Role role = opt.get();
			rRepo.deleteById(id);
			return role;
		}
	}

	@Override
	public Role updateRole(Role role) throws RoleException {
		Optional<Role> opt = rRepo.findByName(role.getName());
		if(opt.isEmpty()) throw new UserException("The role does not exist....");
		else {
			return rRepo.save(role);
		}
	}

}
