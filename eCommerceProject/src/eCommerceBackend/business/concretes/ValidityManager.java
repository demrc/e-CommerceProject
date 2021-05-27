package eCommerceBackend.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceBackend.business.abstracts.ValidityService;

public class ValidityManager implements ValidityService{

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length()<2) {
			System.out.println("Name is not valid.");
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length()<2) {
			System.out.println("Last name is not valid.");
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean checkEmail(String email) {
		String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()) {
        	System.out.println("Use another email adress.");
        	return false;
        }
        else {
        return true;
        }
		
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length()<6) {
			System.out.println("Password is not valid.");
			return false;
		}
		else {
			return true;
		}
		
	}

}
