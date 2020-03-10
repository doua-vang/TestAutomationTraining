package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    WebDriver driver;
    private By jsAlert = By.xpath(".//button[text()='Click for JS Alert']");
    private By jsConfirm = By.xpath(".//button[text()='Click for JS Confirm']");
    private By jsPrompt = By.xpath(".//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerJsAlert() {
        driver.findElement(jsAlert).click();
    }

    public void triggerJsConfirm() {
        driver.findElement(jsConfirm).click();
    }

    public void triggerJsPrompt() {
        driver.findElement(jsPrompt).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public String getResultText() {
        return driver.findElement(result).getText();
    }

    public void typeAlertInput(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
}
