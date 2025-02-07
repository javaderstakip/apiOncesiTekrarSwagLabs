package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.DynamicPropertiesPage;
import org.cb.ta.test.common.BaseTest;
import org.junit.Assert;
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
    public void afterTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
//        Thread.sleep(2000);
//        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        //driver.get("https://demoqa.com/upload-download");
    }
    @Test(priority = 1)
    public void dynamicPropertiesBeginningTest(){
        Assert.assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/dynamic-properties"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(dynamicPropertiesPage.getDynamicPropertiesText().isDisplayed());
        Assert.assertTrue(dynamicPropertiesPage.getDynamicPropertiesText().getText()
                .equalsIgnoreCase("Dynamic Properties"));
        System.out.println("text kisminda ne yaziyor: "+ dynamicPropertiesPage
                .getDynamicPropertiesText().getText());
    }
    @Test(priority = 2)
    public void randomIdTest(){
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
    @Test
    public void differentRandomIdTest(){
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
    @Test
    public void willEnable5SecondsTest() throws InterruptedException {
        Assert.assertFalse(dynamicPropertiesPage.getWillEnable5Seconds().isEnabled());
        System.out.println(dynamicPropertiesPage.getWillEnable5Seconds().isEnabled());
        Thread.sleep(5000);
        Assert.assertTrue(dynamicPropertiesPage.getWillEnable5Seconds().isEnabled());
        System.out.println(dynamicPropertiesPage.getWillEnable5Seconds().isEnabled());
    }
    @Test
    public void colorChangeTest() throws InterruptedException {
        String initialColor = dynamicPropertiesPage.getColorChangeButton().getCssValue("color");
        System.out.println(initialColor);
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String finalColor = dynamicPropertiesPage.getColorChangeButton().getCssValue("color");
        System.out.println(finalColor);
        if(!initialColor.equals(finalColor)){
            System.out.println("Test Passed: Renk değişti.");
        }else {
            System.out.println("Test Failed: Renk değişmedi.");
        }
    }
}
