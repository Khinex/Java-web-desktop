package CRUD;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import common.DB_Connection;

public class Insert_Values {
	
	public void insert_values(String s1_no, String user_name,String email, String mobile) {
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = (Connection) obj_DB_Connection.get_Connection();
		
		PreparedStatement ps = null;
		
		try {
			String query = "insert into user(s1_no, user_name,email,mobile) values(?,?,?,?)";
			ps = (PreparedStatement) connection.prepareStatement(query);
			
			ps.setString(1, s1_no);
			ps.setString(2, user_name);
			ps.setString(3, email);
			ps.setString(4, mobile);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e);
		}
		
	}
}
