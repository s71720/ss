package service.impl;

import Dao.Userdao;
import Dao.impel.userdaoimpl;
import service.Userservice;
import unty.User;

public class Userserviceimpl implements Userservice {
	Userdao dao=new userdaoimpl();
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}

}
