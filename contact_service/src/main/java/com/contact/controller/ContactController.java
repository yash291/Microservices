package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.services.ContactService;

@RestController
@RequestMapping("contact")
public class ContactController {

	@Autowired
	private ContactService contactService;

	// return object always : recommended
	@GetMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable Long userId) {

		return this.contactService.getContactsOfUser(userId);
	}
}
