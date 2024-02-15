package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.Entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
