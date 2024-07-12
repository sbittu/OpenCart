package PageObjects;

import TestBase.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//*[@id='content']/div[3]//img")
    List<WebElement> searchProducts;




    public boolean isProductExist(String productName)
    {
        boolean flag = false;
        for(WebElement product: searchProducts)
        {
            if(product.getAttribute("title").equals(productName))
            {
                flag = true;
                break;
            }
        }
        return flag;

    }

    public void selectProduct(String productName)
    {
        for(WebElement product: searchProducts)
        {
            if(product.getAttribute("title").equals(productName))
            {
                product.click();
            }
        }
    }


}

