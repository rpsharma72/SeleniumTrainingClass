/**
 * 
 */
package com.herokuapp.testCases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.herokuapp.pages.forgotPasswordPage;

import exercise2.ExcelConstant;
import exercise2.ExcelData;
import exercise2.baseTest;
import junit.framework.Assert;

/**
 * @author Raj
 *
 */
public class forgotPasswordTest extends baseTest{
	
	public String emsg;

	@Test
	public void forgotpassword() throws Exception {
		forgotPasswordPage fpp = new forgotPasswordPage();
		fpp.clickonForgotPass();
		fpp.enteremailaddress();
		fpp.clickRetrievePasswordBtn();
		emsg = fpp.successemailmessage();
		System.out.println(emsg);
		
	}

}
