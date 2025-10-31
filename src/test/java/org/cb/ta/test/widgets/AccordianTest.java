package org.cb.ta.test.widgets;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.HomePage;
import org.cb.ta.pages.widgets.AccordianPage;
import org.cb.ta.test.common.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

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
}
