package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By startButton = By.xpath("//*[@id='start']/button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton() {
        driver.findElement(startButton).click();
       WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingIndicator)));
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(loadedText)));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }

    public boolean startButtonPresent() {
        try {
            driver.findElement(startButton);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
