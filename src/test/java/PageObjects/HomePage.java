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
}
