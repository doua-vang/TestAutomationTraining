package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUpLoadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var upLoadPage = homePage.clickFileUploadLink();
        String filePath = "C:\\Users\\dvang\\IdeaProjects\\webdriver_java\\resources\\chromedriver.exe";
        upLoadPage.uploadFile(filePath);
        assertEquals(upLoadPage.getUploadFile(), "chromedriver.exe", "Uploaded files incorrect");

    }
}
