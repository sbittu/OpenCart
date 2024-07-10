package TestCase;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002_LoginTest extends BaseClass{

    @Test(groups = {"Regression", "Master"})
    public void verifyLogin()
    {
        HomePage hp=new HomePage(driver);
        hp.ClickMyAccount();
        hp.clickLoginButton();

        LoginPage lp= new LoginPage(driver);
        lp.setLoginEmail(p.getProperty("loginEmail"));
        lp.setTxtLoginPassword(p.getProperty("loginPassword"));
        lp.clickonLoginButton();

        MyAccountPage map=new MyAccountPage(driver);
        Assert.assertEquals(map.ismyAccountPageExists(),true,"Login Failed");
    }
}
