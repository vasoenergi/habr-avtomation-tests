package pages;

import org.openqa.selenium.By;

public class TabsMenuLocators {
    public By articles = By.xpath("//h3[@class='tabs-menu__item-text tabs-menu__item-text_active']");
    public By news = By.xpath("//h3[contains(@class,'tabs-menu__item-text')][contains(text(),'News')]");
    public By hubs = By.xpath("//h3[contains(text(),'Hubs')]");
    public By authors = By.xpath("//h3[contains(text(),'Authors')]");
    public By companies = By.xpath("//h3[contains(text(),'Companies']");

}
