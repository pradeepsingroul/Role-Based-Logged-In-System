package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.Entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
