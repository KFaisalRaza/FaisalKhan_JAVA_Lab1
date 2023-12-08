package com.greatlearning.email_app.interfaces;

import com.greatlearning.email_app.Employee;

/**
 * ICredentialManagerService interface with abstract methods
 */
public interface ICredentialManagerService {
	String generateEmailAddress(String firstName, String lastName, int deptCode);

	String generatePassword();

	void displayGeneratedCredentials(Employee emp);
}
