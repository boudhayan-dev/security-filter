//package com.security.poc.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity(debug = true)
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.sessionManagement().disable();
//		http.cors().disable();
//		http.csrf().disable();
//		http.logout().disable();
//		http.requestCache().disable();
//		http.authorizeRequests().antMatchers("api/v1/employee/**").permitAll();
//	}
//}
