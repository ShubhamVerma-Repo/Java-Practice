package com.Class.files;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
 
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class Abc 

{
      public static void main( String [] args ) {
    	  String fileName ="D:\\Citi_Assignment\\24August\\Sample.xlsx";
            Vector dataHolder=read(fileName);
            //checkDatabase(dataHolder);
            
            
            for (int i=1;i<dataHolder.size(); i++){
                Vector cellStoreVector=(Vector)dataHolder.elementAt(i);
                
                XSSFCell myCell = (XSSFCell)cellStoreVector.elementAt(0);
                String stringCellValue = myCell.toString();
                
                
                System.out.println(stringCellValue);
                System.out.println();
                
            }
            
            
            
      }
      public static Vector read(String fileName)    {
            Vector cellVectorHolder = new Vector();
            try{
                  FileInputStream myInput = new FileInputStream(fileName);
                  //POIFSFileSystem poifile=new POIFSFileSystem(myInput);
                  
                  
                  XSSFWorkbook myWorkBook = new XSSFWorkbook(myInput);                  
                  
                  XSSFSheet mySheet = myWorkBook.getSheetAt(0);
                  
                  
                  Iterator rowIter = mySheet.rowIterator(); 
                  while(rowIter.hasNext()){
                        XSSFRow myRow = (XSSFRow) rowIter.next();
                        Iterator cellIter = myRow.cellIterator();
                        Vector cellStoreVector=new Vector();
                        while(cellIter.hasNext()){
                              XSSFCell myCell = (XSSFCell) cellIter.next();
                              cellStoreVector.addElement(myCell);
                        }
                        cellVectorHolder.addElement(cellStoreVector);
                  }
            }catch (Exception e){e.printStackTrace(); }
            return cellVectorHolder;
      }
      
      
      
      
      
      
      
    private static void checkDatabase(Vector dataHolder) {
        String username="";
        String password="";
            List missingList = new ArrayList();
             
        for (int i=1;i<dataHolder.size(); i++){
              Vector cellStoreVector=(Vector)dataHolder.elementAt(i);
              HSSFCell myCell = (HSSFCell)cellStoreVector.elementAt(0);
              String stringCellValue = myCell.toString();
              username = stringCellValue;
               
              myCell = (HSSFCell)cellStoreVector.elementAt(1);
              stringCellValue = myCell.toString();
              password=stringCellValue;            
   
               
              try{      
                     
                     
                  
                   /* PreparedStatement ps = con.prepareStatement("select null from login where username=? and password=?");
                  //(in the loop)
                  ps.setString(1, username);
                  ps.setString(2, password);
                  ResultSet rs = ps.executeQuery();
                  if(rs.next()) {
                    // Found
                  }*/
                     
                     
                     
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");
                //   Statement stmt = con.createStatement();
                //  ResultSet rs1 = stmt.executeQuery("select * from login where username='"+username+"' and password='"+password+"'");
                    //PreparedStatement psmt=null;
                      PreparedStatement psmt = con.prepareStatement("select null from login where username=? and password=?");
                    psmt.setString(1, username);
                  psmt.setString(2, password);
                  ResultSet rs1 = psmt.executeQuery(); 
                      System.out.println("rs1-->"+rs1);
                              boolean isExist = false;
                              if (rs1!=null) {
                                    while (rs1.next()){
                                            isExist = true;
                                            String rec1 = rs1.getString(1);
                                            String rec2 = rs1.getString(2);
                                            System.out.println("rec1 is--"+rec1+"---rec2 is---"+rec2);
                                    }
                              }
                               
                              if (rs1==null) {
                                  Map mapDetail = new HashMap();
                                  mapDetail.put("username",username);
                                  mapDetail.put("password",password);
 
                                    int row = 0;
                    //Object obj;
            /*        For(Object obj:mapDetail.Keys){
                    String value = (String)mapDetail(obj);
 
                    //not sure of this part:
                    mySheet.getCells().get(row,0).setValue(value);
                    row++;
                    }
                                    missingList.add(mapDetail);
                              }
 */
 
                  //  pstmt.close();
                    con.close();
                              }
              }
              catch(Exception e){
                     
                    System.out.println("e-->"+e);
              }
        }
             
            System.out.println("Missing List : "+missingList);
  }
}