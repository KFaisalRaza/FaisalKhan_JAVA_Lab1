package com.greatlearning.email_app;

import com.greatlearning.email_app.impl.CredentialsManagerServiceImpl;

/**
 * Driver class to launch the application
 */
public class Main {
	public static void main(String[] args) {

		EmailApplication emailApplication = new EmailApplication();
		emailApplication.init();

	}

	/**
	 * Test method for testing application launch
	 */
	static void testApplication() {

		EmailApplication emailApplication = new EmailApplication();

		emailApplication.init();
	}

	/**
	 * Test method for testing email address generation
	 */
	static void testEmailAddressGeneration() {

		CredentialsManagerServiceImpl obj = new CredentialsManagerServiceImpl();

		String emailAddress = obj.generateEmailAddress("Faisal", "Khan", 1);

		System.out.println(emailAddress);

	}

	/**
	 * Test method for testing password generation
	 */
	static void testPasswordGeneration() {

		CredentialsManagerServiceImpl obj = new CredentialsManagerServiceImpl();

		String password = obj.generatePassword();

		System.out.println(password);
	}
}
