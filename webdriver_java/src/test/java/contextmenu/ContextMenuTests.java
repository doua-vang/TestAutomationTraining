package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu() {
        var contextMenu = homePage.clickContextMenu();
        contextMenu.rightClickBox();
        String text = contextMenu.getAlertText();
        contextMenu.dismissAlert();
        assertEquals(text,"You selected a context menu","Alert text is incorrect");
    }
}
