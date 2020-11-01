package windows;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;

import static org.testng.Assert.assertTrue;

public class WindowsTests extends BaseTests {
    @Test
    public void testDynamicLinkNewTab() {
        DynamicLoadingExample2Page page = homePage.clickDynaicLoadingLink().clickExample2NewTab();
        getWindowManager().switchToTab("New Window");
        assertTrue(page.startButtonPresent(), "Start button is not displayed");
        getWindowManager().switchToTab("The Internet");

    }
}
