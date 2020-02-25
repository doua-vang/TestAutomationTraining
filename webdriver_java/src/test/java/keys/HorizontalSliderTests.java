package keys;

import base.BaseTests;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void HorizontalSlider() {
        var horizontalSlider = homePage.clickHorizontalSliderLink();
        horizontalSlider.shiftSliderTo("4");
        horizontalSlider.shiftSliderTo("2");

        System.out.println(horizontalSlider.getCurrentSliderPosition());

    }
}
