package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ForgotPasswordPageTests extends BaseTests {

    @Test
    public void testForgotPassword() {
        String email = "someone@something.com";

        var forgotPassword = homePage.clickForgotPasswordLink();
        forgotPassword.setEmail(email);
        var emailSent = forgotPassword.clickRetrievePassword();
        assertTrue(emailSent.getAlertText()
                        .contains("Your e-mail's been sent!"),
                "Alert text is incorrect");

    }

}
