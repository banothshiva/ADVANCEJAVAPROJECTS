package com.infosis;
public class EmployeeMain_01
{

	public static void main(String[] args)
	{
		EmployeeDao dao = new EmployeeDao();
		int createResult = dao . createEmptable();
		System.out.println("table creation status "+createResult);
	}
}