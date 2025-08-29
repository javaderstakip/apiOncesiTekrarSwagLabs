package org.cb.ta.test.alerts_frame_windowsTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.HomePage;
import org.cb.ta.pages.alerts_frame_windowsPages.FramesPage;
import org.cb.ta.test.common.BaseTest;
import org.testng.annotations.*;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class FramesTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    FramesPage framesPage = new FramesPage(driver);
    HomePage homePage = new HomePage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
       elementsPage.getHomePageButton().click();Thread.sleep(1000);
       homePage.getAlertFrameWindowsButton().click();
       //framesPage.getFrames().click();//Thread.sleep(1000);
        //framesPage.getFrames2().click();
        framesPage.getFrames3().click();

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
    public void alertBeginningTest(){
        assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/frames"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
    }
    @Test(priority = 2)
    public void thisIsASamplePageTest(){
        //framesPage.getFramesSamplePage().click();
        driver.switchTo().frame("frame1");
        driver.switchTo().defaultContent();
        jsx.executeScript("window.scrollBy(0,450)");
        driver.switchTo().frame("frame2");
    }
}
