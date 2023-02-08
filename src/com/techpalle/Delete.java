package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) 
	{
		Connection con=null;
		Statement s=null;
	
		try
		{
			//Load the Driver:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection:
			  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
			  
			//prepare SQL statement:
			  s=con.createStatement();
			  
			//Execute query(statement):
				 String qry5=("delete from emp2 where eno=1");
				 s.executeUpdate(qry5);
				
			}
		catch (ClassNotFoundException e)
		{
			
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		finally
		{
			//closing connections:
			 try 
			 {
				if(s!=null)
				{
				s.close();
				}
				if(con!=null)
				{
				con.close();
				}
			} 
			 catch (SQLException e) 
			 {
				e.printStackTrace();
			}
		}

}


}


