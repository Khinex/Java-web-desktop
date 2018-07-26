package SISTEMA_PONTO_2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class SISTEMA_PONTO_2 {
	public void cadastrar(UsuarioFuncionario usuario) throws SQLException  {
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="insert into UsuarioFuncionario(ID,NOME,CPF,TELEFONE,EMAIL,SENHA) values (?,?,?,?,?,?)";//erro
			ps=connection.prepareStatement(query);//erro
			
			 ps.setInt(1, usuario.getId());
			 ps.setString(2, usuario.getNome());
			 ps.setString(3, usuario.getCpf());
			 ps.setString(4, usuario.getTelefone());
			 ps.setString(5, usuario.getEmail());
			 ps.setString(6, usuario.getSenha());
			 ps.executeUpdate();
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void read_data(int Id){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			String query="select ID, NOME, EMAIL from UsuarioFuncionario";
			ps=connection.prepareStatement(query);
			//ps.setString(1, sl_no);
			System.out.println(ps);
			rs=ps.executeQuery();
			while(rs.next()){
			System.out.println("id -"+rs.getString("ID"));
			System.out.println("nome -"+rs.getString("NOME"));
			System.out.println("email -"+rs.getString("EMAIL"));
			System.out.println("---------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void delete_data(UsuarioFuncionario usuario){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="delete from UsuarioFuncionario where ID=?";
			ps=connection.prepareStatement(query);
			ps.setInt(1, usuario.getId());
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void update_data(UsuarioFuncionario usuario){
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="update UsuarioFuncionario set ID = ?,NOME=?, CPF = ?, TELEFONE = ?, EMAIL=?, SENHA = ? where sl_no=?";
			ps=connection.prepareStatement(query);
			ps.setInt(1, usuario.getId());
			ps.setString(2, usuario.getNome());
			ps.setString(3, usuario.getCpf());
			ps.setString(4, usuario.getTelefone());
			ps.setString(5, usuario.getEmail());
			ps.setString(6, usuario.getSenha());
			//ps.setInt(7, id);
			//ps.setString(8, nova_senha);
			//senha, int id novo_id, String nova_senha
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//inserir 
	
	
	/*DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.get_connection();
		PreparedStatement ps=null;
		try {
			String query="insert into UsuarioFuncionario(ID,NOME,CPF,TELEFONE,EMAIL,SENHA) values (?,?,?,?,?,?)";
			ps=connection.prepareStatement(query);
			
			 ps.setInt(1, usuario.getId());
			 ps.setString(2, usuario.getNome());
			 ps.setString(3, usuario.getCpf());
			 ps.setString(4, usuario.getTelefone());
			 ps.setString(5, usuario.getEmail());
			 ps.setString(6, usuario.getSenha());
			 ps.executeUpdate();
			System.out.println(ps);
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}*/
	
}
