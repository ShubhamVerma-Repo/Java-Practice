package com.dbwork.files;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.logic.files.AccessProperty;
import com.pojo.files.ExcelPojo;

public class DBOperationMethod implements IConnectionConstants{
	
	
	
	public static int storeExcelDataInDb(InputStream fileNameInBytes)
	{
		Connection con=null;
		PreparedStatement pst=null; 
		
		try {
			
			InputStream input = AccessProperty.class.getClassLoader().getResourceAsStream("DB.properties");	
			Properties p=new Properties();
			p.load(input);
			
			con =DriverManager.getConnection((String)p.getProperty("CONNECTION_URL"),(String)p.getProperty("USERNAME"),(String)p.getProperty("PASSWORD"));
			pst = con.prepareStatement("insert into testedexcelstorage values (?,?,?,?,?,?,?,?,?,?)");
			
			DataFormatter dataformatter=new DataFormatter();
			XSSFWorkbook my_xlsx_workbook = new XSSFWorkbook(fileNameInBytes);			
			XSSFSheet my_worksheet = my_xlsx_workbook.getSheetAt(0);
			Row row;			
			ExcelPojo excelPojoObject=new ExcelPojo();
			int queryinserted=0;
			
			for(int i=7;i<my_worksheet.getLastRowNum();i++)			
			{
				row=(Row)my_worksheet.getRow(i);

				excelPojoObject.setDateValue(new java.util.Date(dataformatter.formatCellValue(row.getCell(0)).toString()));
				excelPojoObject.setTeamMember(dataformatter.formatCellValue(row.getCell(1)).toString());
				excelPojoObject.setProject(dataformatter.formatCellValue(row.getCell(2)).toString());
				excelPojoObject.setModule(dataformatter.formatCellValue(row.getCell(3)).toString());
				excelPojoObject.setPhase(dataformatter.formatCellValue(row.getCell(4)).toString());
				excelPojoObject.setActivity(dataformatter.formatCellValue(row.getCell(5)).toString());
				excelPojoObject.setDescription(dataformatter.formatCellValue(row.getCell(6)).toString());
				excelPojoObject.setTicketid(dataformatter.formatCellValue(row.getCell(7)).toString());
				excelPojoObject.setTotalhrs(row.getCell(8).getNumericCellValue());
				excelPojoObject.setHrsmin(dataformatter.formatCellValue(row.getCell(9)).toString());
				
				java.sql.Date formatedSqlDate = new java.sql.Date(new java.util.Date(dataformatter.formatCellValue(row.getCell(0)).toString()).getTime());

				pst.setDate(1, formatedSqlDate);
				pst.setString(2, excelPojoObject.getTeamMember());
				pst.setString(3, excelPojoObject.getProject());
				pst.setString(4, excelPojoObject.getModule());
				pst.setString(5, excelPojoObject.getPhase());
				pst.setString(6, excelPojoObject.getActivity());
				pst.setString(7, excelPojoObject.getDescription());
				pst.setString(8, excelPojoObject.getTicketid());
				pst.setDouble(9, excelPojoObject.getTotalhrs());
				pst.setString(10, excelPojoObject.getHrsmin());

				queryinserted = pst.executeUpdate();
			}			

			if (queryinserted > 0)
				return queryinserted;
			else
				return 0;
		}

		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		finally {
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	
	static{
		try {
			InputStream input = AccessProperty.class.getClassLoader().getResourceAsStream("DB.properties");	
			Properties p=new Properties();
			p.load(input);
			Class.forName((String)p.getProperty("DRIVER"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
