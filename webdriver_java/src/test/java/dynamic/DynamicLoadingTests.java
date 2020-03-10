package dynamic;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testDynamicLoading() {
        var loadingPage = homePage.clickDynaicLoadingLink().clickExample1();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");


    }

    @Test
    public void testDynamicLoadingTest() {
        var loadingPage = homePage.clickDynaicLoadingLink().clickExample2();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");


    }
}
