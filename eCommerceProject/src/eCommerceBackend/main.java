package eCommerceBackend;

import eCommerceBackend.business.abstracts.UserService;
import eCommerceBackend.business.concretes.UserManager;
import eCommerceBackend.business.concretes.ValidityManager;
import eCommerceBackend.business.concretes.VerificationManager;
import eCommerceBackend.entities.concretes.User;

public class main {

	public static void main(String[] args) {
		UserService userService=new UserManager(new ValidityManager(), new VerificationManager());
		User user1 = new User(1,"asda","dasd","asdausygdh@gmadksja.com","98562");
		User user2 = new User(5,"a2sda","dasasdd","asasfdadgddausygdh@gmadksja.com","9638562");
		User user3 = new User(4,"asda","uhdasd","auysdausygdh@gmadksja.com","14798562");
		
		userService.register(user1);
		userService.register(user2);
		userService.register(user3);
		
		
	
	}

}
