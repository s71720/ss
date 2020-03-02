package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import Dao.studentdao;
import Dao.studentdaose;
public class service {
	studentdaose pd=new studentdaose();

	public Map<String, ArrayList> all(int age) {
		Map<String, ArrayList> list=new HashMap<String, ArrayList>();
		
		list.put("one", (ArrayList) pd.find(age));
		return list;
	}

}
