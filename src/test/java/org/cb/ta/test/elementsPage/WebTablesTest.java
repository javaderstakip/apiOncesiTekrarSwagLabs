package org.cb.ta.test.elementsPage;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.test.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTablesTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        elementsPage.getElementsButton().click();
        elementsPage.getWebTablesButton().click();
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
    @Test
    public void webTablesClick(){
        Assert.assertTrue(elementsPage.getWebTablesText().isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/webtables"));
    }
}
