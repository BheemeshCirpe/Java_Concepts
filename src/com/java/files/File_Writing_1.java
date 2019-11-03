package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class File_Writing_1 {

	public static void main(String[] args) throws IOException {

		FileInputStream inp = new FileInputStream("E:\\interview\\Java\\Files\\Book1.xlsx");
		// Workbook wb = WorkbookFactory.create(inp);
		XSSFWorkbook wb = new XSSFWorkbook(inp);
		Sheet sheet = wb.getSheetAt(1);
		// int num = sheet.getLastRowNum();
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("123456");

		// Now this Write the output to a file
		FileOutputStream fileOut = new FileOutputStream("E:\\interview\\Java\\Files\\Book1.xlsx");
		wb.write(fileOut);
		fileOut.close();
		System.out.println("Data written successfully");
	}

}
