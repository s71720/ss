package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Dao.studentdao;
import enity.studentenity;

public class studentdaose extends studentdao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	public List<studentenity> find(int age) {
		List<studentenity> list=new ArrayList<studentenity>();
		
		try {
			conn=getConnection();
			String sql="SELECT `name`,number,age FROM student WHERE age=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, age);
			System.out.println(age);
			rs=pst.executeQuery();
			while(rs.next()) {

				list.add(new studentenity(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	

}
