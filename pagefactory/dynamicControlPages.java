/**
 * 
 */
package com.herokuapp.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

import exercise2.baseTest;

/**
 * @author Raj
 *
 */
public class dynamicControlPages extends baseTest {
	
	String msg;
	
	//Locate the Dynamic Controls link on the homepage
	@FindBy(partialLinkText = "Dynamic Controls")
	WebElement dcLink;
	
	//Locate the Dynamic Controls heading
	@FindBy(xpath = "//*[@id='content']/div[1]/h4")
	WebElement dcHeading;
	
	//Locate the Dynamic Control checkbox
	@FindBy(id = "checkbox")
	WebElement aChkbox;
	
	//Locate the Dynamic Control 'Remove' & 'Add' button
	@FindBy(id = "btn")
	WebElement dynamicControlBtn;
	
	//Locate the Dynamic Control message 'It's gone'
	@FindBy(id = "message")
	WebElement itsbackmsg;
	
	//This method will click on the Dynamic Control link from homepage
	public void clickdynamicControllink() {
		dcLink.click();
	}
	
	//This method will get the heading and return for verification
	public String getdcHeading(String dcHead) {
		return dcHeading.getText();
	}
	
	//This method will click on the checkbox in the Dynamic Control page
	public void clickchkbox() {
		aChkbox.click();
	}
	
	//This method will click on the 'Remove' button
	public void clickdcbtn() {
		dynamicControlBtn.click();
	}
	
	//This method will retrieve and verify the 'It's back' message
	public String itsbackmsg(String msg) {
		return itsbackmsg.getText();
	}
	
	public WebElement webdriverWait(WebElement txtElement) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		txtElement = wait.until(ExpectedConditions.visibilityOf(itsbackmsg));
		return itsbackmsg;
	}



}
