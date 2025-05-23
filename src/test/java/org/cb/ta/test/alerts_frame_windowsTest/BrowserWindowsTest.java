package org.cb.ta.test.alerts_frame_windowsTest;

import org.cb.ta.pages.alerts_frame_windowsPages.BrowserWindowsPage;
import org.cb.ta.test.common.BaseTest;
import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.DynamicPropertiesPage;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BrowserWindowsTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        browserWindowsPage.getAlertsFrameWindows().click();
        browserWindowsPage.getAlertsFrameWindows2().click();
        browserWindowsPage.getAlertsFrameWindows3().click();
        browserWindowsPage.getBrowserWindows().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //elementsPage.getElementsButton().click();
        //elementsPage.getDynamicProperties().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public void afterTest() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //driver.quit();
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        System.out.println("Test basladi.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
        //Thread.sleep(2000);
        //driver.get("https://demoqa.com/upload-download");
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("Test calisti.");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
//        Thread.sleep(2000);
//        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        //driver.get("https://demoqa.com/upload-download");
    }
    @Test(priority = 1)
    public void browserWindowsBeginningTest(){
        Assert.assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/browser-windows"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
    }
}
