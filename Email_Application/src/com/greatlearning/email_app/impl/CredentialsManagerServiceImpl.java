package com.greatlearning.email_app.impl;

import java.util.Random;

import com.greatlearning.email_app.EmailApplication;
import com.greatlearning.email_app.Employee;
import com.greatlearning.email_app.interfaces.ICredentialManagerService;
/**
 * Implementation class for ICredentialManagerService
 */

public class CredentialsManagerServiceImpl implements ICredentialManagerService {

	@Override
	public String generateEmailAddress(String firstName, String lastName, int deptCode) {
		// TODO Auto-generated method stub

		StringBuilder emailAddressBuilder = new StringBuilder();
		emailAddressBuilder.append(firstName.toLowerCase());
		emailAddressBuilder.append(lastName.toLowerCase());
		emailAddressBuilder.append("@");

		if (deptCode == 1) {
			emailAddressBuilder.append("tech");
		} else if (deptCode == 2) {
			emailAddressBuilder.append("admin");
		} else if (deptCode == 3) {
			emailAddressBuilder.append("hr");
		} else if (deptCode == 4) {
			emailAddressBuilder.append("legal");
		} else {
			System.out.println("Incorrect option selected");
		}
		emailAddressBuilder.append(".gl.com");

		return emailAddressBuilder.toString();
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String smallLetters = " abcdefghijklmnopqrstuvwxyz";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String specialCharacters = "~`!@#$%^&*()_-=+{}|<,>.?/[];:'\'\\";

		StringBuilder password = new StringBuilder();
		for (int i = 1; i <= 2; i++) {
			Random obj = new Random();
			int randomValue = obj.nextInt(smallLetters.length());
			char randomCharacterValue = smallLetters.charAt(randomValue);
			password.append(randomCharacterValue);

		}
		for (int i = 1; i <= 2; i++) {
			Random obj = new Random();
			int randomValue = obj.nextInt(capitalLetters.length());
			char randomCharacterValue = capitalLetters.charAt(randomValue);
			password.append(randomCharacterValue);

		}
		for (int i = 1; i <= 2; i++) {
			Random obj = new Random();
			int randomValue = obj.nextInt(numbers.length());
			char randomCharacterValue = numbers.charAt(randomValue);
			password.append(randomCharacterValue);

		}
		for (int i = 1; i <= 2; i++) {
			Random obj = new Random();
			int randomValue = obj.nextInt(specialCharacters.length());
			char randomCharacterValue = specialCharacters.charAt(randomValue);
			password.append(randomCharacterValue);

		}

		return password.toString();
	}

	@Override
	public void displayGeneratedCredentials(Employee emp) {

		System.out.println("Dear " + emp.getFirstName() + " your generated credentials are as follows: \n"
				+ "Email    --->" + emp.getEmailAddress() + "\n" + "Password --->" + emp.getPassword());

	}

}
