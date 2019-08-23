package com.Class.files;
import com.DBWork.file.*;

import java.io.FileInputStream;
import java.sql.*;

import org.apache.poi.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReadAndStore implements ConnectionProvider  
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Connection con=null;
		
		try
		{
			FileInputStream file=new FileInputStream("abc");
			POIFSFileSystem poifile=new POIFSFileSystem(file);
			
			XSSFWorkbook workbookObject=new XSSFWorkbook();
			XSSFSheet sheet=workbookObject.getSheetAt(0);
			
			
		}
		catch(Exception e)
		{}
		
		
		
	}

}
