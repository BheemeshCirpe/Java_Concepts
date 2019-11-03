package com.java.files;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class File_Reading_1 {

	public static void main(String[] args) throws IOException {	
		
		
		  FileInputStream f1 = new FileInputStream("E:\\interview\\Java\\Files\\Book1.xlsx"); 
		  XSSFWorkbook w1 = new XSSFWorkbook(f1); 
		  Sheet s1 = w1.getSheet("Sheet1"); 
		
		  Row r1 = s1.getRow(2); 
		  Cell c1 = r1.getCell(1); 
		  String sr1 = c1.getStringCellValue();
		 
		  
		  System.out.println(sr1);
		 
	

	}

}
