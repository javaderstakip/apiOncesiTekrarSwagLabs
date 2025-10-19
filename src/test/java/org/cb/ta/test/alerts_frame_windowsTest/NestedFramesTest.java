package org.cb.ta.test.alerts_frame_windowsTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.HomePage;
import org.cb.ta.pages.alerts_frame_windowsPages.FramesPage;
import org.cb.ta.pages.alerts_frame_windowsPages.NestedFramesPage;
import org.cb.ta.test.common.BaseTest;
import org.junit.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class NestedFramesTest extends BaseTest{
    ElementsPage elementsPage = new ElementsPage(driver);
    NestedFramesPage nestedFramesPage =new NestedFramesPage(driver);
    HomePage homePage = new HomePage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();Thread.sleep(1000);
        homePage.getAlertFrameWindowsButton().click();
        //framesPage.getFrames().click();//Thread.sleep(1000);
        //framesPage.getFrames2().click();
        nestedFramesPage.getNestedFrames().click();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //elementsPage.getElementsButton().click();
        //elementsPage.getDynamicProperties().click();
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

//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
        //Thread.sleep(2000);
        //driver.get("https://demoqa.com/upload-download");
        // Pencere "handle"larını al
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

//        List<String> windowHandles = new ArrayList<>();
//        for (String handle : driver.getWindowHandles()) {
//            if (!handle.equals(driver.getWindowHandle())) {
//                windowHandles.add(handle);
//            }
//        }
//        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
    }
    @Test(priority = 1)
    public void nestedFramesBeginningTest(){
        assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/nestedframes"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        System.out.println("ne yazıyor: " +  nestedFramesPage.getNestedFramesText().getText());
        Assert.assertTrue(nestedFramesPage.getNestedFramesText().isDisplayed());
        Assert.assertTrue(nestedFramesPage.getNestedFramesText().getText()
                .equalsIgnoreCase("Nested Frames"));
        Assert.assertTrue(nestedFramesPage.getSampleNestedIframepageText().isDisplayed());
        System.out.println("ne yazıyor burada da: " + nestedFramesPage
                .getSampleNestedIframepageText().getText());
    }
    @Test(priority = 2)
    public void nestedFramesTest() throws InterruptedException {
        driver.switchTo().frame("frame1");
        System.out.println("ne oldu simdi: " + nestedFramesPage.getParentText().getText());

        driver.switchTo().frame(0);
        System.out.println("ne oldu simdi: " + nestedFramesPage.getChildText().getText());;
//        nestedFramesPage.getParentFreme().getText();
//        System.out.println("ne bulduk: " + nestedFramesPage.getParentFreme().getText());
    }
}
