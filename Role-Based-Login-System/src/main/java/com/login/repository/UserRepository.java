package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.Entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
