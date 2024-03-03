package com.tech_mahendra;

public class EmployeeMain_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao dao = new EmployeeDao();
		int count = dao.droptable();
		System.out.println("droped table records are ..."+count);
	

	}

}
