package TestCase;

import PageObjects.HomePage;
import PageObjects.ProductDetailPage;
import PageObjects.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_005_AddToCartTest extends BaseClass{

    @Test
    public void verifyAddToCart() throws InterruptedException
    {
        HomePage hp= new HomePage(driver);
        hp.setSearchtext("iphone");
        hp.setClickOnSearchbutton();

        SearchPage sp= new SearchPage(driver);

        if(sp.isProductExist("iPhone"))
        {
            sp.selectProduct("iPhone");

            ProductDetailPage pdp= new ProductDetailPage(driver);
            pdp.setProductQuantity("2");
            pdp.ClickonAddToCart();

            Assert.assertEquals(pdp.confirmationmsgProductadded(),true);
        }
    }





}
