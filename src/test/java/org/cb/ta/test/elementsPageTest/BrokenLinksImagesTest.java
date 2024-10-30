package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.BrokenLinksImagesPage;
import org.cb.ta.pages.elementsPages.LinksPage;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
public class BrokenLinksImagesTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    BrokenLinksImagesPage brokenLinksImagesPage = new BrokenLinksImagesPage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getElementsButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getBrokenLinksImages().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public void afterTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //driver.quit();
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
        //Thread.sleep(2000);
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("Test calisti.");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
        //Thread.sleep(2000);
        //driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
    }
    @Test
    public void brokenLinksImagesTest(){
        Assert.assertFalse(driver.getCurrentUrl().equals("https://demoqa.com/links"));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/broken"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(brokenLinksImagesPage.getBrokenLinksImagesText().getText()
                .equalsIgnoreCase("Broken Links - Images"));
    }
    @Test
    public void validImageTest(){
        String imageUrl = brokenLinksImagesPage.getValidImage().getAttribute("src");
        Assert.assertEquals(imageUrl, "https://demoqa.com/images/Toolsqa.jpg");
        System.out.println("1 "+imageUrl.getBytes());
        System.out.println("3 "+brokenLinksImagesPage.getValidImage().getAttribute("src"));

        int imageWidth = Integer.parseInt(brokenLinksImagesPage.getValidImage().getAttribute("width"));
        int imageHeight = Integer.parseInt(brokenLinksImagesPage.getValidImage().getAttribute("height"));
        System.out.println("4 " + brokenLinksImagesPage.getValidImage().getAttribute("width"));
        System.out.println("5 "+ brokenLinksImagesPage.getValidImage().getAttribute("height"));
        Assert.assertEquals(imageWidth, 347); // Beklenen genişlik
        Assert.assertEquals(imageHeight, 100); // Beklenen yükseklik

    }
    @Test
    public void brokenImageTest(){
        String imageUrl2 = brokenLinksImagesPage.getBrokenImage().getAttribute("src");
        Assert.assertEquals(imageUrl2, "https://demoqa.com/images/Toolsqa_1.jpg");
        System.out.println("1 "+imageUrl2.getBytes());
        System.out.println("3 "+brokenLinksImagesPage.getBrokenImage().getAttribute("src"));

        int imageWidth = Integer.parseInt(brokenLinksImagesPage.getBrokenImage().getAttribute("width"));
        int imageHeight = Integer.parseInt(brokenLinksImagesPage.getBrokenImage().getAttribute("height"));
        System.out.println("4 " + brokenLinksImagesPage.getBrokenImage().getAttribute("width"));
        System.out.println("5 "+ brokenLinksImagesPage.getBrokenImage().getAttribute("height"));
        Assert.assertEquals(imageWidth, 347); // Beklenen genişlik
        Assert.assertEquals(imageHeight, 100); // Beklenen yükseklik
    }
}
