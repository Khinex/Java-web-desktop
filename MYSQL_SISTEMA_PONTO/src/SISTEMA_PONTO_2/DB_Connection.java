package SISTEMA_PONTO_2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
	
	public Connection get_connection() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SISTEMA_PONTO_2","root","root");
		}catch(Exception e){
			System.out.println(e);
		}
		return connection;
	}
	
}
