package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class JavaScriptAlertTests extends BaseTests {

    @Test
    public void testJsAlert() {
        var JsAlertPage = homePage.clickJavaScriptAlertsLink();
        JsAlertPage.triggerJsAlert();
        JsAlertPage.acceptAlert();
        assertEquals(JsAlertPage.getResultText(), "You successfully clicked an alert");

    }

    @Test
    public void testJsConfirmDismissAlert() {
        var JsAlertPage = homePage.clickJavaScriptAlertsLink();
        JsAlertPage.triggerJsConfirm();
        JsAlertPage.dismissAlert();
        assertEquals(JsAlertPage.getResultText(), "You clicked: Cancel");

    }

    @Test
    public void testJsConfirmAcceptAlert() {
        var JsAlertPage = homePage.clickJavaScriptAlertsLink();
        JsAlertPage.triggerJsConfirm();
        JsAlertPage.acceptAlert();
        assertEquals(JsAlertPage.getResultText(), "You clicked: Ok");

    }

    @Test
    public void testJSConfirmText(){
        var JsAlertPage = homePage.clickJavaScriptAlertsLink();
        JsAlertPage.triggerJsConfirm();
        String text = JsAlertPage.getAlertText();
        JsAlertPage.acceptAlert();
        assertEquals(text, "I am a JS Confirm", "Alert wrong text");
    }

    @Test
    public void testJsAlertText(){
        var JsAlertPage = homePage.clickJavaScriptAlertsLink();
        JsAlertPage.triggerJsAlert();
        String text = JsAlertPage.getAlertText();
        JsAlertPage.acceptAlert();
        assertEquals(text, "I am a JS Alert", "Alert wrong text");
    }

    @Test
    public void testJsPromptInput() {
        String text = "Hello World";
        var JsAlertPage = homePage.clickJavaScriptAlertsLink();
        JsAlertPage.triggerJsPrompt();
        JsAlertPage.typeAlertInput(text);
        JsAlertPage.acceptAlert();
        assertTrue(JsAlertPage.getResultText().contains("DFDFSDFSD"), "Results are different");

    }
}
