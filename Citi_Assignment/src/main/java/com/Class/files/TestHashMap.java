package com.Class.files;

import java.io.*;
import java.util.*;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class TestHashMap {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		String fileName ="D:\\Citi_Assignment\\24August\\Sample.xlsx";
		
		//System.out.println(loadExcelLines(fileName));
		
		System.out.println(getExcelList(fileName));
		
		/*HashMap<String, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<String, LinkedHashMap<Integer, List>>();
		
		outerMap=loadExcelLines(fileName);		
		
		//Iterator rows = ((Sheet) outerMap).rowIterator();
		
		Iterator<HashMap<String, LinkedHashMap<Integer, List>>> rows = null;
		
		while(rows.hasNext())
		{
			System.out.println(rows.next());
		}*/
		
	}

	
	
	
	
	
	//--------------------------------------------------------------------
	
	
	
	public static HashMap loadExcelLines(String fileName)
    {
        // Used the LinkedHashMap and LikedList to maintain the order
        HashMap<String, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<String, LinkedHashMap<Integer, List>>();

        LinkedHashMap<Integer, List> hashMap = new LinkedHashMap<Integer, List>();

        String sheetName = null;
        // Create an ArrayList to store the data read from excel sheet.
        // List sheetData = new ArrayList();
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(new File(fileName));
            // Create an excel workbook from the file system
            XSSFWorkbook workBook = new XSSFWorkbook(fis);
            // Get the first sheet on the workbook.
            for (int i = 0; i < workBook.getNumberOfSheets(); i++)
            {
                XSSFSheet sheet = workBook.getSheetAt(i);
                // XSSFSheet sheet = workBook.getSheetAt(0);
                sheetName = workBook.getSheetName(i);

                Iterator rows = sheet.rowIterator();
                while (rows.hasNext())
                {
                    XSSFRow row = (XSSFRow) rows.next();
                    Iterator cells = row.cellIterator();

                    List data = new LinkedList();
                    while (cells.hasNext())
                    {
                        XSSFCell cell = (XSSFCell) cells.next();
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        data.add(cell);
                    }
                    hashMap.put(row.getRowNum(), data);

                    // sheetData.add(data);
                }
                outerMap.put(sheetName, hashMap);
                hashMap = new LinkedHashMap<Integer, List>();
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return outerMap;

    }
	
	
	
	
	
	
	//--------------------------------------------------------------------
	
	
	
	
	
	
	//--------------------------------------------------------------------
	

	
	public static List<Map<String, String>> getExcelList(String fileName) throws IOException{
		
		
		FileInputStream fis = new FileInputStream(new File(fileName));
        // Create an excel workbook from the file system
        XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		
	  List<Map<String,String>> tempList = new ArrayList<Map<String,String>>();
	  Map<Integer,String> header = new HashMap<Integer,String>();
	  //String[] arg =headerData.split(",");
	
	  /*for(int i=0;i<arg.length; i++){
		 if(!arg[i].equals(""))
		   header.put(i, arg[i]);
	  }*/
	  
	  for( Row row : wb.getSheetAt(0) ) {
		
		  Map<String,String>  tempMap = new HashMap<String,String>();
		   for(Cell cell :row){
			   if(header.get(cell.getColumnIndex()) != null){
		   		   switch( cell.getCellType()) {
	                case Cell.CELL_TYPE_STRING :
	                    tempMap.put( header.get(cell.getColumnIndex()),cell.getRichStringCellValue().getString());
	                    break;
	                case Cell.CELL_TYPE_NUMERIC :
	                    if(org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell))
	                    tempMap.put(  header.get(cell.getColumnIndex()),cell.getDateCellValue().toString());
	                    else
	                    	tempMap.put(  header.get(cell.getColumnIndex()),Integer.toString((int)cell.getNumericCellValue()));
	                    break;
	                case Cell.CELL_TYPE_FORMULA :
	                		tempMap.put(  header.get(cell.getColumnIndex()),cell.getCellFormula());
	                		break;
		   		   }
			   }
		   }
		   
		   tempList.add(tempMap);
	  }
	  
	  return tempList;
	}
	
	
	
	//--------------------------------------------------------------------------
	
	
	
}
