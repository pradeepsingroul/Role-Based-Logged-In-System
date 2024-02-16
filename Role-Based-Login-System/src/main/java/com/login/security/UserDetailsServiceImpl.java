package com.login.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.login.Entity.User;
import com.login.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
    private UserRepository uRepo;
     
    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        Optional<User> opt = uRepo.findByEmail(email);
         
        if (opt.isEmpty()) {
            throw new UsernameNotFoundException("Could not find user");
        }
        User user = opt.get();
        return new MyUserDetails(user);
    }
 

}
