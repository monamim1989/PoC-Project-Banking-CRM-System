package com.userService.service;

import java.security.Principal;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.userService.domain.PrimaryAccount;
import com.userService.domain.SavingsAccount;

@Path("/account")
public interface AccountService {

	@GET
    @Path("/primaryaccount")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	PrimaryAccount createPrimaryAccount();
	
	@GET
    @Path("/savingsaccount")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	SavingsAccount createSavingsAccount();
	
	@POST
	@Path("/deposit/{type}/{amount}")
	void deposit(@PathParam("type") String accountType, @PathParam("amount") double amount, @BeanParam Principal principal);
	
	@POST
	@Path("/withdraw/{type}/{amount}")
	void withdraw(@PathParam("type") String accountType, @PathParam("amount") double amount, @BeanParam Principal principal);
}
