package eCommerceBackend.business.concretes;

import eCommerceBackend.business.abstracts.UserService;
import eCommerceBackend.business.abstracts.ValidityService;
import eCommerceBackend.business.abstracts.VerificationService;
import eCommerceBackend.entities.concretes.User;

public class UserManager implements UserService {

	
	private ValidityService validityService;
	private VerificationService verificationService;
	
	
	public UserManager( ValidityService validityService, VerificationService verificationService) {
		super();
		
		this.validityService = validityService;
		this.verificationService = verificationService;
	}
	

	
	

	@Override
	public void register(User user) {
		if(validityService.checkEmail(user.getEmail()) && validityService.checkFirstName(user.getFirstName())
				&&validityService.checkLastName(user.getLastName())&& validityService.checkPassword(user.getPassword()
						)&&verificationService.isEmailValid(user.getEmail())) {
			System.out.println("Verification mail is sent your email adress, please approve it.");
			System.out.println("Verification is successful.");
			
		}
		
	}

	@Override
	public void login(User user) {
		if(verificationService.isEmailValid(user.getEmail()) &&validityService.checkPassword(user.getPassword())) {
			System.out.println("Login is successful.");
		}
		else {
			System.out.println("Login is not valid.");
		}
	}

}
