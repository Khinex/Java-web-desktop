package Mysql_connecting;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Acesso_DB {

public Connection get_Connection() {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crud-jsp-mysql", "root", "root");
		}catch(Exception e) {
			System.out.println(e);
		}
		return connection;
	}

}
