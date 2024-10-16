package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.LinksPage;
import org.cb.ta.test.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class LinksTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    LinksPage linksPage = new LinksPage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getElementsButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getLinks().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public void afterTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //driver.quit();
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        Thread.sleep(2000);
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("Test calisti.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Thread.sleep(2000);
    }
    @Test
    public void linksTest(){
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/links"));
    }
}