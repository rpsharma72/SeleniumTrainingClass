/**
 * 
 */
package com.herokuapp.testCases;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.pages.iFramePages;
import org.openqa.selenium.By;
import exercise2.ExcelConstant;
import exercise2.ExcelData;
import exercise2.baseTest;

/**
 * @author Raj
 * This test accesses the iFrame and types a message and verifies the message 
 * was correct.
 */
public class iFrameTest extends baseTest {

	public String hText1;
	public String iFrameHeading;
	public String msgTyped;
	public String iFrameMsg;
	
	@Test
	public void test() throws Exception {
		
		iFramePages iframeTest = PageFactory.initElements(driver, iFramePages.class); 
		ExcelData expVals = new ExcelData(ExcelConstant.datafilePath, ExcelConstant.dataFile);
		
		iframeTest.clickFramesLink();
		iframeTest.clickiFramesLink();
		iFrameHeading = iframeTest.iFrameHeading(hText1);
		if (iFrameHeading != null){
			System.out.println("--------------------------------------------------");
			System.out.println(iFrameHeading);
			System.out.println("--------------------------------------------------");
			Thread.sleep(4000);
			if (iframeTest.iFramefileMenu().isDisplayed()) {
				iframeTest.clickFileMenu();
				iframeTest.clickNewDocu();
				iframeTest.typeMessage(expVals.message);
				iFrameMsg = iframeTest.getiFrameMessage(msgTyped);
				System.out.println("--------------------------------------------------");
				System.out.println(iFrameMsg);
				System.out.println("--------------------------------------------------");
			}
			
		}
		
		
	}

}
