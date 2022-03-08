package com.aadiminnovation.user.dto;

import java.util.List;

import com.aadiminnovation.user.entity.Contact;

public class UserUpdateDto extends UserCreateDto {
	protected Long id;

	protected List<Contact> contacts;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}


	
	
	
}
