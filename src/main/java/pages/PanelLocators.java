package pages;

import org.openqa.selenium.By;

public class PanelLocators {
    public By myFeed = By.xpath("//div[@class='main-navbar__section main-navbar__section_left']//li[1]//a[1]");
    public By allStreams = By.xpath("//div[@class='main-navbar__section main-navbar__section_left']//li[2]//a[1]");
    public By develop = By.xpath("//div[@class='main-navbar__section main-navbar__section_left']//li[3]//a[1]");
    public By administration = By.xpath("//a[@class='nav-links__item-link nav-links__item-link_current']");
    public By design = By.xpath("//a[@class='nav-links__item-link nav-links__item-link_current']");
    public By management = By.xpath("//div[@class='main-navbar__section main-navbar__section_left']//li[6]//a[1]");
    public By marketing = By.xpath("//div[@class='main-navbar__section main-navbar__section_left']//li[7]//a[1]");
    public By popsci = By.xpath("//a[@class='nav-links__item-link nav-links__item-link_current']");
}
