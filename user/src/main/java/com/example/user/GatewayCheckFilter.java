package com.example.user;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@Order(1)
public class GatewayCheckFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		boolean isFromGateway = isRequestFromGateway(request);
		if (isFromGateway) {
			filterChain.doFilter(servletRequest, servletResponse);
		} else {
			servletResponse.getWriter().write("Access Denied.");
			((HttpServletResponse) servletResponse).setStatus(HttpServletResponse.SC_FORBIDDEN);
		}
	}

	private boolean isRequestFromGateway(HttpServletRequest request) {
		String forwardedHost = request.getHeader("X-Forwarded-Host");
		return (forwardedHost != null && !forwardedHost.isEmpty());
	}
}
