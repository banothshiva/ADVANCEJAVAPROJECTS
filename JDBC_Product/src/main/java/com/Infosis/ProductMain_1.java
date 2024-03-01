package com.Infosis;

public class ProductMain_1 {

	public static void main(String[] args) {
	ProductDao dao = new ProductDao();
	int createResult = dao.createProductTable();
	System.out.println("table creation status ...."+createResult);
	}

}

