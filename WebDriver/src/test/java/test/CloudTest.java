package test;


import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;
import page.PricingCalculatorPage;

public class CloudTest extends CommonConditions {

  @Test()
  public void verifyDataOnCalculateFormAndEmailMessageEquals() {
    String priceOnCalculator = new MainPage(driver)
            .openMainPage()
            .forwardToProductPage()
            .forwardGCPPricingPage()
            .forwardToPricingCalculatorPage()
            .initDataOnPageCalculator()
            .openMainPage()
            .getTemporaryMail()
            .sendEmailOnForm()
            .getPriceOnMessage();

    Assert.assertEquals(priceOnCalculator, PricingCalculatorPage.resultOnForm);

  }
}
