package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends AbstractPage {
  private final String BASE_URL = "https://cloud.google.com/";

  @FindBy(xpath = "//a[@track-name='exploreProducts']")
  private WebElement buttonExploreAllElement;

  private boolean isCurrentElementPresent(WebElement element) {
    WebElement labelEmptyRepoSetupOption = new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
            .until(ExpectedConditions.visibilityOf(element));
    return labelEmptyRepoSetupOption.isDisplayed();
  }

  public MainPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(this.driver, this);
  }

  public ProductAndServicesPage forwardToProductPage() {
    if (isCurrentElementPresent(buttonExploreAllElement)) {
      buttonExploreAllElement.click();
    }
    return new ProductAndServicesPage(driver);
  }


  public MainPage openMainPage() {
    driver.navigate().to(BASE_URL);
    return this;
  }

}
