package exercise2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Exercise1 {

	
	protected static String baseurl;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		baseurl = "https://the-internet.herokuapp.com";
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		//Checkbooks Exercise
		driver.findElement(By.partialLinkText("Checkboxes")).click();
		driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
		driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Clicked on the checkbox");
		driver.get(baseurl);
		
		//
		driver.findElement(By.partialLinkText("Forgot Password")).click();
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//*[@id='form_submit']/i")).click();
        String emailmsg = driver.findElement(By.id("content")).getText();
        System.out.println("-------------------------------------------");
        System.out.println(emailmsg);
        System.out.println("-------------------------------------------");
        driver.get(baseurl);
        
        //
      //Dropdowns Code
        driver.findElement(By.partialLinkText("Dropdown")).click();
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 1");
        //Assert.assertEquals("Option 1", "ption 1");
        String dpSelection = dropdown.getFirstSelectedOption().getText();
        //Assert.assertNotNull(dpSelection);
        Assert.assertEquals("Option 1", dpSelection );
        //Assert.assertNull(dpSelection);
        System.out.println(dpSelection);
        System.out.println("-------------------------------------------");
        driver.get(baseurl);
        
        //Hovering Example
        driver.findElement(By.partialLinkText("Hover")).click();
		WebElement hvr = driver.findElement(By.xpath("//*[@id='content']/div/div[1]/img"));
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.moveToElement(hvr).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		If(driver.findElement(By.xpath("//*[@id='content']/div/div[1]/div/a")).isDisplayed());
		{
			driver.findElement(By.linkText("View profile")).click();
			System.out.println("The View Profile link displayed and clicked.");
			System.out.println("---------------------------------------------------------------------");
		}
		WebElement nFound = driver.findElement(By.xpath("/html/body/h1"));
		String text = nFound.getText();
		Assert.assertEquals(text, "Not Found");
		driver.get(baseurl);
        
		//Try/catch example
		// Example about try/catch
		 		driver.findElement(By.linkText("Dynamic Loading")).click();
		 		driver.findElement(By.partialLinkText("Example 1")).click();
		 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 		String hText = driver.findElement(By.xpath("//*[@id='content']/div/h4")).getText();
		 		String hWorld = "";
		 		if (hText.equalsIgnoreCase("Example 1: Element on page that is hidden")) {
		 			driver.findElement(By.xpath("//*[@id='start']/button")).click();
		 			Assert.assertTrue(true, "The 'Start' button was displayed and Clicked");
		 			System.out.println("The 'Start' button was clicked");
		 			try {

		 				WebDriverWait wait = new WebDriverWait(driver, 10);
		 				WebElement textElement = wait
		 						.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("finish"))));
		 				hWorld = textElement.getText();
		 				System.out.println("The text " + hWorld + " displayed on the screen");
		 				System.out.println("---------------------------------------------------------------------");

		 			} catch (TimeoutException | NoSuchElementException te) {
		 				System.out.println("This code is messed up!!!");
		 				System.out.println("---------------------------------------------------------------------");
		 				throw te;
		 			}
		 		}
		 		driver.get(baseurl);
		
        driver.close();
		driver.quit();
	}
	private static void If(boolean displayed) {
		// TODO Auto-generated method stub
		
	}

}
