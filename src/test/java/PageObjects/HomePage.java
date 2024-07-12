package PageObjects;

import TestBase.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title=\"My Account\"]")
    WebElement lnkMyAccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement lnkRegister;

    @FindBy(xpath="//a[normalize-space()='Login']")
    WebElement lnkLoginButton;

    @FindBy(xpath = "//input[@name=\"search\"]")
    WebElement txtSearchBox;

    @FindBy(xpath = "//button[@class=\"btn btn-default btn-lg\"]")
    WebElement btnSearch;

    @FindBy(xpath="//span[normalize-space()='Shopping Cart']")
    WebElement lnkShoppingCart;

    public void ClickMyAccount() {
        lnkMyAccount.click();
    }

    public void ClickOnRegister()
    {
        lnkRegister.click();
    }

    public void clickLoginButton()
    {
        lnkLoginButton.click();
    }
    public void setSearchtext(String searchtext) {
        txtSearchBox.sendKeys(searchtext);
    }

    public void setClickOnSearchbutton()
    {
        btnSearch.click();
    }

    public void clickOnShoopingCart()
    {
        lnkShoppingCart.click();
    }
}
