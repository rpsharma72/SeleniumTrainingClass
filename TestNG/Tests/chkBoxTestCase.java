package testNG;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.herokuapp.pages.checkboxPages;

public class chkBoxTestCase extends baseTestNG{
	
	String pgHeading;
	String chkhead;
	
	@Test
	
	public void checkboxTestCase() {
		checkboxPages chkpg = PageFactory.initElements(driver, checkboxPages.class);
		SoftAssert softassert = new SoftAssert();
		//Step 1: Click on Checkboxes Link from the Homepage
		chkpg.clickchkboxesLink();
		//Step 2: Get the Checkboxes title page info
		pgHeading = chkpg.getchkboxestitle();
		softassert.assertEquals(pgHeading, "Checkboxes");
		//softassert.assertSame(pgHeading, "Checkboxes", "The Script landed on the correct page");
		//Step 3: Click on the first checkbox
		chkpg.clickfirstchkbox();
		//Step 4: Click on the second checkbox
		chkpg.clicksecondchkbox();
		
		softassert.assertAll();
		
		
	}

}
