package PageObjects;

import TestBase.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath="//input[@name='email']")
    WebElement txtLoginEmail;

    @FindBy(xpath="//input[@name='password']")
    WebElement txtLoginPassword;

    @FindBy(xpath="//input[@class='btn btn-primary']")
    WebElement lnkLoginbtn;

    public void setLoginEmail(String email)
    {
        txtLoginEmail.sendKeys(email);
    }

    public void setTxtLoginPassword(String password)
    {
        txtLoginPassword.sendKeys(password);
    }

    public void clickonLoginButton()
    {
        lnkLoginbtn.click();
    }
}
