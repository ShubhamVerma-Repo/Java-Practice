package com.logic.files;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class AccessProperty {

	public static void main(String[] args) throws Exception {
		
		InputStream input = AccessProperty.class.getClassLoader().getResourceAsStream("DB.properties");
		
    	Properties p=new Properties();
    	p.load(input);
    	
    	System.out.println("property one : " +p.getProperty("DRIVER"));
    	System.out.println("property one : " +p.getProperty("CONNECTION_URL"));
    	System.out.println("property one : " +p.getProperty("USERNAME"));
    	System.out.println("property one : " +p.getProperty("PASSWORD"));
		
	}

}
