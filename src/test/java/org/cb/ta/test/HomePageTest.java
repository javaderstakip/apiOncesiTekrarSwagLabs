package org.cb.ta.test;

import org.cb.ta.pages.HomePage;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

//@Listeners(org.cb.ta.test.TestLi)
public class HomePageTest extends BaseTest {
    HomePage home = new HomePage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
//        home.getConsenttouseyourdata().click();
//        Thread.sleep(3000);
        home.getHomePageButton().click();
//        Thread.sleep(5000);
    }
    @AfterClass
    public void afterTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.quit();
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        home.getHomePageButton().click();
//        Thread.sleep(2000);
    }
    @Test
    public void firstTest() throws InterruptedException {
//        home.getHomePageButton();
//        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);
    }
    @Test
    public void joinNowButton() throws InterruptedException {
        home.getJoinNowButton().click();//Thread.sleep(5000);
        System.out.println("ilk durum: "+driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/"));
        System.out.println(driver.getTitle());

        // Pencere "handle"larını al
        List<String> windowHandles = new ArrayList<>();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(driver.getWindowHandle())) {
                windowHandles.add(handle);
            }
        }
// İkinci pencereye geç
        //driver.switchTo().window(driver.getWindowHandles().get(1))
        //webDriverWait.until(ExpectedConditions.urlToBe("https://www.toolsqa.com/selenium-training/"));
        driver.switchTo().window(windowHandles.get(0));
        webDriverWait.until(ExpectedConditions.urlToBe("https://www.toolsqa.com/selenium-training/"));
        System.out.println("ikinci durum: "+driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.toolsqa.com/selenium-training/"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
//        webDriverWait.until(ExpectedConditions.urlContains("param=value"));
//        webDriverWait.until(ExpectedConditions.urlContains("training"));
        System.out.println("ucuncu durum: "+driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/"));
        System.out.println(driver.getTitle());
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        System.out.println("dorduncu durum: "+driver.getCurrentUrl());
        //String originalWindow = driver.getWindowHandles().toArray()[0].toString();
        //driver.switchTo().window(windowHandles.get(1));
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.toolsqa.com/selenium-training/"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.close();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //ana pencereye geç
        //driver.switchTo().defaultContent();
        //webDriverWait.until(ExpectedConditions.urlToBe("https://www.toolsqa.com"));
//        webDriverWait.until(ExpectedConditions.urlContains("param=value"));
//        webDriverWait.until(ExpectedConditions.urlContains("training"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Thread.sleep(3000);
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        System.out.println("besinci durum: "+driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        home.getHomePageButton().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/"));
    }

    @Test
    public void elementsButtonClick() throws InterruptedException {
        home.getElementsButton().click();
        //Thread.sleep(3000);
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/elements"));
        System.out.println(driver.getTitle());
    }
    @Test
    public void formsButtonClick(){
        home.getFormsButton().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/forms"));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void alertFrameWindowsButton(){
        home.getAlertFrameWindowsButton().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/alertsWindows"));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void widgetButton(){
        home.getWidgetButton().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/widgets"));
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
    @Test
    public void interactionsButton(){
        home.getInteractionsButton().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/interaction"));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void bookStoreAplicationButton(){
        jsx.executeScript("window.scrollBy(0,1000)");
        home.getBookStoreAplicationButton().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/books"));
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
