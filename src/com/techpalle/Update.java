package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

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
				 String qry2=("update emp2 set ename='bhavitha' where eno=1");
				 String qry3=("update emp2 set eno=4 where ename='jeevitha'");
				 s.executeUpdate(qry2);
				 s.executeUpdate(qry3);
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
