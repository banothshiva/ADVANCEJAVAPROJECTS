package com.Infosis;

import java.sql.SQLException;

public class ProductMain_6 {

	public static void main(String[] args) throws SQLException {
		ProductDao dao = new ProductDao();
		int count = dao.deleteById("101");
		System.out.println("DATA DELETED RECORDS are BY PROID ...."+count);
	}

}
