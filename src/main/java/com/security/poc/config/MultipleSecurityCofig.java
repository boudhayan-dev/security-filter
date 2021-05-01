package com.security.poc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

import com.security.filters.AuditLogFilter;

@Configuration
@EnableWebSecurity(debug=true)
public class MultipleSecurityCofig extends WebSecurityConfigurerAdapter {
	
	@Order(1)
	@Configuration
	public  static class EmployeeConfig extends WebSecurityConfigurerAdapter{

		@Override
		protected void configure(HttpSecurity http) throws Exception {		
			http.antMatcher("/api/v1/employee/**").authorizeRequests().antMatchers("/api/v1/employee/**").permitAll()
			.and().sessionManagement().disable()
			.cors().disable()
			.csrf().disable()
			.logout().disable()
			.requestCache().disable()
			.headers().disable();
		}
	}

	@Order(2)
	@Configuration
	public static class ManagerConfig extends WebSecurityConfigurerAdapter{
		
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.antMatcher("/api/v1/manager/**").authorizeRequests().antMatchers("/api/v1/manager/**").permitAll()
			.and().addFilterAfter(new AuditLogFilter(), FilterSecurityInterceptor.class);
		}
		
	}

}