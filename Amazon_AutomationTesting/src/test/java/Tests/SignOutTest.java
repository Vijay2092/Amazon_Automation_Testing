package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignOutTest extends TestBase {


    @Test
    public void signOutAccount(){
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
        signInPage.setGoToHomPage();

        signOut.performMouseHover();
        signOut.verifysignOut();


    }

    @Test
    public void verifyPageTitle() {
        String expectedTitle = "Amazon Sign In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch");
    }

}
