package com.tech_mahendra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDao 
{
	public int createTable() 
	{
		Connection connection = null;
		Statement statement = null;
		int result =0;
		try
		{
			// create the connection object
			connection = DataBaseConnectionUtils.createConnection();
			// create the statement object
			statement = connection.createStatement();
			String query = "create table emp_info( empId varchar2(100) primary key,  empName varchar2(100),empSalary number)";
		// passing query into the execute update
			result = statement.executeUpdate(query);
		}
		catch (SQLException e)
		{
		   e.printStackTrace();
		}
	return result;
	}

	public int saveEmployee(Employee e)
	{
		int result = 0;
		try (Connection connection = DataBaseConnectionUtils.createConnection())
		{
			//create the preparedStatement object with params
			PreparedStatement  preparedStatement = connection.prepareStatement(" insert into emp_info values(?,?,?)");
			// set the data in params 
			preparedStatement.setString(1, e.getEmpId());
			preparedStatement.setString(2, e.getEmpName());
           preparedStatement.setDouble(3, e.getEmpSalary());
           
          // execute the query
           result = preparedStatement.executeUpdate();
		} 
		catch (SQLException p) 
		{
			p.printStackTrace();
		}
		return result;
	}
	public Employee findByEmpId( String EmpId  )
	{
		 Employee emp  = null;
		try(Connection connection = DataBaseConnectionUtils.createConnection())
		{
			// create the prepared statement object 
			PreparedStatement preparedStatement = connection.prepareStatement("select * from emp_info where empId = ?");
			// set the data in params 
		preparedStatement.setString(1, "EmpId");
		// execute the query 
		 ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{
			// read the data from the resultSet and setting the data into Employee
			emp.setEmpId(resultSet.getString(1));
			emp.setEmpName(resultSet.getString(2));
			emp.setEmpSalary(resultSet.getDouble(3));
		}
		 
	} 
		catch (SQLException e) 
		{
			// TODO: handle exception 
			e.printStackTrace();
		}
		return emp;
	}
	public List<Employee> findAll()
	{
	List<Employee> employees = new ArrayList<Employee>();
	Employee emp = null;
	try(Connection connection = DataBaseConnectionUtils.createConnection())
	{
		// create the  Statement object
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from emp_info");
		while(resultSet.next()) {
			// read the data from the resultSet object and setting the employee
			emp = new Employee();
			emp.setEmpId(resultSet.getString(1));
			emp.setEmpName(resultSet.getString(2));
			emp.setEmpSalary(resultSet.getDouble(3));
			// adding the employee into the list
			employees.add(emp);
		
		}
		
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return employees;
	
	
	}
	public int updateEmployee(double empSalary,double incValue )
	{
		int result = 0;
		try(Connection connection = DataBaseConnectionUtils.createConnection())
		{
			// create the prepared Statement object
			PreparedStatement preparedStatement = connection.prepareStatement("update emp_info set empSalary = empSalary +? where empSalary >?");
			// set the data in params 
			preparedStatement.setDouble(1, incValue);
			preparedStatement.setDouble(2, empSalary);
			
			// execute the query
			result  = preparedStatement.executeUpdate();
		} 
		catch ( SQLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
		
	}
	public int deleteByEmpid(String empId)
	{
		int result = 0;
		try(Connection connection = DataBaseConnectionUtils.createConnection()) 
		{
			// create the ps object
			PreparedStatement preparedStatement = connection.prepareStatement(" delete from emp_info where empId =?");
			//set the data pa
			preparedStatement.setString(1, empId);
			// execute the query
			result = preparedStatement.executeUpdate();
			
		}
		catch ( SQLException e)
		{
           e.printStackTrace();
		}	
		return result;
		
		
	}
	public int deleteByEmpSalary(double empSalary)
	{
		int result = 0;
		//try with resources 
		try(Connection connection = DataBaseConnectionUtils.createConnection())
		{
			// create the ps object
			PreparedStatement preparedStatement = connection.prepareStatement("delete from emp_info where empSalary >=?");
			//set the data in params 
			preparedStatement.setDouble(1, empSalary);
			// execute the query
			result = preparedStatement.executeUpdate();
			
		}
		catch (SQLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
		
	}
	public int droptable()
	{
		int result = 0;
		//try with 
		try (Connection connection = DataBaseConnectionUtils.createConnection())
		{
			//create the statement object
			Statement  statement = connection.createStatement();
			//execute the query
	         result  = statement.executeUpdate("drop table emp_info");
	
		}
		catch (SQLException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

}
