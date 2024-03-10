package org.cb.ta.test;

import org.cb.ta.pages.HomePage;
import org.cb.ta.test.common.BaseTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Listeners(org.cb.ta.test.TestLi)
public class TestHomePage extends BaseTest {
    HomePage home = new HomePage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        home.getConsenttouseyourdata().click();
//        Thread.sleep(3000);
//        home.getHomePageButton().click();
//        Thread.sleep(5000);
    }
    @AfterClass
    public void afterTest(){
        //driver.quit();
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        home.getHomePageButton().click();
        Thread.sleep(2000);
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
        System.out.println(driver.getCurrentUrl());
        //Assert.assertTrue(driver.getCurrentUrl().equals("https://www.toolsqa.com/selenium-training/"));
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
        driver.switchTo().window(windowHandles.get(0));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.toolsqa.com/selenium-training/"));
        System.out.println(driver.getTitle());
//        driver.switchTo().window(windowHandles.get(1));
//        System.out.println(driver.getCurrentUrl());
//        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.toolsqa.com/selenium-training/"));
//        System.out.println(driver.getTitle());
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        home.getHomePageButton().click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.toolsqa.com"));
    }

    @Test
    public void elementsButtonClick() throws InterruptedException {
        home.getElementsButton().click();
        Thread.sleep(3000);
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
