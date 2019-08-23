package com.DBWork.file;

import java.sql.*;

public class ConnectionClass 
{
	
	public static Connection checkConnection() throws SQLException
	{
		
		Class<?> driver=ConnectionClass.class;
		
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
	            "system",
	            "root");
	}
	
	public static Class<?> checkClassForConnection() throws ClassNotFoundException
	{
		return Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	

	
	
	public static Connection getConnection() {
		 
       
        String driverManager="jdbc:oracle:thin:@localhost:1521:xe" ;
        String uname= "system";
        String pwd ="root";
 
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
 
              connection = DriverManager.getConnection(driverManager, uname,
              pwd);
              
 
        } catch (ClassNotFoundException e) {
            System.err.println("Where is your Oracle JDBC Driver?\n");
            e.printStackTrace();
            System.exit(1);
        } catch (SQLException e) {
            System.err.println("Connection Failed.\n");
            e.printStackTrace();
            System.exit(1);
        }
 
        return connection;
    }
	
	
	
}
