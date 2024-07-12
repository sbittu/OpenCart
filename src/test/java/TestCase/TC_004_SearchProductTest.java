package TestCase;

import PageObjects.HomePage;
import PageObjects.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_004_SearchProductTest extends BaseClass{

    @Test
    public void VerifyProductSearch()
    {

        HomePage search= new HomePage(driver);
        search.setSearchtext("MacBook");
        search.setClickOnSearchbutton();

        SearchPage sp= new SearchPage(driver);
        Assert.assertEquals(sp.isProductExist("MacBook"),true);
    }
}
