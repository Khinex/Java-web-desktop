package Matricula_DB;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import Model.Aluno;
import Mysql_connecting.Acesso_DB;

public class EditarMatricula_values {
	public List get_value() {
		Acesso_DB obj_Acesso_DB = new Acesso_DB();
		Connection connection = obj_Acesso_DB.get_Connection();
		PreparedStatement ps=null;
		ResultSet rs = null;
		List list = new ArrayList();
		try {
			String querry = "select * from aluno_db where s1_no=?";
			ps=(PreparedStatement) connection.prepareStatement(querry);
			rs=(ResultSet) ps.executeQuery();
			while(rs.next()) {
				//refazer
				Aluno obj_aluno = new Aluno();
				System.out.println(rs.getString("s1_no"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getString("Nome"));
				System.out.println(rs.getString("Telefone"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	public void edit_aluno(Aluno obj_Aluno) {
		Acesso_DB obj_AcessoDB = new Acesso_DB();
		Connection connection=obj_AcessoDB.get_Connection();
		PreparedStatement ps = null;
		try {
			String querry = "update user set user_name=?, email=?, telefone=? where s1_no";
			ps=(PreparedStatement) connection.prepareStatement(querry);
			ps.setString(1, obj_Aluno.getNome());
			ps.setString(2, obj_Aluno.getEmail());
			ps.setString(3, obj_Aluno.getTelefone());
			ps.setInt(4, obj_Aluno.getCodAluno());
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
}
