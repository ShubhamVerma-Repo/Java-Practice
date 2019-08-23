package com.Class.files;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.DBWork.file.ConnectionProvider;

public class ParseDateOfExcel implements ConnectionProvider
{
	
	public static void main(String[]args)
	{
		try {

			Class.forName(DRIVER);

			Connection con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);

			int result = 0;

			PreparedStatement pst = con.prepareStatement("insert into dateFormatChecking values (?)");

			String FILE_NAME = "C:\\Users\\shubham.verma\\Desktop\\DateSheet.xlsx";
		
			FileInputStream input_document = new FileInputStream(new File(FILE_NAME));

			XSSFWorkbook my_xlsx_workbook = new XSSFWorkbook(input_document);

			
			XSSFSheet my_worksheet = my_xlsx_workbook.getSheetAt(0);

			System.out.println("sheet no : "+my_worksheet.getLastRowNum());
			
			Row row;
			
			
	            
			
			DataFormatter dataformatter=new DataFormatter();
			
			String date1=null;
			
			//Cell cell = null;
			
			/*java.util.Date abc=new java.util.Date();
			java.sql.Date xyz=new java.sql.Date(abc.getTime());*/
			
			for(int i=0;i<=my_worksheet.getLastRowNum();i++)
			{
				row=(Row)my_worksheet.getRow(i);
			
				date1=dataformatter.formatCellValue(row.getCell(0)).toString();
				
				System.out.println("excel date in string at"+i+" : "+date1);
				
				
				java.util.Date abc=new java.util.Date(date1);
				java.sql.Date xyz=new java.sql.Date(abc.getTime());
				
				/*SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MMM-yy", Locale.ENGLISH);
				java.util.Date date2 = (Date) formatter2.parse(date1);
				
				System.out.println("java date after conversion  at"+i+" : "+date2);
			
				java.sql.Date sqlDate = new java.sql.Date(date2.getTime());			
				System.out.println("sql date after conversion at"+i+" : "+sqlDate);*/
				
				System.out.println();
				System.out.println();
			
				pst.setDate(1, xyz);
				
				int resultdate=pst.executeUpdate();
				
				System.out.println(resultdate);
				
			}
			
			//System.out.println("fahsdf");
	}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}