package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.DynamicPropertiesPage;
import org.cb.ta.test.common.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class DynamicPropertiesTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getElementsButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getDynamicProperties().click();
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
    public void dynamicPropertiesBeginningTest() {
        Assert.assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/dynamic-properties"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(dynamicPropertiesPage.getDynamicPropertiesText().isDisplayed());
        Assert.assertTrue(dynamicPropertiesPage.getDynamicPropertiesText().getText()
                .equalsIgnoreCase("Dynamic Properties"));
        System.out.println("text kisminda ne yaziyor: " + dynamicPropertiesPage
                .getDynamicPropertiesText().getText());
    }

    @Test(priority = 2)
    public void randomIdTest() {
        // Elementi text'e göre bulun ve ID'sini alın
        String initialId = dynamicPropertiesPage.getRandomIpText().getAttribute("id");
        System.out.println("initialId ne olarak görünüyor? " + initialId);
        driver.navigate().refresh();

        // Bekleme süresi tanımlayın (örneğin, 5 saniye)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Bekleme süresi tanımlayın (örneğin, 5 saniye)
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.stalenessOf(dynamicPropertiesPage.getRandomIpText()));

        // Elementi tekrar bul ve yeni ID'yi al
        String updatedId = dynamicPropertiesPage.getRandomIpText().getAttribute("id");
        System.out.println("updateId ne olarak görünüyor? " + updatedId);
        //driver.navigate().refresh();

        // ID'nin değiştiğini kontrol edin
        Assert.assertNotEquals(initialId, updatedId);
    }

    @Test(priority = 3)
    public void differentRandomIdTest() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/dynamic-properties");

        // Elementi bulun
        //WebElement randomTextElement = driver.findElement(By.xpath("//*[text()='This text has random Id']"));

        // Dinamik ID'yi alın
//        String elementId = randomTextElement.getAttribute("id");
        String initialId = dynamicPropertiesPage.getRandomIpText().getAttribute("id");

        // ID'nin boş olmadığını ve belirli bir pattern'e uyduğunu kontrol edin
        Assert.assertNotNull(initialId);
        Assert.assertTrue(initialId.matches("^[a-zA-Z0-9-_.@]+$")); // Örnek regex: Harfler, sayılar, "-" ve "_" kabul edilir.
        System.out.println("updateId ne olarak görünüyor? " + initialId);
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String updatedId = dynamicPropertiesPage.getRandomIpText().getAttribute("id");
        Assert.assertTrue(updatedId.matches("^[a-zA-Z0-9-_.@]+$")); // Örnek regex: Harfler, sayılar, "-" ve "_" kabul edilir.
        System.out.println("updateId ne olarak görünüyor? " + updatedId);
    }

    @Test(priority = 4)
    public void willEnable5SecondsTest() throws InterruptedException {
        Assert.assertFalse(dynamicPropertiesPage.getWillEnable5Seconds().isEnabled());
        System.out.println(dynamicPropertiesPage.getWillEnable5Seconds().isEnabled());
        Thread.sleep(5000);
        Assert.assertTrue(dynamicPropertiesPage.getWillEnable5Seconds().isEnabled());
        System.out.println(dynamicPropertiesPage.getWillEnable5Seconds().isEnabled());
    }

    @Test(priority = 5)
    public void colorChangeTest() throws InterruptedException {
        String initialColor = dynamicPropertiesPage.getColorChangeButton().getCssValue("color");
        System.out.println(initialColor);
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String finalColor = dynamicPropertiesPage.getColorChangeButton().getCssValue("color");
        System.out.println(finalColor);
        if (!initialColor.equals(finalColor)) {
            System.out.println("Test Passed: Renk değişti.");
        } else {
            System.out.println("Test Failed: Renk değişmedi.");
        }
    }

    @Test(priority = 6)
    public void visibleAfterTest() throws InterruptedException {
        Thread.sleep(5000);
        if (dynamicPropertiesPage.getVisibleAfter().isDisplayed()) {
            System.out.println("Test Passed: 3.");
        } else {
            System.out.println("Test Failed: 4.");
        }
    }

    @Test(priority = 7)
    public void visibleAfterTest2() {
        //WebDriver driver = new ChromeDriver();
        By buttonLocator = By.id("//*[contains(text(),'Visible After')]");
        // 5 saniye boyunca butonun görünür olup olmadığını kontrol et
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLocator));
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(buttonLocator));
            System.out.println("Buton beklenenden önce göründü. Test başarısız.");
        } catch (Exception e) {
            System.out.println("Buton 5 saniye içinde görünmedi. Test başarılı.");
        }
    }

    @Test(priority = 8)
    public void visibleAfterTest3() {
            // Test sayfasını aç
            //driver.get("https://demoqa.com/dynamic-properties"); // zaten var.

            // Butonun lokasyonunu belirleme
            By buttonLocator = By.id("//*[contains(text(),'Visible After')]");

            // 1. Adım: İlk başta butonun görünmediğini doğrula
            boolean isButtonVisibleInitially = isElementVisible(buttonLocator);
            System.out.println("İlk durumda buton görünür mü? " + isButtonVisibleInitially);
            assert !isButtonVisibleInitially : "Test Başarısız: Buton sayfa açılır açılmaz görünür olmamalı!";

            // 2. Adım: 5 saniye sonra görünmesini bekle
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//            WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLocator));

            // 3. Adım: Butonun artık görünür olduğunu doğrula
            boolean isButtonVisibleAfter5Sec = dynamicPropertiesPage.getVisibleAfter5Seconds().isDisplayed();
            System.out.println("5 saniye sonra buton görünür mü? " + isButtonVisibleAfter5Sec);
            assert isButtonVisibleAfter5Sec : "Test Başarısız: Buton 5 saniye sonra görünür olmalı!";

            System.out.println("Test Başarılı: Buton ilk başta görünmezdi, 5 saniye sonra göründü.");

    }

    // Elementin görünür olup olmadığını kontrol eden metod
    public boolean isElementVisible(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
