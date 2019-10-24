package conexao_bd;

import java.sql.*;

public class Conexao {
	
	public Connection connection = null;
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String DBNAME = "cadastro";
	private final String URL = "jdbc:mysql://localhost:3306/"+DBNAME;
	private final String LOGIN = "root";
	private final String SENHA = "rose@2001";
	
	
	public boolean getConnection() {
		try {
			
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, LOGIN, SENHA);
			System.out.println("Conexão realizada com sucesso");
			return true;
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não encontrado "+e.toString());
			return false;
		}
		catch(Exception e) {
			System.out.println("Falha ao conectar "+e.toString());
			return false;
		}
	}
	
	public void close() {
		try {
			connection.close();
			System.out.println("Desconexao realizada com sucesso");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
