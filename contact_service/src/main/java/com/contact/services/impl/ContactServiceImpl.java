package com.contact.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.services.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	// fake list of contacts
	List<Contact> contactList = List.of(new Contact(1L, "amit@gmail.com", "Amit", 1311L),
			new Contact(2L, "anil@gmail.com", "Anil", 1311L), new Contact(3L, "rohan@gmail.com", "Rohan", 1312L),
			new Contact(4L, "sameerl@gmail.com", "Sameer", 1314L));

	@Override
	public List<Contact> getContactsOfUser(Long userId) {

		return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());

	}

}
