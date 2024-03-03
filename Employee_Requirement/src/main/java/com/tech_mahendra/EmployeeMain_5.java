package com.tech_mahendra;

public class EmployeeMain_5 {

	public static void main(String[] args) {
	EmployeeDao dao = new EmployeeDao();
	int count = dao.updateEmployee(250, 200);
	System.out.println("updated records count ......."+count);
	}

}
