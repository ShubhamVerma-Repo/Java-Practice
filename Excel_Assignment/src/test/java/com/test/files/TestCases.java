package com.test.files;

import org.junit.*;
import static org.junit.Assert.*;

import com.logic.files.ExcelOperationMethods;

public class TestCases {

	@Test
	public void TestFileExtensionPass() {
		assertEquals(".xlsx",
				ExcelOperationMethods.getFileExtention("C:\\Users\\shubham.verma\\Desktop\\MRMS_TimeSheet.xlsx"));
	}

	@Test
	public void TestFileExtensionFail() {
		assertEquals(".xlx",
				ExcelOperationMethods.getFileExtention("C:\\Users\\shubham.verma\\Desktop\\MRMS_TimeSheet.xlx"));
	}	

}
