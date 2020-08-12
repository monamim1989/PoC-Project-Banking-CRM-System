package com.userService.service;

import java.util.List;
import java.util.Set;

import com.userService.domain.PrimaryAccount;
import com.userService.domain.SavingsAccount;
import com.userService.domain.User;
import com.userService.security.UserRole;

public interface UserService {
	
	User findByUsername(String username);
	User findByEmail(String email);
	
	boolean checkUserExists(String username, String email);
	boolean checkUsernameExists(String username);
	boolean checkEmailExists(String email);
	
	void save(User user);
	User createUser(User user, Set<UserRole> userRoles, PrimaryAccount pa, SavingsAccount sa);
	User saveUser(User user);
	
	List<User> findUserList();

    void enableUser (String username);

    void disableUser (String username);
}
