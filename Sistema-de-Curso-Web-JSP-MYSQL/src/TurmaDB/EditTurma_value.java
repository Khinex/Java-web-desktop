package TurmaDB;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import Model.Aluno;
import Mysql_connecting.Acesso_DB;

public class EditTurma_value {
	public Aluno get_value_of_Aluno(Aluno aluno) {
		Acesso_DB obj_Acesso_DB = new Acesso_DB();
		Connection connection=obj_Acesso_DB.get_Connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		Aluno obj_Aluno = new Aluno();
		try {
			String querry="select * from aluno where s1_no";
			ps=(PreparedStatement) connection.prepareStatement(querry);
			ps.setInt(1, aluno.getCodAluno());
			rs=(ResultSet) ps.executeQuery();
			while(rs.next()) {
				obj_Aluno.setCodAluno(rs.getInt("s1_no"));
				obj_Aluno.setEmail(rs.getString("email"));
				obj_Aluno.setNome(rs.getString("nome"));
				obj_Aluno.setTelefone(rs.getString("Telefone"));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return obj_Aluno;
	}
	
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
