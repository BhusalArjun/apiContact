package com.aadiminnovation.user.dto;

import java.util.List;

public class UserCreateDto {
	protected String name;
	protected String email;
	protected String password;
	protected String mobileNumber;
	protected String dob;
	protected String address;

	protected List<ContactDto> contactDtos;
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<ContactDto> getContactDtos() {
		return contactDtos;
	}

	public void setContactDtos(List<ContactDto> contactDtos) {
		this.contactDtos = contactDtos;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}


}
