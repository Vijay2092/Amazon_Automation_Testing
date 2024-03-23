package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class SignOut {
 WebDriver driver;
 Actions builder;
     public SignOut(WebDriver driver){
           this.driver = driver;
           this.builder = new Actions(driver);
            PageFactory.initElements(driver, this);
     }
     public void performMouseHover() {
        WebElement account = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        builder.moveToElement(account).perform();
    }
    public void verifysignOut(){
         WebElement signOutButton = driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]"));
         builder.moveToElement(signOutButton).click().perform();
    }

    //Amazon Sign In
}
