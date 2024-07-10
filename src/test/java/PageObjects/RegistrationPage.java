package PageObjects;

import TestBase.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver)
    {
     super(driver);
    }

    @FindBy(xpath="//*[@name=\"firstname\"]")
    WebElement txtFirstName;

    @FindBy(xpath="//*[@name=\"lastname\"]")
    WebElement txtLastName;

    @FindBy(xpath="//*[@name=\"email\"]")
    WebElement txtEmail;

    @FindBy(xpath="//*[@name=\"telephone\"]")
    WebElement txtTelephoneNumber;

    @FindBy(xpath="//*[@name=\"password\"]")
    WebElement txtPassword;

    @FindBy(xpath="//*[@name=\"confirm\"]")
    WebElement txtConfirmPassword;

    @FindBy(xpath="//label[normalize-space()='No']")
    WebElement chkdSubscribe;

    @FindBy(xpath="//*[@name=\"agree\"]")
    WebElement chkdPolicy;

    @FindBy(xpath="//*[@value=\"Continue\"]")
    WebElement clickContinueButton;

    @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement confirmationMessage;


    public void setTxtFirstName(String fname)
    {
       txtFirstName.sendKeys(fname);
    }

    public void setTxtLastName(String lname)
    {
        txtLastName.sendKeys(lname);
    }

    public void setTxtEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void setTxtTelephone(String telephone)
    {
        txtTelephoneNumber.sendKeys(telephone);
    }

    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void setTxtConfirmPassword(String confirmPassword)
    {
        txtConfirmPassword.sendKeys(confirmPassword);
    }

    public void setChkdSubscribe()
    {
        chkdSubscribe.click();
    }

    public void setChkdPolicy()
    {
        chkdPolicy.click();
    }

    public void setClickContinueButton()
    {
        clickContinueButton.click();
    }

    public String CheckConfirmationMessage()
    {
        try{
            return confirmationMessage.getText();
        }
        catch (Exception e)
        {
           return e.getMessage();
        }

    }











}
