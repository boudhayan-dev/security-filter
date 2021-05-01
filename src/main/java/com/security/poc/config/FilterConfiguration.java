//package com.security.poc.config;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.filter.DelegatingFilterProxy;
//
//import com.security.filters.LogFilter;
//
//@Configuration
//public class FilterConfiguration {
//	
//	
//	@Bean
//	public FilterRegistrationBean<DelegatingFilterProxy> getDelegatFilterRegistrationBean(){
//		DelegatingFilterProxy delegateFilterProxy = new DelegatingFilterProxy(new LogFilter());
//		FilterRegistrationBean<DelegatingFilterProxy> regBean = new FilterRegistrationBean<>(delegateFilterProxy);
//		regBean.setOrder(-150);
//		regBean.setName("LoggerDelegatingFilterProxy");
////		regBean.addUrlPatterns("**");
//		return regBean;
//		
//	}
//}
