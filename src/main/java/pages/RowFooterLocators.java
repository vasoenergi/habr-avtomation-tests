package pages;

import org.openqa.selenium.By;

public class RowFooterLocators {
    public By copyright = By.xpath("//span[@class='footer__copyright']");
    public By tm = By.xpath("//a[contains(text(),'TM')]");
    public By langsettings = By.xpath("//a[@class='footer__link js-show_lang_settings']");
    public By about = By.xpath("//a[contains(text(),'About')]");
    public By support = By.xpath("//a[contains(text(),'Support')]");
    public By mobileversion = By.xpath("//a[contains(text(),'Mobile version')]");
}
