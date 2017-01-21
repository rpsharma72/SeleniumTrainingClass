/**
 * 
 */
package com.herokuapp.pages;

import org.openqa.selenium.By;

import exercise2.baseTest;

/**
 * @author Raj
 *   This class will store the locators and methods of checkboxes page
 */
public class checkboxesPage extends baseTest {
	

	By chkboxLink = By.xpath("//*[@id='content']/ul/li[5]/a");
	By chkboxTitle = By.xpath("//*[@id='content']/div/h3");
	By firstchkbox = By.xpath("//*[@id='checkboxes']/input[1]");
	By secondchkbox = By.xpath("//*[@id='checkboxes']/input[2]");
	
	
	public void clickChkboxLink() {
		
		driver.findElement(chkboxLink).click();
		
	}
	
	public String getchkboxtitle() {
		
		return driver.findElement(chkboxTitle).getText();
	}
	
	public void clickCheckbox1() {
		
		driver.findElement(firstchkbox).click();
	}
	
	public void clickCheckbox2() {
		
		driver.findElement(secondchkbox).click();
	}
}
