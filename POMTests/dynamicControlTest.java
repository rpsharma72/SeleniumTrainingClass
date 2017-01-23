/**
 * 
 */
package com.herokuapp.testCases;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.pages.dynamicControlPages;

import exercise2.baseTest;

/**
 * @author Raj
 * This test will validate the dynamic control functionality
 */
public class dynamicControlTest extends baseTest {

	String dcHead;
	String pageHeading;
	WebElement txtElement;
	String txtmsg;
	String msg;
	
	@Test
	public void test() {
		//Initialize Pagefactory
		dynamicControlPages dcp = PageFactory.initElements(driver, dynamicControlPages.class);
		
		//Step 1 - Click on Dynamic Control Link
		dcp.clickdynamicControllink();
		
		//Step 2 - Validate Script landed on the Dynamic Control page
		pageHeading = dcp.getdcHeading(dcHead);
		if (pageHeading.equalsIgnoreCase("Dynamic Controls")) {
			System.out.println("-------------------------------------------------------");
			System.out.println("The script landed on the " + "'"+ pageHeading + "'" + " page.");
			System.out.println("-------------------------------------------------------");
		} else {
			System.out.println("---------------------------------------------");
			System.out.println("The script DID NOT lad on the correct page");
			System.out.println("---------------------------------------------");
		}
		
		//Step 3 - Click on the checkbox and then click on Remove button
		
		try {
			dcp.clickchkbox();
			dcp.clickdcbtn();
			dcp.webdriverWait(txtElement);
			//System.out.println(txtElement);
		}
		catch (TimeoutException te){
			throw te;
		}
		
		//Step 4 - Verify the message "It's gone" is displayed.
		txtmsg = dcp.itsbackmsg(msg);
		if (txtmsg.equalsIgnoreCase("It's gone!")) {
			System.out.println("---------------------------------------------");
			System.out.println("The message displayed is: " + txtmsg);
			System.out.println("---------------------------------------------");
		}
		else {
			System.out.println("---------------------------------------------");
			System.out.println("The incorrect message displayed: " + txtmsg);
			System.out.println("---------------------------------------------");
		}
		
		//Step 5 - Click on the Add button
		
		dcp.clickdcbtn();
		
		//Step 6 - Verify "It's back!" text displays
		try {
			dcp.webdriverWait(txtElement);
			txtmsg = dcp.itsbackmsg(msg);
			if (txtmsg.equalsIgnoreCase("It's back!")) {
				System.out.println("---------------------------------------------");
				System.out.println("The message displayed is: " + txtmsg);
				System.out.println("---------------------------------------------");
			}
			else {
				System.out.println("---------------------------------------------");
				System.out.println("The incorrect message displayed: " + txtmsg);
				System.out.println("---------------------------------------------");
			}
		}
		catch (TimeoutException te) {
			throw te;
		}
	}

}
