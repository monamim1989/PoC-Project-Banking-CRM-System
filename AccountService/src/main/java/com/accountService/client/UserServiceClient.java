package com.accountService.client;

import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.accountService.service.UserService;

public class UserServiceClient {
	
	private UserService userServiceClient;
	
	public UserServiceClient() {
		final String path = "http://localhost:3000"; 
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(UriBuilder.fromPath(path));
		this.userServiceClient = target.proxy(UserService.class);
	}
	
	public UserService get() {
		return this.userServiceClient;
	}

}
