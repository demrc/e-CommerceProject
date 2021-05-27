package eCommerceBackend.dataAccess.concretes;

import java.util.List;

import eCommerceBackend.dataAccess.abstracts.UserDao;
import eCommerceBackend.entities.concretes.User;

public class AnyUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("User added= "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("User updated= "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted= "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
