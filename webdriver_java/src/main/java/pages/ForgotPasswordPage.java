package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;
    private static By emailAddress = By.id("email");
    private static By retrievePasswordButton = By.cssSelector("#forgot_password button");//"icon-2x icon-signin");
    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailAddress).sendKeys(email);
    }

    public EmailSentPage clickRetrievePassword(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage(driver);
    }
}
