package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
	
	public Connection get_Connection() {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_crud", "root", "root");
		}catch(Exception e) {
			System.out.println(e);
		}
		return connection;
	}
}
