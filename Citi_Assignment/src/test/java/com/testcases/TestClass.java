package com.testcases;

import java.sql.Connection;
import java.sql.SQLException;

import com.DBWork.file.ConnectionClass;


import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;




public class TestClass 
{
	
	@Test
	@Ignore
	public void checkJdbcConnection() throws SQLException
	{
		Connection con=ConnectionClass.checkConnection();
		
		Class<?> driver=ConnectionClass.class; 
		
		//assertNotNull("connection is established", driver);
		assertNotNull("connection is established", con);
		
	}

}
