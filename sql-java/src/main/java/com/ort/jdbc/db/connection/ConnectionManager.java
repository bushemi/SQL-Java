package com.ort.jdbc.db.connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	private static ConnectionManager _instance;
	
	public static ConnectionManager getInstance() {
		if (_instance == null) {
			_instance = new ConnectionManager();
		}
		
		return _instance;
	}
		
	private String _dbUrl;
	private String _username;
	private String _password;
	
	private Connection _connection;
	
	private ConnectionManager() {
		try (InputStream is = new FileInputStream("sql.properties");) {
			Properties p = new Properties();
			p.load(is);
			_dbUrl = p.getProperty("mysql.url", "jdbc:mysql://localhost:3306/academy");
			_username = p.getProperty("mysql.username", "root");
			_password = p.getProperty("mysql.password", "qqqq");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void openConnection() {
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			_connection = DriverManager.getConnection(_dbUrl, _username, _password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		try {
			if (_connection == null || _connection.isClosed()) {
				throw new IllegalStateException();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return _connection;
	}
	
	public void closeConnection() {
		try {
			_connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
