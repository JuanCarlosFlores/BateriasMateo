package com.bateriasMateo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bateriasMateo.domain.Role;
import com.bateriasMateo.domain.User;
import com.bateriasMateo.repository.RoleRepository;
import com.bateriasMateo.service.RoleService;

public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;
    @Autowired
    
	@Override
	public Role findRoleByRole(String name) {
		return roleRepository.findByRole(name);
	}

	@Override
	public void saveRole(Role role) {
		roleRepository.save(role);
	}

	@Override
	public List<Role> getAll() {
		Iterable <Role> source = roleRepository.findAll();
		List<Role> target = new ArrayList<>();
		source.forEach(target::add);
		return target;
	}

	@Override
	public void delete(Role role) {
		roleRepository.delete(role);
		
	}

}
