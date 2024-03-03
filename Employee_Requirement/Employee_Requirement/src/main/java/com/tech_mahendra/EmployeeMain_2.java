package com.tech_mahendra;
 public class EmployeeMain_2
{
   public static void main(String[] args) {
	   EmployeeDao dao = new EmployeeDao();
		Employee emp = new Employee();
		emp.setEmpId("205");
		emp.setEmpName("vijayamma");
		emp.setEmpSalary(250.20);
	    int result = dao.saveEmployee(emp);
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
