package TestCase;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_001_AccountRegistrationTest extends BaseClass  {

    @Test(groups = {"Sanity", "Master"})
    public void verify_Account_Registration()
    {
        logger.info("Starting");
        logger.info("Starting TC_001_AccountRegistrationTest");
        logger.debug("This is a debug log message");
        try {

            HomePage hp = new HomePage(driver);
            hp.ClickMyAccount();
            logger.info("Click On My Account Button");
            hp.ClickOnRegister();
            logger.info("Click On Register Button");

            RegistrationPage reg = new RegistrationPage(driver);
            reg.setTxtFirstName(randomString().toUpperCase());
            reg.setTxtLastName(randomString().toUpperCase());
            reg.setTxtEmail(randomString() + "@mail.com");
            reg.setTxtTelephone(randomNumber());

            String Password = randomAlphaNumeric();
            reg.setTxtPassword(Password);
            reg.setTxtConfirmPassword(Password);
            reg.setChkdSubscribe();
            reg.setChkdPolicy();
            reg.setClickContinueButton();

            logger.debug("Validating Confirmation Message");
            Assert.assertEquals(reg.CheckConfirmationMessage(), "Your Account Has Been Created!");
            reg.CheckConfirmationMessage();
        }
        catch (Exception e)
        {
            logger.error(e.getMessage());
        }
    }
}
