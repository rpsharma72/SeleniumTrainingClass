package exercise2;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import exercise2.ExcelData;


public class basicAuth extends baseTest {

	@Test

	public void test() throws Exception {
		ExcelData expVals = new ExcelData(ExcelConstant.datafilePath, ExcelConstant.dataFile);
		//ExcelData excelData = new ExcelData(ExcelConstant.datafilePath, ExcelConstant.dataFile);
		if (expVals.userName != null){
			String url = "https://" + expVals.userName + ":" + expVals.passWord + "@" + "the-internet.herokuapp.com/basic_auth";
			driver.get(url);
			if (driver.findElement(By.xpath("//*[@id='content']/div/p")).isDisplayed()){ 
			
				String authText = driver.findElement(By.xpath("//*[@id='content']/div/p")).getText();
				Assert.assertEquals(authText, "Congratulations! You must have the proper credentials.");
				System.out.println("----------------------------------------------------------------");
				System.out.println(authText);
				System.out.println("----------------------------------------------------------------");
			} else {
				System.out.println("Test Aborted");
				System.out.println("The User Name and Password are not valid: " + expVals.userName + " - " + expVals.passWord);
			}
		}
		
	}

}
