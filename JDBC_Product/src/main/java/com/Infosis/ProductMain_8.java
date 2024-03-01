package com.Infosis;

public class ProductMain_8 {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		int count = dao.droptable();
		System.out.println("TABLE DROPED ...."+count);
	}

}
