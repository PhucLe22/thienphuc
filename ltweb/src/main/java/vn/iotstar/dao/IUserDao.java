package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.models.UserModel;

public interface IUserDao {
	List<UserModel> findAll();
	UserModel findById(int id);
	
	void insert(UserModel user);
	//draft
	UserModel FindByUserName(String username);
}
