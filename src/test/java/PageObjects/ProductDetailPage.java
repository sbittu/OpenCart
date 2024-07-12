package PageObjects;

import TestBase.BasePage;
import TestCase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {

    public ProductDetailPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath="//input[@id=\"input-quantity\"]")
    WebElement txtQuantity;

    @FindBy(xpath="//button[@id=\"button-cart\"]")
    WebElement btnAddToCart;

    @FindBy(xpath="//div[contains(text(),'Success: You have added')]")
    WebElement msgProductadded;

    public void setProductQuantity(String quantity)
    {
        txtQuantity.sendKeys(quantity);
    }

    public void ClickonAddToCart()
    {
        btnAddToCart.click();
    }

    public boolean confirmationmsgProductadded()
    {
    return msgProductadded.isDisplayed();
    }

}
