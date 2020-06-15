package testing;

import inputs.TestBase;
import org.testng.annotations.Test;
import pages.LogInPageLocators;

public class LogInTest extends TestBase {
    public LogInPageLocators logInPageLocators = new LogInPageLocators();
    public String username = "vasoenergi@gmail.com";
    public String password = "2Head>One";

    @Test (priority = 1,groups = "test_group")
    public void logInTest() {
        elementsHelper.textInputField(logInPageLocators.inputUserName,15,username);
        elementsHelper.textInputField(logInPageLocators.inputPassword,15,password);
        elementsHelper.clickOnVisibleAndClickableElement(logInPageLocators.loginButton,15);
    }
}
