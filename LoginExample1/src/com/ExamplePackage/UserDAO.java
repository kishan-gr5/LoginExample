package com.ExamplePackage;

import java.sql.*;

public class UserDAO 
{
	static Connection con=null;
	static ResultSet rs = null;
	
	public static UserBean login(UserBean bean)
	{
		Statement stmt = null;
		String Username = bean.getUsername();
		String Password = bean.getPassword();
		
		String query = "Select * from users where Username= "+ Username +""+" AND Password="+ Password +" ";
		
		System.out.println("Username"+ Username);
		System.out.println("Password"+ Password);
		System.out.println("query "+ query);
		
		try
		{
			con = ConnectionManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			boolean res = rs.next();
			
			if(!res)
			{
				//System.out.println(res);
				System.out.println("sry user not registered. please signup");
				bean.setValid(false);
			}
			else if(res)
			{
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("fastname");
				bean.setFirstname(firstName);
				bean.setLastname(lastName);
				bean.setValid(true);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(rs!= null)
			{
				try
				{
				rs.close();
				}
				catch(Exception e)
				{}
					rs=null;
				
			}
			if(stmt!=null)
			{
				try
				{
				stmt.close();
				}
				catch(Exception e)
				{}
					stmt = null;
				
			}
			if(con!=null)
			{
				try
				{
				con.close();
				}
				catch(Exception e)
				{}
					con = null;
				
			}
		}
		return bean;
	}
	
}
