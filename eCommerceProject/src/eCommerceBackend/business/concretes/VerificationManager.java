package eCommerceBackend.business.concretes;

import eCommerceBackend.business.abstracts.VerificationService;
import eCommerceBackend.dataAccess.abstracts.UserDao;

public class VerificationManager implements VerificationService {
	UserDao userDao;
	
	public void UserDao(UserDao userDao) {
		this.userDao=userDao;
	}
	@Override
	public boolean isEmailValid(String email) {
		
		return true;
	}

}
