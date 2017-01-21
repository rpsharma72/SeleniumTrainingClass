package exercise2;

import static org.junit.Assert.*;

import java.io.IOException;
import exercise2.ExcelData;
//import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

public class dropdown extends baseTest{

	@Test
	public void test() throws Exception {
		ExcelData expVals = new ExcelData(ExcelConstant.datafilePath, ExcelConstant.dataFile);
		driver.findElement(By.partialLinkText("Dropdown")).click();
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText(expVals.dropSelection);
        //Assert.assertEquals("Option 1", "Option 1");
        String dpSelection = dropdown.getFirstSelectedOption().getText();
        //Assert.assertNotNull(dpSelection);
        assertEquals("Option 1", dpSelection );
        //Assert.assertNull(dpSelection);
        System.out.println(dpSelection);
        System.out.println("-------------------------------------------");
	}

}
