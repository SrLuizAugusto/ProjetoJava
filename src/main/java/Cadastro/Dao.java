package Cadastro;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	Connection con;  // Conexao ao Banco de Dados
	PreparedStatement stmt; // Acessa a Tabela ( insert, update, delete , select)
	ResultSet rs; // Consulta a Tabela( select )
	CallableStatement call; // Procedures e Function
	
	public void open() throws Exception{
	    String url = "jdbc:mysql://localhost:3306/cadastros";
	    String user = "root";
	    String password = "";
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con = DriverManager.getConnection(url,user,password);
	    } catch (SQLException | ClassNotFoundException ex) {
	        System.out.println("Erro ao conectar com o banco");
	    }
	}
	
	public void close() throws Exception{		
		con.close();
	}
}