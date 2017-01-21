package exercise2;

import static org.junit.Assert.*;

import java.io.IOException;
import exercise2.ExcelData;
import org.junit.Test;
import org.openqa.selenium.By;

public class TextBox extends baseTest {

	@Test
	public void test() throws Exception {
		ExcelData expVals = new ExcelData(ExcelConstant.datafilePath, ExcelConstant.dataFile);
		driver.findElement(By.partialLinkText("Forgot Password")).click();
        driver.findElement(By.id("email")).sendKeys(expVals.email);
        driver.findElement(By.xpath("//*[@id='form_submit']/i")).click();
        String emailmsg = driver.findElement(By.id("content")).getText();
        System.out.println("-------------------------------------------");
        System.out.println(emailmsg);
        System.out.println("-------------------------------------------");
		
	}

}
