package Tests;

import Pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase{

    @Test
    public void SignInConfirm() throws InterruptedException {

        homePage.search("deo");

        productsPage.clickFourStarsAndUpFilter();
        productsPage.confirmationOfMoreThanUpatoFourStarProducts();
        productsPage.clickFourthProduct();
        productsPage.switchToNewWindow();

        productDetailPage.clickAddToCartButton();
        productDetailPage.clickGoToCartButton();

        cartPage.clickProceedToBuyButton();


        signInPage.emailProvider("patilvijaysing2092@gmail.com");
        signInPage.passwordProvider("Vijay@6767");
        Thread.sleep(4000);


        signInPage.setGoToHomPage();

        //driver.navigate().back();

    }
    @Test
    public void verifyPageTitle() {
        String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");
    }
}
