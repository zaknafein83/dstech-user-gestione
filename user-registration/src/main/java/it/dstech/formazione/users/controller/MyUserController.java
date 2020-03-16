package it.dstech.formazione.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.dstech.formazione.users.model.User;
import it.dstech.formazione.users.service.UserService;

@RestController
public class MyUserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		userService.add(user);
	}

	@GetMapping("/users")
	public List<User> allUsers() {
		return userService.findAll();
	}

	@GetMapping("/users/count")
	public Long count() {
		return userService.count();
	}

	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable String id) {
		Long userId = Long.parseLong(id);
		userService.deleteById(userId);
	}

}
