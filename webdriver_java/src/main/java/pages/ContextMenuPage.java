package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends JavaScriptAlertsPage{
    private By box = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void rightClickBox() {
        Actions actions = new Actions(driver);
        WebElement clickBox = driver.findElement(box);
        actions.contextClick(clickBox).perform();
    }


}
