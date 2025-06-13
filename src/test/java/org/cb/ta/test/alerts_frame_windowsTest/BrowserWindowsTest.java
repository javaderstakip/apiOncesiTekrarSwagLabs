package org.cb.ta.test.alerts_frame_windowsTest;

import org.cb.ta.pages.alerts_frame_windowsPages.BrowserWindowsPage;
import org.cb.ta.test.common.BaseTest;
import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.DynamicPropertiesPage;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class BrowserWindowsTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        browserWindowsPage.getAlertsFrameWindows().click();//Thread.sleep(1000);
        browserWindowsPage.getAlertsFrameWindows2().click();//Thread.sleep(1000);
        browserWindowsPage.getAlertsFrameWindows3().click();//Thread.sleep(1000);
        browserWindowsPage.getBrowserWindows().click();//Thread.sleep(1000);
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
        // Pencere "handle"larını al
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
        List<String> windowHandles = new ArrayList<>();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(driver.getWindowHandle())) {
                windowHandles.add(handle);
            }
        }
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
    }
    @Test(priority = 1)
    public void browserWindowsBeginningTest(){
        Assert.assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/browser-windows"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(browserWindowsPage.getBrowserWindowsText().isDisplayed());
        Assert.assertTrue(browserWindowsPage.getBrowserWindowsText().getText()
                .equalsIgnoreCase("Browser Windows"));
        System.out.println("text kisminda ne yaziyor: " + browserWindowsPage.getBrowserWindowsText()
                .getText());
    }
    @Test(priority = 2)
    public void newTabTest(){
        // Pencere "handle"larını al
        List<String> windowHandles = new ArrayList<>();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(driver.getWindowHandle())) {
                windowHandles.add(handle);
            }
        }
        browserWindowsPage.getNewTab().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Assert.assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/sample"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(browserWindowsPage.getSampleText().isDisplayed());
        Assert.assertTrue(browserWindowsPage.getSampleText().getText()
                .equalsIgnoreCase("This is a sample page"));
        System.out.println("text kisminda ne yaziyor: " + browserWindowsPage.getSampleText()
                .getText());
    }
    @Test(priority = 3)
    public void newWindowTest() throws InterruptedException {
        // Pencere "handle"larını al
        List<String> windowHandles = new ArrayList<>();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(driver.getWindowHandle())) {
                windowHandles.add(handle);
            }
        }
        browserWindowsPage.getNewWindow().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        Thread.sleep(3000);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(3000);
        driver.manage().window().maximize();Thread.sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/sample"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(browserWindowsPage.getNewWindowSampleText().getText()
                .equalsIgnoreCase("This is a sample page"));
        System.out.println("text kisminda ne yaziyor: " + browserWindowsPage.getNewWindowSampleText()
                .getText());
    }
    @Test(priority = 3)
    public void newWindowMessageTest() throws InterruptedException {
        // Pencere "handle"larını al
        List<String> windowHandles = new ArrayList<>();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(driver.getWindowHandle())) {
                windowHandles.add(handle);
            }
        }
        browserWindowsPage.getNewWindowMessage().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(3000);
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        Thread.sleep(3000);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(3000);
        //driver.manage().window().maximize();Thread.sleep(3000);
//        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("about:blank"));
//        System.out.println("şu an hangi linkteyiz: " + driver.getCurrentUrl());
        //buraya kadar bizim yazdıklarımız



        // Mevcut pencerenin tanıtıcısını alın
        String originalWindow = driver.getWindowHandle();

// Tüm açık pencerelerin tanıtıcılarını alın
        Set<String> allWindowHandles = driver.getWindowHandles();

// Yeni açılan pencereye geçiş yapın
        for (String handle : allWindowHandles) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }


        // Pencerenin açıldığını doğrulayın (sayfa tanıtıcısı alarak)
        //Set<String> allWindowHandles = driver.getWindowHandles();
        if (allWindowHandles.size() > 1) {
            System.out.println("Yeni bir pencere açıldı!");
        } else {
            System.out.println("Yeni bir pencere açılmadı.");
        }

// "about:blank" sayfasına geçiş yapın (yukarıdaki kod ile)
// ...

// Pencereyi kapatın
        driver.close();

// Orijinal pencereye geri dönün
        driver.switchTo().window(originalWindow);


//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        options.setExperimentalOption("useAutomationExtension", false);
//        WebDriver driver = new ChromeDriver(options);
//
//
//        // about:blank sayfasını kapat ve ana sayfaya dön
//        String mainWindow = driver.getWindowHandle();
//        for (String handle : driver.getWindowHandles()) {
//            if (handle.equals(mainWindow)) continue;
//            driver.switchTo().window(handle);
//            if (driver.getCurrentUrl().equals("about:blank")) {
//                driver.close();
//            }
//        }
//        driver.switchTo().window(mainWindow);

    }
}
