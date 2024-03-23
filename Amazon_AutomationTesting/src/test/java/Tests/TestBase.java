package Tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    SignInPage signInPage;

    SignOut signOut;
    WebDriver driver;
    @BeforeSuite
    public void intitalize() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://www.amazon.in");
        String title = driver.getTitle();
        while (!"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in".equals(title)){
            driver.get("https://www.amazon.in");
            title = driver.getTitle();
        }

        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        cartPage = new CartPage(driver);
        signInPage = new SignInPage(driver);
        signOut = new SignOut(driver);
    }
  //  @AfterSuite
    public void LastStep() {
        driver.quit();
    }
}

