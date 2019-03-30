package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GCPPricingPage extends AbstractPage {
  GCPPricingPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(this.driver, this);
  }

  private final String BASE_URL = "https://cloud.google.com/pricing/";

  @FindBy(xpath = "//a[@track-name='pricingNav/calculators']")
  private WebElement linkCalculatorPage;

  private boolean isCurrentElementPresent(WebElement element) {
    WebElement labelEmptyRepoSetupOption = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
            .until(ExpectedConditions.visibilityOf(element));
    return labelEmptyRepoSetupOption.isDisplayed();
  }

  public PricingCalculatorPage forwardToPricingCalculatorPage() {
    if (isCurrentElementPresent(linkCalculatorPage)) {
      linkCalculatorPage.click();
    }
    return new PricingCalculatorPage(driver);
  }

  @Override
  public GCPPricingPage openMainPage() {
    driver.navigate().to(BASE_URL);
    return this;
  }
}
