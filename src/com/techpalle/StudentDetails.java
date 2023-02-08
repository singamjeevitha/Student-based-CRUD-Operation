package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDetails {

	public static void main(String[] args)
	{
		Connection con=null;
		Statement s=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");   
			
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
			  
			s=con.createStatement();
			 
	        s.executeUpdate("insert into emp values(1,'vinutha')");
		    s.executeUpdate("insert into emp values(2,'jeevitha')");
		    String qry2=("update emp set ename='bhavitha' where eno=1");
			String qry3=("update emp set eno=4 where ename='jeevitha'");
			s.executeUpdate(qry2);
			s.executeUpdate(qry3);
			 String qry5=("delete from emp where eno=1");
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
