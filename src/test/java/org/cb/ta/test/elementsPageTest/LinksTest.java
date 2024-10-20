package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.LinksPage;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
    }
    @Test
    public void linksTextTest(){
        Assert.assertTrue(linksPage.getLinksText().getText().equalsIgnoreCase("links"));
        Assert.assertTrue(linksPage.getLinksText().isDisplayed());
        System.out.println("links yazdı mı? " + linksPage.getLinksText().getText());
    }
    @Test
    public void newTabtest(){
        Assert.assertTrue(linksPage.getNewTabText().isDisplayed());
        Assert.assertTrue(linksPage.getNewTabText().getText()
                .equalsIgnoreCase("Following links will open new tab"));
        System.out.println("new tab yazısını gorduk mu? " + linksPage.getNewTabText().getText());
    }
    @Test
    public void linksTestHome(){
        linksPage.getLinksHome().click();

        // Pencere "handle"larını al
        List<String> windowHandles = new ArrayList<>();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(driver.getWindowHandle())) {
                windowHandles.add(handle);
            }
        }
        //driver.switchTo().window(windowHandles.get(0));
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        webDriverWait.until(ExpectedConditions.urlToBe("https://demoqa.com/"));
        System.out.println("guncel url mız nedır acaba? "+driver.getCurrentUrl());
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        webDriverWait.until(ExpectedConditions.urlToBe("https://demoqa.com/links"));
        System.out.println("guncel url mız nedır acaba? "+driver.getCurrentUrl());
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/"));
    }
    @Test
    public void linksTestHomeeja8R(){
        Assert.assertTrue(linksPage.getLinksHomeeja8R().isEnabled());
        linksPage.getLinksHomeeja8R().click();

        // Pencere "handle"larını al
        List<String> windowHandles = new ArrayList<>();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(driver.getWindowHandle())) {
                windowHandles.add(handle);
            }
        }
        //driver.switchTo().window(windowHandles.get(0));
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        webDriverWait.until(ExpectedConditions.urlToBe("https://demoqa.com/"));
        System.out.println("guncel url mız nedır acaba? "+driver.getCurrentUrl());
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        webDriverWait.until(ExpectedConditions.urlToBe("https://demoqa.com/links"));
        System.out.println("guncel url mız nedır acaba? "+driver.getCurrentUrl());
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/"));
    }
}
