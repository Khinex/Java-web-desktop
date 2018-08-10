package Matricula_DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import Model.Aluno;
import Mysql_connecting.Acesso_DB;

public class ConsultarMatricula_values {
	public List get_Consulta() {
		Acesso_DB obj_Acesso_DB = new Acesso_DB();
		Connection connection = obj_Acesso_DB.get_Connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		List list = new ArrayList();
		try {
			String querry = "select * from Matricula";
			ps=(PreparedStatement) connection.prepareStatement(querry);
			rs=ps.executeQuery();
			while(rs.next()) {
				Aluno obj_Aluno = new Aluno(); 
				System.out.println(rs.getString("s1_no"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("mobile"));
				obj_Aluno.setCodAluno(rs.getInt("s1_no"));
				obj_Aluno.setEmail(rs.getString("email"));
				obj_Aluno.setNome(rs.getString("nome"));
				obj_Aluno.setTelefone(rs.getString("Telefone"));
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return list;
		}

}
