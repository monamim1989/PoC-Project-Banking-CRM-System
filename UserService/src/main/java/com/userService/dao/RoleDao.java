package com.userService.dao;

import org.springframework.data.repository.CrudRepository;

import com.userService.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {

	Role findByName(String name);
}
