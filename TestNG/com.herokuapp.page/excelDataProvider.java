package com.herokuapp.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataProvider {
	
	public String datafilePath = "C:/TestData/";
	public String dataFile = "TestData.xlsx";
	
	public String userName;
	public String passWord;
	public String email;
	public String dropSelection;
	public String message;

	public excelDataProvider()throws IOException{
		// TODO Auto-generated method stub
		// Set object variable to null
		File src = null;
		FileInputStream fis = null;
		XSSFWorkbook wb= null;
		XSSFSheet sh1 = null;
		//Start the process of loading, opening the workbook and retrieving data from excel file
		try {
			src = new File(datafilePath + dataFile);
			// load file
			fis = new FileInputStream(src);
			// Load workbook
			wb=new XSSFWorkbook(fis);
			sh1 = wb.getSheetAt(0);
			//Assign variables values from Excel Spreadsheet
			userName = sh1.getRow(1).getCell(1).getStringCellValue();
			passWord = sh1.getRow(1).getCell(2).getStringCellValue();
			email = sh1.getRow(1).getCell(0).getStringCellValue();
			dropSelection = sh1.getRow(1).getCell(3).getStringCellValue();
			message = sh1.getRow(1).getCell(4).getStringCellValue();
			
		}
		catch (IOException e) {
			throw e;
			
		}
		finally {
			sh1 = null;
			wb = null;
			fis.close();
		}
		
	}
}
