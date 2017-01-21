package exercise2;

import static org.junit.Assert.*;

//import org.apache.xpath.operations.String;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControls extends baseTest{

	@Test
	public void dynamicControls() {
		//Dynamic Controls Code
				driver.findElement(By.partialLinkText("Dynamic Controls")).click();
				String dcHeading = driver.findElement(By.xpath("//*[@id='content']/div[1]/h4")).getText();
				if (dcHeading.equals("Dynamic Controls")); {
					driver.findElement(By.id("checkbox")).click();
					driver.findElement(By.id("btn")).click();
					WebDriverWait wait = new WebDriverWait(driver, 20);
					WebElement textElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
					String itsgone = textElement.getText();
					System.out.println("The text displayed " + "'" + itsgone +"'");
					System.out.println("-------------------------------------------------------------");
					driver.findElement(By.id("btn")).click();
					WebElement textElement1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
					String itsback = textElement1.getText();
					System.out.println("The text displayed " + "'" + itsback + "'");
					System.out.println("-------------------------------------------------------------");
				}
				}
		
}


