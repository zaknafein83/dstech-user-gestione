package it.dstech.formazione.users.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.formazione.users.model.User;
import it.dstech.formazione.users.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {

		Iterable<User> it = userRepository.findAll();

		List<User> users = new ArrayList<User>();
		it.forEach(e -> users.add(e));

		return users;
	}

	public Long count() {

		return userRepository.count();
	}

	public void deleteById(Long userId) {

		userRepository.deleteById(userId);
	}

	@Override
	public void add(User user) {
		userRepository.save(user);
	}

	@Override
	public boolean findByUsername(User user) {
		User findByUsername = userRepository.findByUsername(user.getUsername());
		return findByUsername != null;
	}

	@Override
	public boolean findByUsernameOrEmail(User user) {
		User findByUsername = userRepository.findByUsernameOrEmail(user.getUsername(), user.getEmail());
		return findByUsername != null;
	}

}
