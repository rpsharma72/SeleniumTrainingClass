package exercise2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sAlerts extends baseTest{

	@Test
	public void jsAlerts() {
		//Code for JAVA Script Alerts
				driver.findElement(By.partialLinkText("JavaScript Alerts")).click();
				String pageHeading = driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
				assertEquals(pageHeading, "JavaScript Alerts");
				driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
				// Switch focus to the Alert Box
				String alertText ="";
				try{
					WebDriverWait wait = new WebDriverWait(driver,3);
					Alert alert = wait.until(ExpectedConditions.alertIsPresent());
					alertText = alert.getText();
					System.out.println("---------------------------------------------------------------------");
					System.out.print(alertText);
					System.out.println(" ");
					System.out.println("---------------------------------------------------------------------");
					alert.accept();
				}catch(TimeoutException te){
					System.out.println("Alert did not appear");
					throw te;
				}
				
				driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
				String alertText2 = "";
				try {
					WebDriverWait wait1 = new WebDriverWait (driver, 5);
					Alert alert1 = wait1.until(ExpectedConditions.alertIsPresent());
					alertText2 = alert1.getText();
					System.out.println(alertText2);
					alert1.dismiss();
				}
				catch(TimeoutException te) {
					System.out.println("Alert did not display");
					throw te;
					
				}
			}
}
