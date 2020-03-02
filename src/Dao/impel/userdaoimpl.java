package Dao.impel;

import java.util.ArrayList;
import java.util.List;

import Dao.Userdao;
import unty.User;

public class userdaoimpl implements Userdao {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		//用户信息
		List<User> list =new ArrayList<User>();
		list.add(user);
		for(User user2 : list) {
			System.out.println(user2.getName()+","+user2.getAge());
		}
	}

}
