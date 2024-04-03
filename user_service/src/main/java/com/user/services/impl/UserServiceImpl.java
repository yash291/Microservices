package com.user.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	// fake User List
	List<User> list = List.of(
			new User(1311L, "Yash", "234334"),
			new User(1312L, "Rudra", "992329"),
			new User(1313L, "Shyam", "888")
	);

	@Override
	public User getUser(Long id) {
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
