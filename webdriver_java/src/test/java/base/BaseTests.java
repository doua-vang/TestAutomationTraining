package base;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utils.WindowManager;


public class BaseTests {
    private static WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/cd.exe");
        driver = new ChromeDriver();
        goHome();
    }

    @BeforeMethod
    public void goHome(){
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        homePage = new HomePage(driver);
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
