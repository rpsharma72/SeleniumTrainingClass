/**
 * 
 */
package com.herokuapp.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import exercise2.ExcelConstant;
import exercise2.ExcelData;
import exercise2.baseTest;

/**
 * @author Raj
 * This class inserts an email address and verifies if an email was sent.
 */
public class forgotPasswordPage extends baseTest {

	public String linkText = "Forgot Password";
	
	By forgotpass = By.partialLinkText(linkText);
	By emailField = By.id("email");
	By retrivepassbtn = By.xpath("//*[@id='form_submit']/i");
	By emailmsg = By.id("content");
	
	
	public void clickonForgotPass() {
		//This method clicks on the Forgot Password link.
		driver.findElement(forgotpass).click();
		
	}
	
	public void enteremailaddress() throws Exception {
		/*This method will retrieve the email address from excel spreadsheet and 
		 * enter the email address in the field.
		 */
		ExcelData expVals = new ExcelData(ExcelConstant.datafilePath, ExcelConstant.dataFile);
		driver.findElement(emailField).sendKeys(expVals.email);
		
	}
	
	public void clickRetrievePasswordBtn() {
		//This method will click on the Retrieve Password button
		driver.findElement(retrivepassbtn);
	}
	
	public String successemailmessage() {
		/*This method retrieves the successful email message
		 * once an email is typed in the email field.
		 */
		return driver.findElement(emailmsg).getText();
			
	}
}
