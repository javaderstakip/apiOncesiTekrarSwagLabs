package org.cb.ta.test.formsPageTest;

import org.cb.ta.pages.formsPages.PracticeFormPage;
import org.cb.ta.test.common.BaseTest;
import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.DynamicPropertiesPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class PracticeFormTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        practiceFormPage.getForms().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //elementsPage.getElementsButton().click();
        practiceFormPage.getPracticeForm().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
        //Thread.sleep(2000);
        //driver.get("https://demoqa.com/upload-download");
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
        //driver.get("https://demoqa.com/upload-download");
    }
    @Test(priority = 1)
    public void practiceFormBeginningTest() {
        Assert.assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/automation-practice-form"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
//        Assert.assertTrue(dynamicPropertiesPage.getDynamicPropertiesText().isDisplayed());
//        Assert.assertTrue(dynamicPropertiesPage.getDynamicPropertiesText().getText()
//                .equalsIgnoreCase("Dynamic Properties"));
//        System.out.println("text kisminda ne yaziyor: " + dynamicPropertiesPage
//                .getDynamicPropertiesText().getText());
    }
}
