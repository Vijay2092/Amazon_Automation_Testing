package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//section[@aria-label='4 Stars & Up']")
     WebElement fourStarsAndUpFilter;

    @FindBy(xpath = "//span[@class='a-size-small a-color-base a-text-bold']")
    WebElement confirmMoreThanFourStarProduct;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-base'])[4]")
     WebElement fourthProduct;

    public void clickFourStarsAndUpFilter() {
        fourStarsAndUpFilter.click();
   }

    public WebElement confirmationOfMoreThanUpatoFourStarProducts(){
        return confirmMoreThanFourStarProduct;
    }

    public void clickFourthProduct() {
        fourthProduct.click();
    }
    public void switchToNewWindow() {
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for(String windowHandle : windowHandles){
            if(!windowHandle.equals(currentWindowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
