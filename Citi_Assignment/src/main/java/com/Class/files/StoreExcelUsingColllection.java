package com.Class.files;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.DBWork.file.ConnectionProvider;
import com.model.files.ExcelPojo;

public class StoreExcelUsingColllection implements ConnectionProvider

{

	public static void main(String[] args) 
	{

		try {

			Class.forName(DRIVER);

			Connection con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);

			PreparedStatement pst = con.prepareStatement("insert into testedexcelstorage values (?,?,?,?,?,?,?,?,?,?)");

			String FILE_NAME = "C:\\Users\\shubham.verma\\Desktop\\OpRisk_TimeSheet.xlsx";		

			/* We should now load excel objects and loop through the worksheet data */
			FileInputStream input_document = new FileInputStream(new File(FILE_NAME));

			/* Load workbook */
			XSSFWorkbook my_xlsx_workbook = new XSSFWorkbook(input_document);

			/* Load worksheet */
			XSSFSheet my_worksheet = my_xlsx_workbook.getSheetAt(0);

			Row row;		//Interface

			//Cell cell = null;	//Interface

			/*Create a list collection of PoJoClass type*/
			List<ExcelPojo> pojoList=new ArrayList<>();		



			/*Iterate each row of excelSheet one by one upto the last row*/

			for(int i=7;i<=my_worksheet.getLastRowNum();i++)			
			{

				row=(Row)my_worksheet.getRow(i);


				String datevalue, teammember, project, module, phase, activity, description, ticketid, totalhrs, hrsmin;

				DataFormatter df=new DataFormatter();		//give the exact value of the excel cell as it is

				datevalue=df.formatCellValue(row.getCell(0)).toString();
				teammember=df.formatCellValue(row.getCell(1)).toString();
				project=df.formatCellValue(row.getCell(2)).toString();
				module=df.formatCellValue(row.getCell(3)).toString();
				phase=df.formatCellValue(row.getCell(4)).toString();
				activity=df.formatCellValue(row.getCell(5)).toString();
				description=df.formatCellValue(row.getCell(6)).toString();
				ticketid=df.formatCellValue(row.getCell(7)).toString();
				totalhrs=df.formatCellValue(row.getCell(8)).toString();
				hrsmin=df.formatCellValue(row.getCell(9)).toString();


				/*Calling the constructor of PoJoClass (ExcelPojo) to set the values*/

				pojoList.add(new ExcelPojo(datevalue, teammember, project, module, phase, activity, description,
						ticketid, totalhrs, hrsmin));



			}			

			int queriesInserted=0;

			/*Iterating the ArrayList of PoJoClass (ExcelPojo) type and store the data into database using preparedStatement*/

			for (ExcelPojo excelPojo : pojoList) 
			{

				pst.setString(1, excelPojo.getDatevalue());
				pst.setString(2, excelPojo.getTeammember());
				pst.setString(3, excelPojo.getProject());
				pst.setString(4, excelPojo.getModule());
				pst.setString(5, excelPojo.getPhase());
				pst.setString(6, excelPojo.getActivity());
				pst.setString(7, excelPojo.getDescription());
				pst.setString(8, excelPojo.getTicketid());
				pst.setString(9, excelPojo.getTotalhrs());
				pst.setString(10, excelPojo.getHrsmin());

				pst.executeUpdate();
				
				queriesInserted++;

			}

			System.out.println("no. of queries inserted : "+queriesInserted);


		}

		catch (Exception e) {
			System.out.println("Exception in catch "+e);
		}


	}

}
