package conexao_bd;

public class TestarConexao {

	public static void main(String[] args) {
		
		Conexao con = new Conexao();
		
		con.getConnection();
		con.close();
		// TODO Auto-generated method stub

	}

}
