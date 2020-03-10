package ad;

import base.BaseTests;
import org.testng.annotations.Test;

public class EntryAdTests extends BaseTests {

    @Test
    public void testEntryAd() {
        var entryAd = homePage.clickEntryAdLink();
        entryAd.closeAd();

    }
}
