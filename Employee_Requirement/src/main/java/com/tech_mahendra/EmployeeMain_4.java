package com.tech_mahendra;

import java.util.List;

public class EmployeeMain_4 {

	public static void main(String[] args) {
	EmployeeDao dao = new EmployeeDao();
	List<Employee> employees = dao.findAll();
	employees.forEach(Employee->System.out.println(Employee));

	}

}
