package SISTEMA_PONTO_2;

import java.sql.SQLException;

public class SISTEMA_PONTO_Main {
	public static void main(String[] args) {
		DB_Connection DB_Connection = new DB_Connection();
		SISTEMA_PONTO_2 ponto = new SISTEMA_PONTO_2();
		UsuarioFuncionario usu = new UsuarioFuncionario(1,"gui","11111111","4568123","sdafs@gmail.com","abcd");
		UsuarioFuncionario usu2 = new UsuarioFuncionario(2,"gui2","11111111","4568123","sdafs@gmail.com","abcd");
		UsuarioFuncionario usu3 = new UsuarioFuncionario(3,"gui3","11111111","4568123","sdafs@gmail.com","abcd");
		UsuarioFuncionario usu4 = new UsuarioFuncionario(4,"gui4","11111111","4568123","sdafs@gmail.com","abcd");
		
		try {
			ponto.cadastrar(usu);
			ponto.cadastrar(usu2);
			ponto.cadastrar(usu3);
			ponto.cadastrar(usu4);
			
			ponto.read_data(2);
			
			ponto.delete_data(usu);
			
			ponto.update_data(usu4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(DB_Connection.get_connection());
		
	}
}

//mudar nome de classe usuario(excluir) para funcionario
//mudar campo para capslook ativado.
/*//criar construtor e adicionar dados
//construtor vazio e outro com os dados
/*com.mysql.jdbc.PreparedStatement@3279cf: insert into user(id,nome,cpf,telefone,email,senha) valeus (0,null,null,null,null,null)
com.mysql.jdbc.exceptions.MySQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that corresponds 
to your MySQL server version for the right syntax to use near 'valeus (0,null,null,null,null,null)' at line 1
com.mysql.jdbc.Connection@181eb93*/

/*com.mysql.jdbc.PreparedStatement@3279cf: insert into user(id,nome,cpf,telefone,email,senha) valeus (1,'gui','11111111','4568123',
 * 'sdafs@gmail.com','abcd')
 */
/*com.mysql.jdbc.exceptions.MySQLSyntaxErrorException: You have an error in your SQL syntax; check the manual that
 *  corresponds to your MySQL server version for the right syntax to use near 'valeus (1,'gui','11111111','4568123',
 *  'sdafs@gmail.com','abcd')' at line 1
 */
//com.mysql.jdbc.Connection@181eb93*/


/*
com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException


Note: This element neither has attached source nor attached Javadoc and hence no Javadoc could be found.
*/