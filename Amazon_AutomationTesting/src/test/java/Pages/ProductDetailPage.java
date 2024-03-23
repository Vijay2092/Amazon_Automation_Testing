package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    WebDriver driver;

    public ProductDetailPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement addToCart;

    @FindBy(xpath = "//a[contains(text(),'Go to Cart')]")
    WebElement GoToCartButton;

    @FindBy(xpath = "//h1[contains(text(),'Added to Cart')]")
    WebElement checkProductAddedInCart;


    public  void clickAddToCartButton(){
        addToCart.click();
    }

    public  WebElement getCheckProductAddedInCart(){
        return  checkProductAddedInCart;
    }


    public void clickGoToCartButton(){
        GoToCartButton.click();
    }



}
