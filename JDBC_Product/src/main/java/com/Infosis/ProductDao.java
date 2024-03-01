package com.Infosis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao
{
	
	public int createProductTable()
	{
		Connection connection = null;
		Statement statement = null;
		int  result = 0;
		try {
			connection = DataBaseConnectionUtils.createConnection();
			statement = connection.createStatement();
			String query = "create table product_data(proId number Primary key, proName varchar2(50),proPrice number)";
			result = statement.executeUpdate(query);
		} 
		catch (SQLException e)
		{
		   e.printStackTrace();
		}
		return result;
		
	}
	public int saveProduct(Product p)
	{
		int result = 0;
		// Try with resources no need to the close the connection 
		try(Connection connection = DataBaseConnectionUtils.createConnection()) 
		{
			// create the prepared statement object
			PreparedStatement preparedStatement = connection.prepareStatement("insert into  product_data values(?,?,?)");
			// set the data in the params
			preparedStatement.setString(1, p.getProId());
			preparedStatement.setString(2, p.getProName());
			preparedStatement.setDouble(3, p.getProPrice());
			result = preparedStatement.executeUpdate();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			
		}
		
		return result;
		}
	public Product findById( String proId )
	{
		Product p = null;
		// Try with resources no need to the close the connection 
				try(Connection connection = DataBaseConnectionUtils.createConnection()) 
				{
					// create the prepared statement object
					PreparedStatement preparedStatement = connection.prepareStatement("select * from  product_data where proId = ?");
					// set the data in the Params
					preparedStatement.setString(1, proId );
					// Execute the query
				     ResultSet	resultSet = preparedStatement.executeQuery();
				
				
				   if(resultSet.next())
			     	{
					   // read the data from the resultSet object setting in to the 
					   p = new Product(); 
					   p.setProId(resultSet.getString(1));
					   p.setProName(resultSet.getString(2));
					   p.setProPrice(resultSet.getDouble(3));
					
				    }
				
			   }
				catch(SQLException e) 
				{
					e.printStackTrace();
				}
				
				return p;
				}
	public List <Product>findAll()
	{
		List <Product> products = new ArrayList<Product>();
		Product p = null;
		// Try with resources no need to the close the connection 
				try(Connection connection = DataBaseConnectionUtils.createConnection()) 
				{
					// create the prepared statement object
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from product_data ");
			while(resultSet.next())
			{
				//read the data from the resultSet and setting the to product
	             	p = new Product();
				p.setProId(resultSet.getString(1));
				p.setProName(resultSet.getString(2));
				p.setProPrice(resultSet.getDouble(3));
					// Adding products into list 
				products.add(p);
		     	}
				
	        }
		catch(SQLException e) 
			{
				e.printStackTrace();
			}
				
			return products;
		}
	public int updateProduct(double price ,double incValue) throws SQLException
	{ int result = 0;
	try(Connection connection = DataBaseConnectionUtils.createConnection())
	{
		// create the prepared statement object
		PreparedStatement preparedStatement = connection.prepareStatement("update product_data set proPrice = proprice+?where proprice < ?");
		
		/// set the data into the params
		preparedStatement.setDouble(1, incValue);
		preparedStatement.setDouble(2, price);
		
		// Execute the query
		result = preparedStatement.executeUpdate();
		
	}
	catch (SQLException e)
	{
		e.printStackTrace();
	}
		
	return result;
	}
	public int deleteById(String proId ) throws SQLException 
	{
		int result = 0;
		try(Connection  connection = DataBaseConnectionUtils.createConnection())
		{
			// create the prepared statement object 
			PreparedStatement preparedStatement = connection.prepareStatement("delete from product_data where proId=?");
			// set the data in the params 
			preparedStatement.setString(1, proId);
			
			// execute the query
			result = preparedStatement.executeUpdate();
			
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
			
		}
		return result;
		
	}
	public int DeleteByPrice(double proPrice) {
		int result = 0;
		try (Connection connection = DataBaseConnectionUtils.createConnection())
		{
			// set the data in prepared statement object 
			PreparedStatement preparedStatement = connection.prepareStatement("delete from product_data where proPrice >=?");
			
			// set the data in the params 
			preparedStatement.setDouble(1, proPrice);
			
			// execute the query
			result = preparedStatement.executeUpdate();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
			
		return result;
	}
	public int droptable() 
	{
		int result =0;
		try (Connection connection = DataBaseConnectionUtils.createConnection())
		{
			// create the statement object 
			Statement statement = connection.createStatement();
		// execute the query
			result = statement.executeUpdate("drop table product_data");
			
		} catch (SQLException e)
		{
			e.printStackTrace();
			
		}
		return result;
		
	}
	

	}

