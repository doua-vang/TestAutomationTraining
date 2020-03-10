package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testNestedFramesLeftFrame() {
        var nestedFrames = homePage.clickNestedFramesLink();
        String leftText = nestedFrames.getFrameText("left");
        assertEquals(leftText,"LEFT","Frame text is not incorrect");
    }

    @Test
    public void testNestedFramesRightFrame() {
        var nestedFrames = homePage.clickNestedFramesLink();
        String rightText = nestedFrames.getFrameText("right");
        assertEquals(rightText,"LEFT","Frame text is not incorrect");
    }

    @Test
    public void testNestedFramesMiddleFrame() {
        var nestedFrames = homePage.clickNestedFramesLink();
        String middleFrame = nestedFrames.getFrameText("middle");
        assertEquals(middleFrame,"MIDDLE","Frame text is not incorrect");
    }
}
