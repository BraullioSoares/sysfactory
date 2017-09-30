package br.com.sigefs.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public Connection getConnection(){
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgresql://localhost/sigefs", "postgres", "1234");
		}catch(Exception e) {
			System.out.println("nao conectou");
			throw new RuntimeException(e);	
		}
	}
}
