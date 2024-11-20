package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.BrokenLinksImagesPage;
import org.cb.ta.pages.elementsPages.LinksPage;
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
        System.out.println("Test basladi.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
        //Thread.sleep(2000);
        driver.get("https://demoqa.com/broken");
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
        //driver.get("https://demoqa.com/broken");
    }
    @Test(priority = 1)
    public void brokenLinksImagesTest(){
        Assert.assertFalse(driver.getCurrentUrl().equals("https://demoqa.com/links"));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/broken"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(brokenLinksImagesPage.getBrokenLinksImagesText().getText()
                .equalsIgnoreCase("Broken Links - Images"));
    }
    @Test(priority = 2)
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
    @Test(priority = 3)
    public void brokenImageTest(){
        String imageUrl2 = brokenLinksImagesPage.getBrokenImage().getAttribute("src");
        Assert.assertEquals(imageUrl2, "https://demoqa.com/images/Toolsqa_1.jpg");
        System.out.println("1 "+imageUrl2.getBytes());
        System.out.println("3 "+brokenLinksImagesPage.getBrokenImage().getAttribute("src"));

        int imageWidth = Integer.parseInt(brokenLinksImagesPage.getBrokenImage()
                .getAttribute("width"));
        int imageHeight = Integer.parseInt(brokenLinksImagesPage.getBrokenImage()
                .getAttribute("height"));
        System.out.println("4 " + brokenLinksImagesPage.getBrokenImage().getAttribute("width"));
        System.out.println("5 "+ brokenLinksImagesPage.getBrokenImage().getAttribute("height"));
        Assert.assertEquals(imageWidth, 347); // Beklenen genişlik
        Assert.assertEquals(imageHeight, 100); // Beklenen yükseklik
    }
    @Test(priority = 4)
    public void validLinkTest(){
        jsx.executeScript("window.scrollBy(0,250)");
        brokenLinksImagesPage.getValidLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
        System.out.println("1 :" + driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().forward();
    }
    @Test(priority = 5)
    public void brokenLinkTest() throws InterruptedException {
        jsx.executeScript("window.scrollBy(0,250)");
        brokenLinksImagesPage.getBrokenLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("1 :" + driver.getCurrentUrl());
    }
    @Test(priority = 6)
    public void brokenLinkTestStatusCodes() throws IOException, InterruptedException {
        jsx.executeScript("window.scrollBy(0,250)");
        brokenLinksImagesPage.getBrokenLink().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("nerdeyiz: " + driver.getCurrentUrl());
        Assert.assertFalse(driver.getCurrentUrl()
                .equalsIgnoreCase("https://the-internet.herokuapp.com/status_codes/200"));




            driver.get("https://demoqa.com/broken");

            // Find all links on the page
            List<WebElement> links = driver.findElements(By.tagName("a"));

            for (WebElement link : links) {
                String url = link.getAttribute("href");

                if (url != null && !url.isEmpty())

                {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
                    httpURLConnection.setRequestMethod("HEAD");


                    int responseCode = httpURLConnection.getResponseCode();
                    System.out.println("head nedir? :" + responseCode);
                    httpURLConnection.disconnect();
                    System.out.println("head nedir? :" + responseCode);

                    if (responseCode >= 400) {
                        System.out.println(url + " - Broken link");
                        Assert.fail(url + " - Broken link");
                    } else {
                        System.out.println(url + " - Link is working");
                    }
                }
            }

        try {
            String url = "https://the-internet.herokuapp.com/status_codes/500";
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
            httpURLConnection.setRequestMethod("HEAD");Thread.sleep(3000);

            int responseCode = httpURLConnection.getResponseCode();
            System.out.println("Response Code: " + responseCode);Thread.sleep(3000);

            String contentType = httpURLConnection.getContentType();
            System.out.println("Content Type: " + contentType);Thread.sleep(3000);

            long contentLength = httpURLConnection.getContentLengthLong();
            System.out.println("Content Length: " + contentLength);Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();Thread.sleep(3000);
        }

    }
}
