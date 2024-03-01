package com.Infosis;

public class ProductMain_2 
{

	public static void main(String[] args)
	{
		ProductDao dao = new ProductDao();
		Product product1 = new Product();
		product1.setProId("102");
		product1.setProName("tharun");
		product1.setProPrice(500.20);
	    int result = dao.saveProduct(product1);
	    if (result == 1)
	    {
		System.out.println("Data Inserted Successfully");
		
     	}
	     else 
	     {
		System.out.println("data not inserted  fail try with some valid data ");
	      }

	}

}
