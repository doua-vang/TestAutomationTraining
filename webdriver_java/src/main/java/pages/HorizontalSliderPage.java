package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By range = By.id("range");//("sliderContainer");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSlider() {
        driver.findElement(slider).click();
    }

    public void shiftSliderTo(String num) {
        double find = Double.parseDouble(num);
        while(Double.parseDouble(getCurrentSliderPosition()) < find) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
        while(Double.parseDouble(getCurrentSliderPosition()) > find) {
            driver.findElement(slider).sendKeys(Keys.ARROW_LEFT);
        }
    }

    public String getCurrentSliderPosition() {
        return driver.findElement(range).getText();
    }

}
