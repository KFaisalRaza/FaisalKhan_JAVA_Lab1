package com.greatlearning.email_app.util;

/*
 *Custom utility class with validation methods
 */

public class ValidationUtil {
	public static boolean validateDepartmentCode(int departmentCode){

		if (departmentCode >= 1 && departmentCode <= 4) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean validateFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.isBlank())
			return true;
		else {
			return false;
		}
	}

	public static boolean validateLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.isBlank())
			return true;
		else {
			return false;
		}
	}
}
