package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void testKeys() {
        var keyPage = homePage.clickKeyPressLink();
        String text = "C";
        keyPage.enterText(text);
        assertEquals(keyPage.getResult(), "You entered: C");

    }

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPressLink();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPressLink();
        keyPage.enterText(""+Keys.TAB);
        assertEquals(keyPage.getResult(), "You entered: TAB");

    }

}
