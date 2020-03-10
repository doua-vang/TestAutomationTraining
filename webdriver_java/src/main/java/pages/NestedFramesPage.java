package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {

    WebDriver driver;
    private String leftFrame = "frame-left";
    private String topFrame = "frame-top";
    private String middleFrame = "frame-middle";
    private String rightFrame = "frame-right";
    private String bottomFrame ="frame-bottom";
    private By text = By.xpath("/html/body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }


    public String getFrameText(String frame) {
        switchToFrame(frame.toLowerCase());
        String bodyText = driver.findElement(text).getText();
        switchToMainArea();

        if (!frame.equalsIgnoreCase("bottom")) {
            switchToMainArea();
        };

        return bodyText;
    }

    private void switchToFrame(String frame) {
        switch(frame) {
            case "left":
                driver.switchTo().frame(topFrame);
                driver.switchTo().frame(leftFrame);
                break;
            case "right":
                driver.switchTo().frame(topFrame);
                driver.switchTo().frame(rightFrame);
                break;
            case "bottom":
                driver.switchTo().frame(bottomFrame);
                break;
            default:
                driver.switchTo().frame(topFrame);
                driver.switchTo().frame(middleFrame);
        }
    }
}
