package org.cb.ta.test.alerts_frame_windowsTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.HomePage;
import org.cb.ta.pages.alerts_frame_windowsPages.ModalDialogsPage;
import org.cb.ta.test.common.BaseTest;
import org.junit.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class ModalDialogsTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    HomePage homePage = new HomePage(driver);
    ModalDialogsPage modalDialogsPage = new ModalDialogsPage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();Thread.sleep(1000);
        homePage.getAlertFrameWindowsButton().click();
        modalDialogsPage.getModalDialogs().click();
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
    public void dialogsPageTest(){
        assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/modal-dialogs"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        System.out.println("ne yazıyor: " +  modalDialogsPage.getModalDialogs().getText());
        System.out.println("ne yazıyor: " +  modalDialogsPage.getModalDialogsText().getText());
        Assert.assertTrue(modalDialogsPage.getModalDialogs().isDisplayed());
        Assert.assertTrue(modalDialogsPage.getModalDialogsText().isDisplayed());
        Assert.assertTrue(modalDialogsPage.getModalDialogs().getText()
                .equalsIgnoreCase("Modal Dialogs"));
        Assert.assertTrue(modalDialogsPage.getModalDialogsText().getText()
                .equalsIgnoreCase("Modal Dialogs"));
//        Assert.assertTrue(nestedFramesPage.getSampleNestedIframepageText().isDisplayed());
//        System.out.println("ne yazıyor burada da: " + nestedFramesPage
//                .getSampleNestedIframepageText().getText());
    }
}
