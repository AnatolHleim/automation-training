package googlecloud;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class CloudDriver {
  private static final String CLOUD_GOOGLE = "https://cloud.google.com/";
  private static final String TEMPORARY_MAIL = "https://cloud.google.com/";
  private static WebDriverWait waitDriver;
  private static Actions action;

  private CloudDriver() {
  }

  private static WebElement isElementClickable(By by) {
    action.moveToElement(waitDriver.until(ExpectedConditions.elementToBeClickable(by))).perform();
    return waitDriver.until(ExpectedConditions.elementToBeClickable(by));
  }

  private static WebElement isElementPresent(By by) {
    return waitDriver.until(ExpectedConditions.presenceOfElementLocated(by));
  }

  private By buttonExploreAllElementLocator = By.xpath("//a[@track-name='exploreProducts']");
  private By buttonSeePricingLocator = By.xpath("//a[@track-name='seePricing']");
  private By linkCalculatorsLocator = By.xpath("//a[@track-name='pricingNav/calculators']");
  private By tabComputeEngineLocator = By.className("hexagon-in2");
  private static By frameOnPageCalculatorLocator = By.id("idIframe");
  private By fieldNumberOfInstancesLocator = By.xpath("//input[@ng-model='listingCtrl.computeServer.quantity']");
  private By operationSystemLocator = By.id("select_58");
  private By valueOperationSystemLocator = By.id("select_option_48");
  private By vmClassLocator = (By.id("select_value_label_41"));
  private By valueVmClassLocator = By.id("select_option_60");
  private By instanceTypeLocator = By.id("select_93");
  private By valueInstanceTypeLocator = By.id("select_option_70");
  private By checkBoxAddGPULocator = By.xpath("//div[@class='md-container md-ink-ripple']");
  private By countGPULocator = By.id("select_value_label_327");
  private By valueCountGPULocator = By.id("select_option_334");
  private By typeGPULocator = By.id("select_value_label_328");
  private By valueTypeGPULocator = By.id("select_option_341");
  private By listSSDArrowLocator = By.id("select_value_label_43");
  private By valueSSDLocator = By.id("select_option_182");
  private By listRegionLocator = By.id("select_value_label_44");
  private By valueRegionLocator = By.id("select_option_196");
  private By listCommittedUsageLocator = By.id("select_value_label_45");
  private By committedUsage1YearLocator = By.id("select_option_100");
  private By buttonAddToEstimateLocator = By.xpath("//button[@ng-disabled='ComputeEngineForm.$invalid || listingCtrl.unsuportedVmType']");
  private By labelTotalAmountLocator = By.xpath("//b[@class='ng-binding']");
  private By buttonToShowFormSendLocator = By.id("email_quote");
  private By fieldEmailOnSendFormLocator = By.xpath("//input[@ng-model='emailQuote.user.email']");
  private By sendEmailButtonLocator = By.xpath("//button[text()[contains(.,'Send Email')]]");
  private By titleNewPostLocator = By.xpath("//*[@class=\"title-subject\"]");
  private By dataOnTableNewPostLocator = By.xpath("//*[@class=\"title-subject\"]");

  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    action = new Actions(driver);
    waitDriver = new WebDriverWait(driver, 10);
    CloudDriver cloudDriver = new CloudDriver();
    driver.get(CLOUD_GOOGLE);
    driver.manage().window().maximize();
    isElementClickable(cloudDriver.buttonExploreAllElementLocator).click();
    isElementClickable(cloudDriver.buttonSeePricingLocator).click();
    isElementClickable(cloudDriver.linkCalculatorsLocator).click();
    waitDriver.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameOnPageCalculatorLocator));
    isElementClickable(cloudDriver.tabComputeEngineLocator).click();
    isElementPresent(cloudDriver.fieldNumberOfInstancesLocator).sendKeys("4");
    isElementClickable(cloudDriver.operationSystemLocator).click();
    isElementClickable(cloudDriver.valueOperationSystemLocator).click();
    isElementClickable(cloudDriver.vmClassLocator).click();
    isElementClickable(cloudDriver.valueVmClassLocator).click();
    isElementClickable(cloudDriver.instanceTypeLocator).click();
    isElementClickable(cloudDriver.valueInstanceTypeLocator).click();
    isElementClickable(cloudDriver.checkBoxAddGPULocator).click();
    isElementClickable(cloudDriver.countGPULocator).click();
    isElementClickable(cloudDriver.valueCountGPULocator).click();
    isElementClickable(cloudDriver.typeGPULocator).click();
    isElementClickable(cloudDriver.valueTypeGPULocator).click();
    isElementClickable(cloudDriver.listSSDArrowLocator).click();
    isElementClickable(cloudDriver.valueSSDLocator).click();
    isElementClickable(cloudDriver.listRegionLocator).click();
    isElementClickable(cloudDriver.valueRegionLocator).click();
    isElementClickable(cloudDriver.listCommittedUsageLocator).click();
    isElementClickable(cloudDriver.committedUsage1YearLocator).click();
    isElementClickable(cloudDriver.buttonAddToEstimateLocator).click();
    String totalAmount = isElementPresent(cloudDriver.labelTotalAmountLocator).getText().substring(26, 38);
    ((JavascriptExecutor) driver).executeScript("window.open()");
    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    driver.get(TEMPORARY_MAIL);
    String post = isElementPresent(By.id("mail")).getAttribute("value");
    driver.switchTo().window(tabs.get(0));
    driver.switchTo().frame(isElementPresent(frameOnPageCalculatorLocator));
    isElementClickable(cloudDriver.buttonToShowFormSendLocator).click();
    isElementPresent(cloudDriver.fieldEmailOnSendFormLocator).sendKeys(post);
    isElementClickable(cloudDriver.sendEmailButtonLocator).click();
    driver.switchTo().window(tabs.get(1));
    isElementClickable(cloudDriver.titleNewPostLocator).click();
    Assert.assertEquals(totalAmount, isElementPresent(cloudDriver.dataOnTableNewPostLocator).getText());
    driver.quit();

  }
}