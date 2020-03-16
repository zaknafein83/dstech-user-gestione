package it.dstech.formazione.users.service;

import java.util.List;

import it.dstech.formazione.users.model.User;

public interface UserService {
	List<User> findAll();

	Long count();

	void deleteById(Long userId);

	void add(User user);
}
