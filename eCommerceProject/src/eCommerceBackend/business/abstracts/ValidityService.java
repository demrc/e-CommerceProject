package eCommerceBackend.business.abstracts;

public interface ValidityService {
	boolean checkFirstName(String firstName);
	boolean checkLastName(String lastName);
	boolean checkEmail(String email);
	boolean checkPassword(String password);

}
