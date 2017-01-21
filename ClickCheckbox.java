package exercise2;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;


import org.junit.Test;
import org.openqa.selenium.By;


public class ClickCheckbox extends baseTest{
	@Test
	public void test() {
		
		driver.findElement(By.partialLinkText("Checkboxes")).click();
		driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
		driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Clicked on the checkbox");
	}

}
