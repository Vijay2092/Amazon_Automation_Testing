package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsPageTest extends TestBase {
//    WebDriver driver;
//    ProductsPageTest(WebDriver driver){
//        this.driver=driver;
//    }
    @Test
    public void testProductSelection() throws InterruptedException {
        homePage.search("deo");
        Thread.sleep(2000);

        productsPage.clickFourStarsAndUpFilter();
        Thread.sleep(4000);
        Assert.assertNotNull(productsPage.confirmationOfMoreThanUpatoFourStarProducts());
        Thread.sleep(2000);

        productsPage.clickFourthProduct();
        Thread.sleep(5000);

//        String curr = driver.getWindowHandle();
//        Set<String> store = driver.getWindowHandles();
//        for(String s : store){
//            if(!curr.equals(s)){
//                driver.switchTo().window(s);
//            }
//        }

        productsPage.switchToNewWindow();
        //Assert.assertTrue("Product page is not displayed", driver.getTitle().contains("Product"));
    }

}
