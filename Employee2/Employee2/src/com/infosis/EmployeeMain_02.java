package com.infosis;
public class EmployeeMain_02
{
   public static void main(String[] args) {
	   EmployeeDao dao = new EmployeeDao();
		Employee emp = new Employee();
		emp.setEmpId("103");
		emp.setEmpName("DEVA");
		emp.setEmpSalary(222.20);
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
