package ar.com.bateriasmateo.service;

import java.util.List;
import ar.com.bateriasmateo.domain.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
