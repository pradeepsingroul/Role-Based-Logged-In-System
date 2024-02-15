package com.login.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.login.Entity.Role;
import com.login.Entity.RoleType;
import com.login.exceptions.RoleException;

@Service
public class RoleServiceImpl implements RoleServices{

	@Override
	public Role createRole(RoleType name) throws RoleException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getAllRoles() throws RoleException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRoleByName(RoleType name) throws RoleException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRoleById(Long id) throws RoleException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role deleteRoleById(Long id) throws RoleException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role updateRole(Role Role) throws RoleException {
		// TODO Auto-generated method stub
		return null;
	}

}
