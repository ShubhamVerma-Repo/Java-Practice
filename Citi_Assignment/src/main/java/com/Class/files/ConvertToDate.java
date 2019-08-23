package com.Class.files;

import java.math.BigDecimal;
import java.sql.*;
import java.text.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;

import com.DBWork.file.ConnectionProvider;


public class ConvertToDate implements ConnectionProvider 
{

	public static void main(String[] args) throws ParseException 
	{
		// TODO Auto-generated method stub

		String string = "January 2, 2010";
		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
		Date date = format.parse(string);
		System.out.println(date); // Sat Jan 02 00:00:00 GMT 2010
		
		
		
		/*String string1 = "01-March-2010";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-M-yyyy", Locale.ENGLISH);
		LocalDate date1 = LocalDate.parse(string1, formatter);
		System.out.println(date1);*/
		
		
		
		String dateInString = "7-Jun-2013";
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		Date date11 = (Date) formatter1.parse(dateInString);
		System.out.println(date11);
		
		
		String string11 = "January 2, 2010";
		DateTimeFormatter formatter11 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date111 = LocalDate.parse(string11, formatter11);
		System.out.println(date111);
		
		
		
		
		try
		{
		
			Class.forName(DRIVER);
			
			Connection con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);

			PreparedStatement pst = con.prepareStatement("insert into dateFormat values (?,?)");	
			
			
			String dateInString1 = "March 34, 2010";
			/*SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
			java.util.Date date2 = (Date) formatter1.parse(dateInString);
			System.out.println(date2);*/
			
			
			String dateInString2 = "2015-June-02";
			
			SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yy", Locale.ENGLISH);
			java.util.Date date2 = (Date) formatter1.parse(dateInString2);
			
			System.out.println("date2 :  "+date2);
			
			java.sql.Date sqlDate = new java.sql.Date(date2.getTime());			
			System.out.println("sqldate  :  " +sqlDate);
			
			String dateInString3 = "7-Jun-13";
			
			String dateInString4 = "8/1/2018";
			
			/*java.util.Date myDate = new java.util.Date(dateInString2);
			
			System.out.println(myDate);
			
			java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());			
			System.out.println("sqldate  :  " +sqlDate);*/
			
			double decimalValue=5.26;
			
			
			/*pst.setDate(1, sqlDate);
			pst.setDouble(2, decimalValue);
			int res=pst.executeUpdate();	
			
			System.out.println(res);*/
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
