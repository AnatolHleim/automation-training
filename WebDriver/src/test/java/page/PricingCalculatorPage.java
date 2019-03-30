package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class PricingCalculatorPage extends AbstractPage {
  public static String resultOnForm;

  PricingCalculatorPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(this.driver, this);

  }

  private WebDriverWait webDriverWait = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS);
  private final String BASE_URL = "https://cloud.google.com/products/calculator/";


  @FindBy(className = "hexagon-in2")
  private WebElement tabComputeEngine;
  @FindBy(id = "idIframe")
  private
  WebElement frameOnPageCalculator;
  @FindBy(xpath = "//input[@ng-model='listingCtrl.computeServer.quantity']")
  private
  WebElement fieldNumberOfInstances;
  @FindBy(id = "select_60")
  private
  WebElement operationSystem;
  @FindBy(id = "select_option_50")
  private
  WebElement valueOperationSystem;
  @FindBy(id = "select_value_label_43")
  private
  WebElement vmClass;
  @FindBy(id = "select_option_62")
  private
  WebElement valueVmClass;
  @FindBy(id = "select_95")
  private
  WebElement instanceType;
  @FindBy(id = "select_option_72")
  private
  WebElement valueInstanceType;
  @FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
  private
  WebElement checkBoxAddGPU;
  @FindBy(id = "select_value_label_329")
  private
  WebElement countGPU;
  @FindBy(id = "select_option_337")
  private
  WebElement valueCountGPU;
  @FindBy(id = "select_value_label_330")
  private
  WebElement typeGPU;
  @FindBy(id = "select_option_341")
  private
  WebElement valueTypeGPU;
  @FindBy(id = "select_value_label_45")
  private
  WebElement listSSDArrow;
  @FindBy(id = "select_option_184")
  private
  WebElement valueSSD;
  @FindBy(id = "select_value_label_46")
  private
  WebElement listRegion;
  @FindBy(id = "select_option_198")
  private
  WebElement valueRegion;
  @FindBy(id = "select_value_label_47")
  private
  WebElement listCommittedUsage;
  @FindBy(id = "select_option_102")
  private
  WebElement committedUsage1Year;
  @FindBy(xpath = "//button[@ng-disabled='ComputeEngineForm.$invalid || listingCtrl.unsuportedVmType']")
  private
  WebElement buttonAddToEstimate;
  @FindBy(xpath = "//b[@class='ng-binding']")
  private
  WebElement labelTotalAmount;
  @FindBy(id = "email_quote")
  private
  WebElement buttonToShowFormSend;
  @FindBy(xpath = "//input[@ng-model='emailQuote.user.email']")
  private
  WebElement fieldEmailOnSendForm;
  @FindBy(xpath = "//button[text()[contains(.,'Send Email')]]")
  private
  WebElement sendEmailButton;


  private WebElement isCurrentElementPresent(WebElement element) {
    new Actions(driver).moveToElement(webDriverWait.until(ExpectedConditions.visibilityOf(element))).perform();
    return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
            .until(ExpectedConditions.visibilityOf(element));
  }

  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

  public TemporaryMailPage initDataOnPageCalculator() {

    new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameOnPageCalculator));
    isCurrentElementPresent(tabComputeEngine).click();
    fieldNumberOfInstances.sendKeys("4");
    isCurrentElementPresent(operationSystem).click();
    isCurrentElementPresent(valueOperationSystem).click();
    isCurrentElementPresent(vmClass).click();
    isCurrentElementPresent(valueVmClass).click();
    isCurrentElementPresent(instanceType).click();
    isCurrentElementPresent(valueInstanceType).click();
    isCurrentElementPresent(checkBoxAddGPU).click();
    isCurrentElementPresent(countGPU).click();
    isCurrentElementPresent(valueCountGPU).click();
    isCurrentElementPresent(typeGPU).click();
    isCurrentElementPresent(valueTypeGPU).click();
    isCurrentElementPresent(listSSDArrow).click();
    isCurrentElementPresent(valueSSD).click();
    isCurrentElementPresent(listRegion).click();
    isCurrentElementPresent(valueRegion).click();
    isCurrentElementPresent(listCommittedUsage).click();
    isCurrentElementPresent(committedUsage1Year).click();
    isCurrentElementPresent(buttonAddToEstimate).click();
    isCurrentElementPresent(labelTotalAmount);
    resultOnForm = isCurrentElementPresent(labelTotalAmount).getText().substring(26, 38);
    ((JavascriptExecutor) driver).executeScript("window.open()");
    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    return new TemporaryMailPage(driver).openMainPage();
  }

  public TemporaryMailPage sendEmailOnForm() {

    driver.switchTo().window(tabs.get(0));
    driver.switchTo().frame(frameOnPageCalculator);
    isCurrentElementPresent(buttonToShowFormSend).click();
    isCurrentElementPresent(fieldEmailOnSendForm).sendKeys(TemporaryMailPage.TEMP_EMAIL);
    new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElementValue(fieldEmailOnSendForm, TemporaryMailPage.TEMP_EMAIL));
    sendEmailButton.click();
    driver.switchTo().window(tabs.get(1));
    return new TemporaryMailPage(driver);
  }

  public PricingCalculatorPage openMainPage() {
    driver.navigate().to(BASE_URL);
    return this;
  }
}
