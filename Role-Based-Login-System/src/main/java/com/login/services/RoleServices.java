package com.login.services;

import java.util.List;

import com.login.Entity.Role;
import com.login.Entity.RoleType;
import com.login.exceptions.RoleException;


public interface RoleServices {

	Role createRole(Role role) throws RoleException;

	List<Role> getAllRoles()throws RoleException;

	Role getRoleByName(RoleType name) throws RoleException;

	Role getRoleById(Long id) throws RoleException;

	Role deleteRoleById(Long id) throws RoleException;

	Role updateRole(Role Role) throws RoleException;

}
