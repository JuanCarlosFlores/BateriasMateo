package com.bateriasMateo.service;

import java.util.List;

import com.bateriasMateo.domain.Role;

public interface RoleService {
	public Role findRoleByRole(String name);
	public void saveRole(Role role);
	public List<Role> getAll();
	
	public void delete(Role role);
	
}
