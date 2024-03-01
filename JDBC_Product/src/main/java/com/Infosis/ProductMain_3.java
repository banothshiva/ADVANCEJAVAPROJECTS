package com.Infosis;

public class ProductMain_3 
{
	
	public static void main(String[] args) 
	{
		ProductDao dao = new ProductDao();
				Product  product = dao.findById("102");
				if (product != null)
				{
					System.out.println("product avilable ........");
					System.out.println(product.getProId()+"\t"+product.getProName()+"\t"+product.getProPrice());
				}
				
				else
				{
					System.out.println("product is not avilable............ ");
				}
				
				
	}
}
