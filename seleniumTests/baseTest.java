package exercise2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {
	
	protected static WebDriver driver;
	public static String baseurl;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Raj/Documents/Orasi Software/Selenium/ChromeWebDriver/chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		baseurl = "https://the-internet.herokuapp.com";
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
		driver.quit();
	}
	
	@Before
	public void setUp() throws Exception {
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.get(baseurl);
	}


}
