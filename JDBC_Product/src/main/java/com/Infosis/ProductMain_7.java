package com.Infosis;

public class ProductMain_7 {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		int count = dao.DeleteByPrice(200);
		System.out.println("DATA DELETED BY BASED ON LESS THEN PRO PRICE "+count);
	}

}
