package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;
import utils.WindowManager;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynaicLoadingLink().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");


    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }




}
