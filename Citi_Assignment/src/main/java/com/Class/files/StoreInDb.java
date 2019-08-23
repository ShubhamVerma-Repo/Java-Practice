package com.Class.files;

import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.*;
import java.sql.*;

import com.DBWork.file.ConnectionProvider;

public class StoreInDb implements ConnectionProvider 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
            
		
					int result=0;

			        PreparedStatement sql_statement = null;
			        
			        
			        String jdbc_insert_sql = "insert into TestExcelStorage values (?,?,?,?,?,?,?,?,?,?)";
			        
			        String FILE_NAME = "D:\\Citi_Assignment\\24August\\Sample1.xlsx";
			        
			        sql_statement = con.prepareStatement(jdbc_insert_sql);
			        
			        /* We should now load excel objects and loop through the worksheet data */
			        FileInputStream input_document = new FileInputStream(new File(FILE_NAME));
			        
			        /* Load workbook */
			        XSSFWorkbook  my_xls_workbook = new XSSFWorkbook (input_document);
			        
			        /* Load worksheet */
			        XSSFSheet  my_worksheet = my_xls_workbook.getSheetAt(0);
			        
			        // we loop through and insert data
			        Iterator<Row> rowIterator = my_worksheet.iterator(); 
			       
			        while(rowIterator.hasNext())
			        {
			                Row row = rowIterator.next(); 
			                
			                /*row.getCell(1);*/
			                
			                
			                Iterator<Cell> cellIterator = row.cellIterator();
			                
			                int lastCell=row.getLastCellNum();
			                
			                System.out.println("last cell of a row  "+lastCell);
			                
			                for(int i=1;i<=lastCell;i++)
			                {
			                	
			                	 while(cellIterator.hasNext())
			                        {
			                                Cell cell = cellIterator.next();
			                                
			                                switch(cell.getCellType())
			                                { 
			                                
			                                case Cell.CELL_TYPE_STRING: //handle string columns
			                                	
			                                	sql_statement.setString(i, cell.getStringCellValue());
			                	
			                                	break;
			                                	
			                                case Cell.CELL_TYPE_NUMERIC: //handle double data                                   
			                                    
			                                	sql_statement.setInt(i, (int) cell.getNumericCellValue());                                 
		                                    
		                                        break;
			                                }
			                                
			                                sql_statement.executeUpdate();
			                	
			                        }
			                }
			                
			                /*while(cellIterator.hasNext())
			                        {
			                                Cell cell = cellIterator.next();
			                                
			                                switch(cell.getCellType())
			                                { 
			                                
			                                case Cell.CELL_TYPE_STRING: //handle string columns
			                                                                   
		                                	sql_statement.setString(2, cell.getStringCellValue());
		                                	
		                                	sql_statement.setString(3, cell.getStringCellValue());
		                                    
		                                	sql_statement.setString(4, cell.getStringCellValue());
		                                	
		                                	sql_statement.setString(5, cell.getStringCellValue());
		                                	
		                                	sql_statement.setString(7, cell.getStringCellValue());
		                                    
		                                	sql_statement.setString(8, cell.getStringCellValue());
		                                	
		                                	sql_statement.setString(9, cell.getStringCellValue());
		                                	
		                                	sql_statement.setString(10, cell.getStringCellValue());
			                                
		                                	break;
		                                	
			                                case Cell.CELL_TYPE_NUMERIC: //handle double data
			                                	
		                                        sql_statement.setInt(1, (int) cell.getNumericCellValue());
			                                    
			                                	sql_statement.setInt(6, (int) cell.getNumericCellValue());                                 
		                                    
		                                        break;
		                                }
			                              
			                                
			                        }*/
			        
			          
			        }
			      //we can execute the statement before reading the next row
			          
                    //result=sql_statement.executeUpdate();
                    
			        System.out.println("no. of records inserted : "+result);
			        
			        
			        /*Statement stmt=con.createStatement();
			        
			        ResultSet rs= stmt.executeQuery("select * from TestExcelStorage");
			        
			        while(rs.next()){
			            //Retrieve by column name
			            String module  = rs.getString("Module");
			            String phase  = rs.getString("Phase");
			           

			            //Display values
			            System.out.println();
			            System.out.print("ID: " + module);
			            System.out.println();
			            System.out.print("Age: " + phase);
			            System.out.println();
			        }*/
			        
			        /* Close input stream */
			        input_document.close();
			        /* Close prepared statement */
			        sql_statement.close();
			        /* COMMIT transaction */
			        con.commit();
			        /* Close connection */
			        con.close();
			}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

			}

		
		
	}

