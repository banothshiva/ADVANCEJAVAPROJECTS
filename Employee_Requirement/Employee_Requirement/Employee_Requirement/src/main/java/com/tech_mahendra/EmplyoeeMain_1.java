package com.tech_mahendra;

public class EmplyoeeMain_1 {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		int createResult = dao . createTable();
		System.out.println("table creation status "+createResult);
	}

}
