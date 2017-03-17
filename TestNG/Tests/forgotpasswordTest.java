package testNG;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.herokuapp.pages.textboxPages;

public class forgotpasswordTest extends baseTestNG{
  @Test
  public void forgotpasswordTest() {
	  
	  textboxPages fpTest = PageFactory.initElements(driver, textboxPages.class);
	  
	  //Step 1: Click on the Forgotpassword Link
	  fpTest.clickfpLink();
	  //Step 2: Enter email address in the field
	  fpTest.enteremail();
	  //Step 3: Click on the Retrieve Button
	  fpTest.clickretrievebtn();
	  //Step 4: Retrieve the email message
	  String fpMessage = fpTest.getmessage();
	  System.out.println("--------------------------------------------");
	  System.out.println(fpMessage);
	  System.out.println("--------------------------------------------");
  }
}
