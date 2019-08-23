package com.Class.files;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.DBWork.file.ConnectionProvider;

public class ConvertToTime implements ConnectionProvider
{

	public static void main(String[] args) 
	{
	    
	    try {

			Class.forName(DRIVER);

			Connection con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);

			int result = 0;

			PreparedStatement pst = con.prepareStatement("insert into dateFormatChecking (timevalue) values (?)");

			String FILE_NAME = "C:\\Users\\shubham.verma\\Desktop\\DateSheet.xlsx";
		
			FileInputStream input_document = new FileInputStream(new File(FILE_NAME));

			XSSFWorkbook my_xlsx_workbook = new XSSFWorkbook(input_document);

			
			XSSFSheet my_worksheet = my_xlsx_workbook.getSheetAt(0);

			System.out.println("sheet no : "+my_worksheet.getLastRowNum());
			
			Row row;
			
			
	            
			
			DataFormatter dataformatter=new DataFormatter();
			
			String timevalue=null;
			
			//Cell cell = null;
			
			/*java.util.Date abc=new java.util.Date();
			java.sql.Date xyz=new java.sql.Date(abc.getTime());*/
			
			for(int i=0;i<=my_worksheet.getLastRowNum();i++)
			{
				row=(Row)my_worksheet.getRow(i);
			
				timevalue=dataformatter.formatCellValue(row.getCell(1)).toString();
				
				System.out.println("excel time in string at"+i+" : "+timevalue);
				
				
				//SimpleDateFormat format = new SimpleDateFormat("hh:mm a"); //if 24 hour format
			    // or
			    SimpleDateFormat format = new SimpleDateFormat("HH:mm"); // 12 hour format

			    java.util.Date d1 =(java.util.Date)format.parse(timevalue);
			    
			    System.out.println("java time in string at"+i+" : "+d1);
			    
			    
			    
			    java.sql.Time ppstime = new java.sql.Time(d1.getTime());
			    
			    System.out.println("sql time in string at"+i+" : "+ppstime);
			    
			
				pst.setTime(1, ppstime);
				
				int resultdate=pst.executeUpdate();
				
				System.out.println(resultdate);
				
				
				
				
				/*to_char(timevalue,'HH:MI')*/
				
			}
			
			//System.out.println("fahsdf");
	}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	    
	    
	}
}
