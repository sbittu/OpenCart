package TestCase;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.DataProviders;

public class TC_003_loginDDT extends BaseClass {

    @Test(dataProvider="loginData", dataProviderClass = DataProviders.class)
    public void verifyLoginDDT(String email, String pwd, String exp)
    {
        HomePage hp= new HomePage(driver);
        hp.ClickMyAccount();
        hp.clickLoginButton();

        LoginPage lp= new LoginPage(driver);
        lp.setLoginEmail(email);
        lp.setTxtLoginPassword(pwd);
        lp.clickonLoginButton();

        MyAccountPage map= new MyAccountPage(driver);
        boolean target=map.ismyAccountPageExists();

        if(exp.equalsIgnoreCase("valid"))
        {
            if(target==true)
            {
                map.clickOnLogoutbutton();
                Assert.assertTrue(true);

            }
            else
            {
                Assert.assertTrue(false);
            }
        }

        if (exp.equalsIgnoreCase("invalid"))
        {
            if(target==true)
            {
                map.clickOnLogoutbutton();
                Assert.assertTrue(false);

            }
            else
            {
                Assert.assertTrue(true);
            }
        }
    }


}
