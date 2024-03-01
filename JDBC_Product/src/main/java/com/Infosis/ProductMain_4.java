package com.Infosis;

import java.util.List;

public class ProductMain_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ProductDao dao = new ProductDao();
		List<Product>products = dao.findAll();
		products.forEach(Product -> System.out.println(Product));
	}

}
