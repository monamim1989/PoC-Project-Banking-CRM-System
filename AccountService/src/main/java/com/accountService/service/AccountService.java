package com.accountService.service;

import java.security.Principal;

import com.accountService.domain.PrimaryAccount;
import com.accountService.domain.SavingsAccount;

public interface AccountService {

	PrimaryAccount createPrimaryAccount();
	SavingsAccount createSavingsAccount();
	
	void deposit(String accountType, double amount, Principal principal);
	void withdraw(String accountType, double amount, Principal principal);
}
