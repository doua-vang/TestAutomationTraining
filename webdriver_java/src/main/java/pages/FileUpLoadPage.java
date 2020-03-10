package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpLoadPage {
    WebDriver driver;
    private By chooseFile = By.id("file-upload");// = By.xpath(".//input[text()='Choose File']");
    private By uploadButton = By.id("file-submit");//= By.xpath(".//button[text()='Upload']");
    private By uploadedFiles = By.id("uploaded-files");



    public FileUpLoadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public String getUploadFile() {
        return driver.findElement(uploadedFiles).getText();
    }

    public void uploadFile(String filePath) {
        driver.findElement(chooseFile).sendKeys(filePath);
        clickUploadButton();
    }
}
