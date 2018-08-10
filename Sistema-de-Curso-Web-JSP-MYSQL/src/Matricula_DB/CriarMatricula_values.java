package Matricula_DB;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

import Model.Aluno;
import Mysql_connecting.Acesso_DB;

public class CriarMatricula_values {
	public void insert(Aluno aluno) {
		Acesso_DB obj_Acesso_DB = new Acesso_DB();
		Connection connection = obj_Acesso_DB.get_Connection();
		PreparedStatement ps=null;
		
		try {
			String query = "insert into user(s1_no, user_name, email, mobile) values(?,?,?,?)";
			ps=(PreparedStatement) connection.prepareStatement(query);
			ps.setInt(1, aluno.getCodAluno());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getEmail());
			ps.setString(4, aluno.getTelefone());
		}catch(Exception e){
			System.err.println(e);
		}
	}
}
