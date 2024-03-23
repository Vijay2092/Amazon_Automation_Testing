package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
      //  AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver ,10);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]" )
    WebElement shoppingCart;
    @FindBy (xpath = "//input[@name='proceedToRetailCheckout']")
   // @FindBy(id = "proceed-to-checkout-label")
          //  @FindBy(id = "sc-buy-box-ptc-button-announce")
   // @FindBy(className = "proceedToRetailCheckout")
    WebElement ProceedToBuyButton;



    public WebElement getShoppingCart(){
//        visiblity(shoppingCart);
      return shoppingCart;
    }

    public void clickProceedToBuyButton(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(ProceedToBuyButton));
        ProceedToBuyButton.click();
    }


// public  void visiblity(WebElement element){
//     WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
//     wait.until(ExpectedConditions.visibilityOf(element));

}
