package com.employee.service.create;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeCreationRequest {
	
	@Size(max = 50)
	private String firstName;

	@Size(max = 50)
	private String lastName;
	
	@NotNull(message = "email id can't be null")
	@NotEmpty(message = "email id can't be empty")
	@Size(min = 5, max = 50, message = "Invalid length for email")
	@Pattern(message = "Invalid email id", regexp = "^.+@.+\\..+$")
	private String emailId;
	
	@Size(max = 2)
	private String age;
	
	@Size(max = 10)
	private String gender;
	
	@Size(max = 100)
	private String address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
