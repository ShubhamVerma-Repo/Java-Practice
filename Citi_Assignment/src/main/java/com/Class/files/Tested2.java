package com.Class.files;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.DBWork.file.ConnectionProvider;
import com.model.files.EmployeePojo;

public class Tested2 implements ConnectionProvider 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Class.forName(DRIVER);

			Connection con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);

			int result = 0;

			//PreparedStatement pst = con.prepareStatement("insert into TestExcelStorage values (?,?,?,?,?,?,?,?,?,?)");
			
			PreparedStatement pst = con.prepareStatement("insert into testedexcelstorage values (?,?,?,?,?,?,?,?,?,?)");

			//String jdbc_insert_sql = "insert into TestExcelStorage values (?,?,?,?,?,?,?,?,?,?)";

			/*String FILE_NAME = "D:\\Citi_Assignment\\24August\\Sample1.xlsx";*/

			String FILE_NAME = "C:\\Users\\shubham.verma\\Desktop\\OpRisk_TimeSheet.xlsx";
			
			//sql_statement = con.prepareStatement(jdbc_insert_sql);

			/* We should now load excel objects and loop through the worksheet data */
			FileInputStream input_document = new FileInputStream(new File(FILE_NAME));

			/* Load workbook */
			XSSFWorkbook my_xlsx_workbook = new XSSFWorkbook(input_document);

			/* Load worksheet */
			XSSFSheet my_worksheet = my_xlsx_workbook.getSheetAt(0);

			Row row;
			
			Cell cell = null;
			
			for(int i=7;i<=my_worksheet.getLastRowNum();i++)
			{
				row=(Row)my_worksheet.getRow(i);
				
				
				/*int id;
				if(row.getCell(0)==null)
					id=0;
				else
					id=(int) row.getCell(0).getNumericCellValue();*/
				
				
				Date variable1;
				if(row.getCell(0)==null)
					variable1=null;
				else
					variable1=row.getCell(0).getDateCellValue();
				
				
				//-------------------------------------
				
				Cell abc;
				abc=row.getCell(0);
				
				//System.out.println(abc);
				
				String xyz=abc.toString();
				
				//System.out.println(xyz);
				
				//-------------------------------------
				
				String name;
				if(row.getCell(1)==null)
					name=null;
				else
					name=row.getCell(1).getStringCellValue();
				
				
				String surname;
				if(row.getCell(2)==null)
					surname=null;
				else
					surname=row.getCell(2).getStringCellValue();
				
				
				String pass;
				if(row.getCell(3)==null)
					pass=null;
				else
					pass=row.getCell(3).getStringCellValue();
				
				
				String address;
				if(row.getCell(4)==null)
					address=null;
				else
					address=row.getCell(4).getStringCellValue();
				
				
				/*int pincode;
				if(row.getCell(5)==null)
					pincode=0;
				else
					pincode=(int) row.getCell(5).getNumericCellValue();*/
				
				
				String variable2;
				if(row.getCell(5)==null)
					variable2=null;
				else
					variable2=row.getCell(5).getStringCellValue();
				
				
				
				String city;
				if(row.getCell(6)==null)
					city=null;
				else
					city=row.getCell(6).getStringCellValue();
				
				
				String state;
				if(row.getCell(7)==null)
					state=null;
				else
					state=row.getCell(7).getStringCellValue();
				
				
				/*String country;
				if(row.getCell(8)==null)
					country=null;
				else
					country=row.getCell(8).getStringCellValue();*/
				
				
				double country;
				if(row.getCell(8)==null)
					country=(Double) null;
				else
					country=row.getCell(8).getNumericCellValue();
				
				
				
				
				
				// -------------------------------------------------------

				DataFormatter df = new DataFormatter(); // give the exact value of the cell of excel

				String ndlastCell = df.formatCellValue(row.getCell(8)).toString();

				System.out.println(ndlastCell);

				//-------------------------------------
				
				
				
				
				
				
				
				
				
				/*String location;
				if(row.getCell(9)==null)
					location=null;
				else
					location=row.getCell(9).getStringCellValue();*/
				
				
				double location;
				if(row.getCell(9)==null)
					location=(Double) null;
				else
					location=row.getCell(9).getNumericCellValue();
				
				
				
				//-------------------------------------
				
				DataFormatter df1=new DataFormatter();		//give the exact value of the cell of excel
				
				String lastCell=df1.formatCellValue(row.getCell(9)).toString();
				
				//System.out.println(lastCell);
				
				
				//-------------------------------------
				
				
				
				
			
				
				
				EmployeePojo empObject=new EmployeePojo();
				
				//empObject.setId(id);
				
				empObject.setVariable1(variable1);
				
				empObject.setName(name);
				empObject.setSurname(surname);
				empObject.setPass(pass);
				empObject.setAddress(address);
								
				//empObject.setPincode(pincode);
				
				empObject.setVariable2(variable2);
				
				empObject.setCity(city);
				empObject.setState(state);
				
				/*empObject.setCountry(country);*/
				
				empObject.setCountry(country);
				
				/*empObject.setLocation(location);*/
				
				
				empObject.setLocation(location);
				
				
				
				//pst.setInt(1, empObject.getId());
				
				//pst.setDate(1, (java.sql.Date) empObject.getVariable1());
				
				
				//-------------------------------------
				
				pst.setString(1, xyz);
				
				//-------------------------------------
				
				pst.setString(2, empObject.getName());
				pst.setString(3, empObject.getSurname());
				pst.setString(4, empObject.getPass());
				pst.setString(5, empObject.getAddress());
				
				//pst.setInt(6, empObject.getPincode());
				
				pst.setString(6, variable2);
				
				pst.setString(7, empObject.getCity());
				pst.setString(8, empObject.getState());
				
				//pst.setString(9, empObject.getCountry());
				
				
				//pst.setLong(9, (long) empObject.getCountry());			
				
				
				//----------------------------------
				
				pst.setString(9, ndlastCell);
				
				//----------------------------------
				
				
				
				
				
				
				//pst.setString(10, location);
				
				
				//pst.setLong(10, (long) location);				
				
				
				//----------------------------------
				
				pst.setString(10, lastCell);
				
				//----------------------------------
				
				int insertedQueries=pst.executeUpdate();
				
				//System.out.println("no of records inserted "+insertedQueries);
				
				insertedQueries++;			
				
				
				
				/*int id,pincode;
				String name;
				
				for(int j=0;j<=row.getLastCellNum();j++)
				{		
					if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
					{
										
						if(row.getCell(0)==null)
							id=0;
						else
							id=(int) row.getCell(0).getNumericCellValue();
					}
					else if (cell.getCellType()==Cell.CELL_TYPE_STRING) 
					{
						
						if(row.getCell(1)==null)
							name=null;
						else
							name=row.getCell(0).getStringCellValue();
					}
						
				}*/			
				
				
			}
			
			
			
		}

		catch (Exception e) {
			System.out.println("Exception in catch "+e);
		}

	}

}
