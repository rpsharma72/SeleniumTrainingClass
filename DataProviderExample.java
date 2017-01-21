package exercise2;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderExample {
  @Test(dataProvider = "credentials")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      new Object[] { "admin", "admin" }
  };
}}
