package Tests;

import Pages.HomePage;
import org.junit.Assert;


import org.testng.annotations.Test;


public class HomePageTest extends TestBase{
    @Test
    public void verifyHomePageTitle(){

        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Test
    public void verifySearchFunctionality(){
        HomePage homePage = new HomePage(driver);
        boolean searchPerformed = homePage.search("deo");
        Assert.assertTrue("Search functionality failed ", searchPerformed);
        Assert.assertTrue("Search result does not contain expected term", driver.getTitle().contains("deo"));
      //  ProductsPageTest pb =new ProductsPageTest(driver);
    }

}
