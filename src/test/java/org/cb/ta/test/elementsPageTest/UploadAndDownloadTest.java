package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.BrokenLinksImagesPage;
import org.cb.ta.pages.elementsPages.LinksPage;
import org.cb.ta.pages.elementsPages.UploadAndDownloadPage;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
public class UploadAndDownloadTest extends BaseTest{
    ElementsPage elementsPage = new ElementsPage(driver);
    UploadAndDownloadPage uploadAndDownloadPage = new UploadAndDownloadPage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getElementsButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getUploadAndDownload().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public void afterTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.quit();
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
    public void uploadAndDownloadBeginingTest(){
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/upload-download"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(uploadAndDownloadPage.getUploadAndDownloadText().getText()
                .equalsIgnoreCase("Upload and Download"));
        System.out.println("text kisminda ne yaziyor: "+ uploadAndDownloadPage
                .getUploadAndDownloadText().getText());
    }
}
