package com.tech_mahendra;

public class EmployeeMain_3 {

	public static void main(String[] args) {
	EmployeeDao dao = new EmployeeDao();
	Employee emp = dao.findByEmpId("103");
	if (emp!= null)
	{
		System.out.println("data available .........");
	
		System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpSalary());
		
	}
	
	else {
		System.out.println("not avilable...........");
	}
	}

}
