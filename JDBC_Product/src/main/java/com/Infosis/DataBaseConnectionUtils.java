package com.Infosis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionUtils
{
	// This method create the connection return the connection

	public static Connection createConnection() 
	{
		Connection connection = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"," system", "nani");
			
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			
		}
		  return connection;
	}

}
