package com.security.filters;

import java.io.IOException;
import java.time.Instant;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuditLogFilter implements Filter {
	
	public static final Logger log = LoggerFactory.getLogger(AuditLogFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info("Manager Login Detected at {} ",Instant.now());
		chain.doFilter(request, response);
	}
	
	@Override
	public void init(FilterConfig filterconfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}
}
