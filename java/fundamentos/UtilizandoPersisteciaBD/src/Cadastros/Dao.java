package Cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	Connection con;  // Conexão com o banco de dados
	PreparedStatement stmt; // Acesso à tabela (insert, update, delete , select)
	ResultSet rs; // Consulta à tabela (select)
	CallableStatement call; // Procedures e Function
	
	public void open() throws Exception{
	    String url = "jdbc:postgresql://localhost:5432/cadastros";
	    String user = "postgres";
	    String password = "1234";
	    try {
	        Class.forName("org.postgresql.Driver");
	        con = DriverManager.getConnection(url, user, password);      
	    } catch (SQLException | ClassNotFoundException ex) {
	        System.out.println("Erro na conexão com o banco.");
	    }
	}
	
	public void close() throws Exception{		
		con.close();
	}
}