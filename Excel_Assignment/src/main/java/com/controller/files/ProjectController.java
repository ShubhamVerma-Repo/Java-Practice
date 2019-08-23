package com.controller.files;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dbwork.files.DBOperationMethod;
import com.logic.files.ExcelOperationMethods;


@WebServlet("/ProjectController")
@MultipartConfig
public class ProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ProjectController() {
        super();
        
    }

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		Part filePart = request.getPart("fileName");
	    String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
	    InputStream fileNameInBytes = filePart.getInputStream();
	    String requiredFormatOfFile=".xlsx";
	    
	    String UploadedfileExtention = ExcelOperationMethods.getFileExtention(fileName);
	    
	    if(UploadedfileExtention==null)
	    {
	    	System.out.println("File is not choosen. Please choose the file first");
			request.getRequestDispatcher("error.jsp").forward(request, response);
	    }
	    
	    
		if (UploadedfileExtention.equals(requiredFormatOfFile)) {
			int resultOfQueryInsertion = DBOperationMethod.storeExcelDataInDb(fileNameInBytes);

			if (resultOfQueryInsertion != 0) {
				System.out.println("insertion is successfully done : " + resultOfQueryInsertion);
				request.getRequestDispatcher("exceldataview.jsp").forward(request, response);
			} else {
				System.out.println("Something went wrong. Insertion doesn't take place. \n Please Try Again");
			}
		}

		else {
			System.out.println("File is not in excel format. Please choose the corrected one");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}