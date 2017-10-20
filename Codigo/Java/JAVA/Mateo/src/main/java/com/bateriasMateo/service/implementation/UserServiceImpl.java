package com.bateriasMateo.service.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bateriasMateo.domain.Bateria;
import com.bateriasMateo.domain.Role;
import com.bateriasMateo.domain.User;
import com.bateriasMateo.repository.RoleRepository;
import com.bateriasMateo.repository.UserRepository;
import com.bateriasMateo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        
        Role userRole = roleRepository.findByRole("ADMIN");
        
        user.setRole(userRole);
        //user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}
	@Override
	public List<User> getAll() {	
		Iterable <User> source = userRepository.findAll();
		List<User> target = new ArrayList<>();
		source.forEach(target::add);
		return target;
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
		
	}

	@Override
	public User get(Long pId) {
		return userRepository.findOne(pId);
	
	}
	
}
