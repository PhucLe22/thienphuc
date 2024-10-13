package vn.iotstar.servies.impl;

import vn.iotstar.dao.IUserDao;
import vn.iotstar.dao.impl.UserDaoImpl;
import vn.iotstar.models.UserModel;
import vn.iotstar.servies.IUserService;

public class UserService implements IUserService {
	// Get all funtions from Dao class
	IUserDao userDao = new UserDaoImpl();

	@Override
	public UserModel login(String username, String password)
	{
		UserModel user = this.FindByUserName(username);

		if (user != null && password.equals(user.getPassword())) {
			return user; 
		}
		return null; 
	}

	@Override
	public UserModel FindByUserName(String username) {
		// User DAO to find user in user name
		return userDao.FindByUserName(username);
	}
	
	public static void main(String[] args)
	{
		IUserService userService = new UserService();
		System.out.println(userService.FindByUserName("Phuc"));
	}
}
