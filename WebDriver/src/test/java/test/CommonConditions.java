package test;


import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//@Listeners({TestListener.class})
public class CommonConditions {

  WebDriver driver;


  @BeforeMethod()
  public void setUp() {
    driver = DriverSingleton.getDriver();
  }

  @AfterMethod(alwaysRun = true)
  public void stopBrowser() {
    DriverSingleton.closeDriver();
  }
}
