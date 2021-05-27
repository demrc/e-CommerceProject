package eCommerceBackend.core;

import eCommerceBackend.googleAccount.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{
	// we writing here because of using to service
	@Override
	public void logToSystem(String message) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.log(message);
		
	}

}
