package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsHelper {
    private WebDriver driver;

    public ElementsHelper(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not present: " + element + "Time" + timeout, e);
        }
    }

    public boolean isElementVisible(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not present: " + element + "Time" + timeout, e);
        }
    }

    public boolean isElementClickable(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));

        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not present: " + element + "Time" + timeout, e);
        }
    }

    public void clickOnVisibleAndClickableElement(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));

        try {
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(element)));
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(element)));
            driver.findElement(element).click();
        } catch (WebDriverException e) {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
            driver.findElement(element).click();
        }
    }

    public String getElementTextVisibilityOf(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return driver.findElement(element).getText();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not present within timeout:" + element + "Time" + timeout, e);
        }
    }

    public void textInputField(By inputFieldElement, int timeout, String inputText) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(inputFieldElement));
            driver.findElement(inputFieldElement).sendKeys(inputText);
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not present:" + inputFieldElement + "Time" + timeout, e);
        }
    }

    public boolean isElementSelected(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, (timeout));
        try {
            wait.until(ExpectedConditions.elementToBeSelected(element));
            return true;
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Web element is not selected:" + element + "Time" + timeout, e);
        }
    }
}
