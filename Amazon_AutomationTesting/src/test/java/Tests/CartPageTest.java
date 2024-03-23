package Tests;

import Pages.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends TestBase{

    @Test
    public void verifyCartAndBuy() throws InterruptedException {
        homePage.search("deo");
//        Handle dropdown
//        Select dropdown = new Select(driver.findElement(By.id("sss")));
//        dropdown.selectByIndex(0);

        productsPage.clickFourStarsAndUpFilter();
        productsPage.confirmationOfMoreThanUpatoFourStarProducts();
        productsPage.clickFourthProduct();
        productsPage.switchToNewWindow();

        productDetailPage.clickAddToCartButton();
        //productDetailPage.getCheckProductAddedInCart();
        productDetailPage.clickGoToCartButton();

        Assert.assertNotNull(cartPage.getShoppingCart());
        //Thread.sleep(3000);

        cartPage.getShoppingCart();
        cartPage.clickProceedToBuyButton();
       // System.out.println("buy");
        Thread.sleep(2000);
    }

}
