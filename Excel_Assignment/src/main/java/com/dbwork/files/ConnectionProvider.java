package com.dbwork.files;

import java.sql.*;

public class ConnectionProvider {
	public static Connection getConnection() {
			 
	       
	        String driverManager="jdbc:oracle:thin:@localhost:1521:xe" ;
	        String uname= "system";
	        String pwd ="root";
	 
	        Connection connection = null;
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	 
	              connection = DriverManager.getConnection(driverManager, uname,
	              pwd);
	              
	 
	        }
	        
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }

	 
	        return connection;
	    }
}

