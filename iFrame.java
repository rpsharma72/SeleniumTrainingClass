package exercise2;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import exercise2.ExcelData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrame extends baseTest{

	@Test
	public void iFrameTest() throws Exception {
		// iFrame Example
		ExcelData expVals = new ExcelData(ExcelConstant.datafilePath, ExcelConstant.dataFile);
		driver.findElement(By.linkText("Frames")).click(); 
		driver.findElement(By.linkText("iFrame")).click(); 
		// The line of code below retrieves the heading of the page and writes
		// to the console
		String hText1 = driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
		System.out.println(hText1);
		System.out.println("---------------------------------------------------------------------");
		// Code below starts a new document and types text in the text area
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		if (driver.findElement(By.id("mceu_15-open")).isDisplayed()); {
		assertTrue("The menu option displayed", true);
		driver.findElement(By.id("mceu_15-open")).click();
		}
		assertFalse("The Open menu option did not display", false);
		driver.findElement(By.id("mceu_31-body")).click();
		driver.findElement(By.id("mce_0_ifr")).sendKeys(expVals.message);
		WebElement frmebox = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
		driver.switchTo().frame(frmebox);
		WebElement mytxt = driver.findElement(By.cssSelector("body"));
		System.out.println("The script typed in the iFrame Text Area '" + mytxt.getText() + "'");
		System.out.println("---------------------------------------------------------------------");
	}

}
