package com.herokuapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testNG.baseTestNG;

public class textboxPages extends baseTestNG{
	
	@FindBy(partialLinkText = "Forgot Password")
	WebElement fpLink;
	
	@FindBy(id = "email")
	WebElement emailfield;
	
	@FindBy(xpath = "//*[@id='form_submit']/i")
	WebElement retrieveBtn;
	
	@FindBy(id = "content")
	WebElement emailmsg;
	
	public void clickfpLink(){
		fpLink.click();
	}
	
	public void enteremail(){
		emailfield.sendKeys("test@test.com");
	}
	
	public void clickretrievebtn() {
		retrieveBtn.click();
	}
	
	public String getmessage() {
		
		return emailmsg.getText();
	}

}
