package Aluno_db;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

import Model.Aluno;
import Mysql_connecting.Acesso_DB;

public class Delete_values {
	public Aluno aluno;
	
	public void delete(Aluno aluno) {
		Acesso_DB obj_acesso_DB = new Acesso_DB();
		Connection connection = obj_acesso_DB.get_Connection();
		PreparedStatement ps = null;
		try {
			String query = "delete from user where s1_no = ?"; 
			ps=(PreparedStatement) connection.prepareStatement(query);
			ps.setInt(1, aluno.getCodAluno());
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
