package org.cb.ta.test.widgets;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.HomePage;
import org.cb.ta.pages.widgets.AccordianPage;
import org.cb.ta.test.common.BaseTest;
import org.junit.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class AccordianTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    HomePage homePage = new HomePage(driver);
    AccordianPage accordianPage = new AccordianPage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();//Thread.sleep(1000);
        homePage.getWidgetButton().click();
        accordianPage.getAccordianButton().click();
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
    public void accordianPageBeginningTest(){
        assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/accordian"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(accordianPage.getAccordianText().isDisplayed());
        Assert.assertTrue(accordianPage.getAccordianText().getText()
                .equalsIgnoreCase("Accordian"));
    }

}
