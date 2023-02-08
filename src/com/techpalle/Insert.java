package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert 
 {

	public static void main(String[] args) 
	{
		Connection con=null;
		Statement s=null;
		try
		{
			//Load the Driver:
			Class.forName("com.mysql.cj.jdbc.Driver");   //Register the Driver
			
			//in this driver class as any spelling mistake -ClassFoundException
			//and also jar file will not be connected that time also-ClassFoundException
			
			//Establish the connection:
			  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
			  
			  //wrong URL,wrong UserName,wrong password-SQL Exception
			  //wrong UserName,wrong password these can be wrong if error name is Access denied after SQL Exception
			  /*SQLSyntaxErrorException-unknown database in these scenario one jdbc is not connected to eclipse or if we
			  are check the database name and in eclipse as given database name same or not.
			 */
			 //prepare SQL statement:
			  s=con.createStatement();
			 
			 //Execute query(statement):
			 s.executeUpdate("insert into emp2 values(1,'vinutha')");
			 s.executeUpdate("insert into emp2 values(2,'jeevitha')");
			 //s.executeUpdate(qry);
			 
			  
			  //console window output
			 //String qry="select * from emp";
			  //ResultSet rs=s.executeQuery(qry);
			  
			  //while(rs.next()==true)
			  //{
				//  System.out.println(rs.getInt("eno"));     //syso(rs.getInt(1));
				  //System.out.println(rs.getString("ename")); //syso(rs.getInt(2));if we dont no the rows names
			  //}
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
