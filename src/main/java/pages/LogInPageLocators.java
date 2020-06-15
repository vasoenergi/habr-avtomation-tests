package pages;

import org.openqa.selenium.By;

public class LogInPageLocators {
    public By inputUserName = By.xpath("//input[@id='email_field']");
    public By inputPassword  = By.xpath("//input[@id='password_field']");
    public By loginButton = By.xpath("//button[@name='go']");

}
