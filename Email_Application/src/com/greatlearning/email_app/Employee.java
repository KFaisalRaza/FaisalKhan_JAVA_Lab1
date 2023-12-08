package com.greatlearning.email_app;

/**
 * Employee POJO class with constructors,getters and setters
 */

public class Employee {
	String firstName, lastName, emailAddress;
	private String password;
	int departmentcode;

	public Employee(String firstName, String lastName, String emailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getDepartmentcode() {
		return departmentcode;
	}

	public void setDepartmentcode(int departmentcode) {
		this.departmentcode = departmentcode;
	}

}
