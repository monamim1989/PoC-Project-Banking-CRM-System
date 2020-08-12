package com.userService.client;

import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.userService.service.AccountService;

public class AccountServiceClient {
	
	private AccountService accountServiceClient;
	
	public AccountServiceClient() {
		final String path = "http://localhost:4000"; 
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(UriBuilder.fromPath(path));
		this.accountServiceClient = target.proxy(AccountService.class);
	}
	
	public AccountService get() {
		return this.accountServiceClient;
	}

}
