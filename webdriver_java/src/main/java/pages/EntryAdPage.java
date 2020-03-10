package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
    WebDriver driver;
    private By close = By.cssSelector(".modal-footer");
    private By reEnable = By.id("restart-ad");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enableAd() {
        driver.findElement(reEnable).click();;
    }

    public void closeAd() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(close));
        WebElement closeElement = driver.findElement(close);
        closeElement.click();
    }
}
