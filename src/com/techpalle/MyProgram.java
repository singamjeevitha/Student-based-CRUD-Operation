package com.techpalle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class MyProgram {

	public static void main(String[] args) 
	{
		try 
		{
			//Step 1:Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2:Establish connection
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
           
            //Step 3:Prepare sql query
            Statement s=con.createStatement();
            
            //Step 4:Execute statement
            s.executeUpdate("create table emp2(eno int,ename varchar(50))");
            
            //Step 5:close connections
            s.close();
            con.close();
		     } 
		     catch (ClassNotFoundException e) 
		      {
		    	 /*Note:
					1)when jar file is not added to build path(ClassNotFoundException)
					2)when jar files is added but Driver.class file is not present(ClassNotFoundException)
					3)when there is the spelling mistakes in "" */
			      e.printStackTrace();
		      } 
		     catch (SQLException e) 
		     {
			  //1)when mysql url or username or password is wrong
			     e.printStackTrace();
		     }
		
		
		
		
	}

}
