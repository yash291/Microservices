package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {

		User savedUser = this.userService.getUser(userId);
		// http://localhost:9002/contact/user/1311

		List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/" + savedUser.getUserId(),
				List.class);
		
		savedUser.setContacts(contacts);
		return savedUser;
	}

}
