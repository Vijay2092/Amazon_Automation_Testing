package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    WebDriver driver;

    public SignInPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@id='ap_email']")
    WebElement emailKey;


    @FindBy(xpath = "//input[@class='a-button-input']")
    WebElement continueButton;

    @FindBy(id = "ap_password")
    WebElement password;

    @FindBy(id="signInSubmit")
    WebElement signInButton;

    @FindBy (xpath = "//a[contains(text(),'Amazon.in homepage')]")
    WebElement goToHomPage;

    public boolean emailProvider (String email) {
        try {
            emailKey.sendKeys(email);
            continueButton.click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean passwordProvider (String passwordProvide) {
        try {
            password.sendKeys(passwordProvide);
            signInButton.click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void setGoToHomPage(){
        goToHomPage.click();
    }



}
