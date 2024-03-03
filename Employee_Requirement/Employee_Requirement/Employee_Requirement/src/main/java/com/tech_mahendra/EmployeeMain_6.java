package com.tech_mahendra;

public class EmployeeMain_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao = new EmployeeDao();
		int count = dao.deleteByEmpid("201");
		System.out.println("deleted records count ..."+count);

	}

}
