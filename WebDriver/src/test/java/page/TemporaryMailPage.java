package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TemporaryMailPage extends AbstractPage {
  TemporaryMailPage(WebDriver driver)
  {
    super(driver);
    PageFactory.initElements(this.driver, this);
  }
  private final String BASE_URL = "https://temp-mail.org/ru/";
  public static String TEMP_EMAIL;
  public static String PriceOnPost;

  @FindBy(xpath = "//*[@class='title-subject']")
  private
  WebElement titleNewPost;
  @FindBy(xpath = "//td[contains(text(),'USD 1,187.77')]")
  private
  WebElement dataOnTableNewPost;
  @FindBy(id = "mail")
  private WebElement temporaryMail;
  public PricingCalculatorPage getTemporaryMail(){
    isCurrentElementPresent(temporaryMail);
    TEMP_EMAIL = temporaryMail.getAttribute("value");
    return new PricingCalculatorPage(driver);
  }
  private boolean isCurrentElementPresent(WebElement element)
  {
    WebElement labelEmptyRepoSetupOption = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
            .until(ExpectedConditions.visibilityOf(element));
    return labelEmptyRepoSetupOption.isDisplayed();
  }
  public String getPriceOnMessage(){

    new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(titleNewPost)).click();
    titleNewPost.click();
    isCurrentElementPresent(dataOnTableNewPost);
    return dataOnTableNewPost.getText();
  }
  public TemporaryMailPage openMainPage()
  {
    driver.navigate().to(BASE_URL);
    return this;
  }
}
