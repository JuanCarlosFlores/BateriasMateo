package com.bateriasMateo.service;

import java.util.List;
import com.bateriasMateo.domain.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public List<User> getAll();
}
