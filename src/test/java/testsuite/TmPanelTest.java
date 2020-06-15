package testsuite;

import baseparameters.TestBase;
import pages.LogInPageLocators;
import pages.PanelLocators;

public class TmPanelTest extends TestBase {
    PanelLocators panelLocators = new PanelLocators();

    public void tmPanelButtonTest() {
        elementsHelper.clickOnVisibleAndClickableElement(panelLocators.myFeed,10);
        elementsHelper.clickOnVisibleAndClickableElement(panelLocators.allStreams,10);
        elementsHelper.clickOnVisibleAndClickableElement(panelLocators.develop,10);
        elementsHelper.clickOnVisibleAndClickableElement(panelLocators.administration,10);
        elementsHelper.clickOnVisibleAndClickableElement(panelLocators.design,10);
        elementsHelper.clickOnVisibleAndClickableElement(panelLocators.management,10);
        elementsHelper.clickOnVisibleAndClickableElement(panelLocators.marketing,10);
        elementsHelper.clickOnVisibleAndClickableElement(panelLocators.popsci,10);
    }
}
