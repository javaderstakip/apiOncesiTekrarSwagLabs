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
import java.util.*;
import java.util.List;

import static org.junit.Assert.assertTrue;

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
        assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/browser-windows"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        assertTrue(browserWindowsPage.getBrowserWindowsText().isDisplayed());
        assertTrue(browserWindowsPage.getBrowserWindowsText().getText()
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
        assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/sample"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        assertTrue(browserWindowsPage.getSampleText().isDisplayed());
        assertTrue(browserWindowsPage.getSampleText().getText()
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
        Thread.sleep(2000);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(2000);
        driver.manage().window().maximize();Thread.sleep(2000);
        driver.manage().window().minimize();Thread.sleep(2000);
        assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/sample"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        assertTrue(browserWindowsPage.getNewWindowSampleText().getText()
                .equalsIgnoreCase("This is a sample page"));
        System.out.println("text kisminda ne yaziyor: " + browserWindowsPage.getNewWindowSampleText()
                .getText());
    }
    @Test(priority = 4)
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
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        Thread.sleep(3000);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Thread.sleep(3000);
        //driver.manage().window().maximize();Thread.sleep(3000);
//        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("about:blank"));//bu kodlar bi işe yaramadı
//        System.out.println("şu an hangi linkteyiz: " + driver.getCurrentUrl());//dolayısıyla bunlar da bi işe yaramadı
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


        browserWindowsPage.getNewWindowMessage().click();
        browserWindowsPage.getNewWindowMessage().click();
        browserWindowsPage.getNewWindowMessage().click();//bu kliklemelerin sebebi aşagıdaki handle nin birden fazla pencere sayıp saymadıgını test etmek ve anlamak
        // Pencerenin açıldığını doğrulayın (sayfa tanıtıcısı alarak)
        //Set<String> allWindowHandles = driver.getWindowHandles();
        //*****!!!!allWindowHandles.size() > 1 veya 2 veya 3 olarak deneyelim
        if (allWindowHandles.size() > 1) {
            System.out.println("Yeni bir pencere açıldı!");
        } else {
            System.out.println("Yeni bir pencere açılmadı.");
        }

// "about:blank" sayfasına geçiş yapın (yukarıdaki kod ile)
// ...



        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        options.setExperimentalOption("useAutomationExtension", false);
//        WebDriver driver = new ChromeDriver(options);
//        System.out.println("sıfırıncı kısım.");

// Pop-up engellemeyi kapat
        options.setExperimentalOption("excludeSwitches",
                Arrays.asList("disable-popup-blocking"));
// Otomasyon kontrollerini devre dışı bırak
        options.setExperimentalOption("useAutomationExtension", false);

        //buraya kadar tarayıcı ayarlarını degistirme ayarı

        System.out.println("birinci kısım");

    }
}
