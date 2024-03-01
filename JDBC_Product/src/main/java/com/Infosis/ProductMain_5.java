package com.Infosis;

import java.sql.SQLException;

public class ProductMain_5 {

	public static void main(String[] args) throws SQLException 
	{
		ProductDao dao = new ProductDao();
		int count = dao . updateProduct(500, 5);
		System.out.println("UPDATED RECORDS COUNT .."+count);
				
	}

}
