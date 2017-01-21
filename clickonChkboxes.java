/**
 * 
 */
package com.herokuapp.testCases;

import static org.junit.Assert.*;
import org.junit.Test;
import com.herokuapp.pages.checkboxesPage;
import exercise2.baseTest;
/**
 * @author Raj
 *
 */

public class clickonChkboxes extends baseTest{
  
	public String cbTitle;
	
	@Test
	public void clickonchkboxes() {
	  
		checkboxesPage chkbox = new checkboxesPage();
			chkbox.clickChkboxLink();
			cbTitle = chkbox.getchkboxtitle();
			if (cbTitle.equals("Checkboxes")) {
				System.out.println(cbTitle);
				chkbox.clickCheckbox1();
				chkbox.clickCheckbox2();
			}
			else {
				System.out.println("The Checkboxes page did not display");
			}
			
					
  }
}

