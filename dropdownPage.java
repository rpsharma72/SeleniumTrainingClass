/**
 * 
 */
package com.herokuapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import exercise2.baseTest;

/**
 * @author Raj
 *  The methods in this class will find the links and dropdown values and select
 *  a specific value from the dropdown.
 */
public class dropdownPage extends baseTest{
	
	@FindBy(partialLinkText = "Dropdown") 
	WebElement dropdownlink;
	
	@FindBy(id = "dropdown")
	WebElement dropdown;
	
	@FindBy(xpath = "//*[@id='dropdown']/option[2]")
	WebElement selectedval;

	
	public void clickdropdownlink() {
		
		dropdownlink.click();
	}
	
	public void selectdpValue(String dpdSelection) throws Exception{
		Select dpVal = new Select(dropdown);
		dpVal.selectByVisibleText(dpdSelection);
		
	}
	
	public String selecteddropdownvalue () {
		
		return selectedval.getText();
	}

}
