package base;


import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;


public class BaseTests {
    protected HomePage homePage;
    private EventFiringWebDriver driver;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "resources/cd.exe");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());

        goHome();
    }

    @BeforeMethod
    public void goHome(){
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void takeScreenshot(){

        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        try{
            Files.move(screenshot, new File("resources/screenshots/test.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
    @AfterMethod
    public void recordFailure(ITestResult result) {
        if(ITestResult.FAILURE == result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);

            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));

            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
