package com.accountService.client;

import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.accountService.service.TransactionService;

public class TransactionServiceClient {
	
private TransactionService transactionServiceClient;
	
	public TransactionServiceClient() {
		final String path = "http://localhost:5000"; 
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(UriBuilder.fromPath(path));
		this.transactionServiceClient = target.proxy(TransactionService.class);
	}
	
	public TransactionService get() {
		return this.transactionServiceClient;
	}

}
