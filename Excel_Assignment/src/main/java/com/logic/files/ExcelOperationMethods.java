package com.logic.files;

public class ExcelOperationMethods {

	public static String getFileExtention(String fileName) {

		if (fileName == null || !fileName.contains(".")) {
			return null;
		}

		String fileExtention = fileName.substring(fileName.lastIndexOf("."));
		return fileExtention;
	}
}
