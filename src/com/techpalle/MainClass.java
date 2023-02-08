package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
           
            Statement s=con.createStatement();
            
            s.executeUpdate("create table emp(eno int,ename varchar(50))");
            
            s.close();
            con.close();
		     } 
		     catch (ClassNotFoundException e) 
		      {
		    	
			      e.printStackTrace();
		      } 
		     catch (SQLException e) 
		     {
			  
			     e.printStackTrace();
		     }
		
		
		

	}

}
