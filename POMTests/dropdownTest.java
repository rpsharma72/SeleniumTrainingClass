/**
 * 
 */
package com.herokuapp.testCases;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.herokuapp.pages.dropdownPage;

import exercise2.ExcelConstant;
import exercise2.ExcelData;
import exercise2.baseTest;



/**
 * @author Raj
 * This test selects a value from the dropdown and verifies the correct selection
 * was made.
 */
public class dropdownTest extends baseTest{
	String dpdSelection;
	String dpdSelectedVal;
	@Test
	public void dropdown() throws Exception {

		dropdownPage dpdPage = PageFactory.initElements(driver, dropdownPage.class);
		ExcelData expVals = new ExcelData(ExcelConstant.datafilePath, ExcelConstant.dataFile);
		dpdSelection = expVals.dropSelection;
		dpdPage.clickdropdownlink();
		dpdPage.selectdpValue(dpdSelection);
		dpdSelectedVal = dpdPage.selecteddropdownvalue();
		Assert.assertEquals(dpdSelectedVal, dpdSelection);
		System.out.println(dpdSelectedVal);

	}

}
