package Atendente_DB;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

import Mysql_connecting.Acesso_DB;

public class Delete_values {
	public void delete_Values() {
		Acesso_DB obj_Acesso_DB = new Acesso_DB();
		Connection connection = obj_Acesso_DB.get_Connection();
		PreparedStatement ps=null;
		try {
			String querry="delete from user where s1_no?";
		}catch(Exception e){
			System.err.println(e);
		}
	}
}
