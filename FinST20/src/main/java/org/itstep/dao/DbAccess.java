package org.itstep.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbAccess {

	private static final String URL = "jdbc:postgresql://localhost:5432/MY_DB";
	private static final String userName = "postgre";
	private static final String password = "248842";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(URL, userName, password);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
		return connection;
	}
}
