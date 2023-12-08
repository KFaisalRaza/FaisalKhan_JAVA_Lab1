package com.greatlearning.email_app;

import java.util.Scanner;

import com.greatlearning.email_app.impl.CredentialsManagerServiceImpl;
import com.greatlearning.email_app.invalidoperations.EmptyFirstNameException;
import com.greatlearning.email_app.invalidoperations.EmptyLastNameException;
import com.greatlearning.email_app.invalidoperations.InvalidDepartmentCodeException;
import com.greatlearning.email_app.util.ValidationUtil;
/**
 * EmailApplication class with application entry point logic
 */

public class EmailApplication {
	public void init() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter your first name");
			String firstName = sc.nextLine();
			if (ValidationUtil.validateFirstName(firstName)) {
				System.out.println("Please enter your enter last name");
				String lastName = sc.nextLine();
				if (ValidationUtil.validateLastName(lastName)) {
					System.out.println("Please enter the department from the following");
					System.out.println("1. Technical");
					System.out.println("2. Admin");
					System.out.println("3. Human Resource");
					System.out.println("4. Legal");
					int departmentCode = sc.nextInt();
					if (ValidationUtil.validateDepartmentCode(departmentCode)) {
						CredentialsManagerServiceImpl credentialManagerService = new CredentialsManagerServiceImpl();
						String emailAddress = credentialManagerService.generateEmailAddress(firstName, lastName, departmentCode);
						String password = credentialManagerService.generatePassword();
						Employee employee = new Employee(firstName, lastName, emailAddress);
						employee.setPassword(password);
						credentialManagerService.displayGeneratedCredentials(employee);
					} else {
						throw new InvalidDepartmentCodeException("Please enter a valid department code. Please try again.");
					}
				} else {
					throw new EmptyLastNameException("Last name can not be blank or empty. Please try again.");
				}
			} else {
				throw new EmptyFirstNameException("First name can not be blank or empty. Please try again.");
			}
		} catch (InvalidDepartmentCodeException | EmptyLastNameException | EmptyFirstNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
