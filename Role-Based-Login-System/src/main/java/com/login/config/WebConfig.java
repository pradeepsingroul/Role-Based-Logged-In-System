package com.login.config;

import org.springframework.context.annotation.*;
import org.springframework.security.authentication.dao.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.login.security.UserDetailsServiceImpl;
import org.springframework.security.config.annotation.web.configuration.*;

@Configuration
public class WebConfig extends WebSecurityConfiguration{

	

	
}