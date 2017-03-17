package com.herokuapp.pages;

import java.io.IOException;

import org.testng.annotations.Test;

public class DataProviderExample {
	
	/*@DataProvider
	
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		
		//1st Row
		data[0][0] = "admin";
		data[0][1] = "admin;";
		
		//2nd Row
		data[1][0] = "ADMIN";
		data[1][1] = "ADMIN";
		
		return data;
		
	}*/
	
	@Test
	
	public void setData() throws IOException{
		String uName;
		String password;
		excelDataProvider edp = new excelDataProvider();
		uName = edp.userName;
		password = edp.passWord;
		System.out.println("You provided the following UserName: " + uName);
		System.out.println("You provided the following Password: " + password);
		System.out.println("-------------------------------------------------");
	}
	
	

	
	

}
