/**
 * 
 */
package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import exercise2.baseTest;

/**
 * @author Raj
 * This class will have locators and methods for the iFrame page
 */
public class iFramePages extends baseTest {
	// Locator for Frames link from home page
	@FindBy(partialLinkText = "Frames")
	WebElement framesLink;
	
	// Locator for the iFrames link in the frames page
	@FindBy(linkText = "iFrame")
	WebElement iFrameLink;

	// Locator for the iFrame heading
	@FindBy(xpath = "//*[@id='content']/div/h3")
	WebElement iFrameHeading;
	
	// Locator for the iFrame "File" menu options
	@FindBy(id = "mceu_15-open")
	WebElement iFramefileMenu;
	
	// Locator for the New Document menu option
	@FindBy(id = "mceu_32-body")
	WebElement iFrameNewDocument;
	
	// Locator for the new document body
	@FindBy(id = "mce_0_ifr")
	WebElement iFrameTextBody;
	
	// Locator for the iFrame text box 
	@FindBy(css = "body")
	WebElement iFrameTextBox;
	
	
	public void clickFramesLink() {
		
		framesLink.click();
	}

	public void clickiFramesLink() {
		
		iFrameLink.click();
	}

	public String iFrameHeading(String hText1) {
		
		return iFrameHeading.getText();
	}
	
	public WebElement iFramefileMenu() {
		
		return driver.findElement((By)iFramefileMenu);
		
	}
	
	public void clickFileMenu() {
		
		iFramefileMenu.click();
	}
	
	public void clickNewDocu() {
		
		iFrameNewDocument.click();
	}
	
	public void typeMessage(String msg) {
		
		iFrameTextBody.sendKeys(msg);
	}
	
	public String getiFrameMessage(String msgTyped) {
		
		driver.switchTo().frame(iFrameTextBody);
		return iFrameTextBox.getText();
		 
	}
}
