package com.tech_mahendra;

public class EmployeeMain_7 {

	public static void main(String[] args) 
	{
	   EmployeeDao dao = new  EmployeeDao();
	   int count = dao.deleteByEmpSalary(500);
	   System.out.println("deleted records are ...."+count);
	}

}
