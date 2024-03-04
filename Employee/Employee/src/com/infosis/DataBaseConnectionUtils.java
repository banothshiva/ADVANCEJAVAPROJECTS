package com.infosis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionUtils {

	public static Connection createConnection() 
	{
	@SuppressWarnings("unused")
	Connection connection = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nani");
		} catch ( ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
