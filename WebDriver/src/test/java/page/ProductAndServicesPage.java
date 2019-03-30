package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductAndServicesPage extends AbstractPage {
  ProductAndServicesPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(this.driver, this);
  }

  private final String BASE_URL = "https://cloud.google.com/products/";


  @FindBy(xpath = "//a[@track-name='seePricing']")
  private WebElement buttonSeePricing;

  private boolean isCurrentElementPresent(WebElement element) {
    WebElement labelEmptyRepoSetupOption = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
            .until(ExpectedConditions.visibilityOf(element));
    return labelEmptyRepoSetupOption.isDisplayed();
  }

  public GCPPricingPage forwardGCPPricingPage() {
    if (isCurrentElementPresent(buttonSeePricing)) {
      buttonSeePricing.click();
    }
    return new GCPPricingPage(driver);
  }

  @Override
  public ProductAndServicesPage openMainPage() {
    driver.navigate().to(BASE_URL);
    return this;
  }
}
