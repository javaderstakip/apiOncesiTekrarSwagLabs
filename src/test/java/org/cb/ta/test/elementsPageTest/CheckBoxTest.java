package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckBoxTest extends BaseTest {

    ElementsPage elementsPage = new ElementsPage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
//        home.getConsenttouseyourdata().click();
//        Thread.sleep(3000);
        elementsPage.getHomePageButton().click();
        elementsPage.getElementsButton().click();
        elementsPage.getCheckBox().click();
//        Thread.sleep(5000);
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
    @Test
    public void checkBoxClick(){
        elementsPage.getCheckBox().click();
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/checkbox"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getCheckBoxText().isDisplayed());
        System.out.println(elementsPage.getCheckBoxText());
        jsx.executeScript("window.scrollBy(0,250)");
        elementsPage.getPlusButton().click();
        Assert.assertTrue(elementsPage.getPlusButton().isEnabled());
        jsx.executeScript("window.scrollBy(0,250)");
        elementsPage.getMinesButton().click();
        Assert.assertTrue(elementsPage.getMinesButton().isEnabled());
        Assert.assertFalse(elementsPage.getMinesButton().isSelected());
        //elementsPage.getPlusButton().click();
        elementsPage.getCheckBoxHomeArrow().click();
        elementsPage.getCheckBoxHomeBox().click();
        //elementsPage.getCheckBoxHomeArrow().click();
        Assert.assertFalse(elementsPage.getCheckBoxHomeBox().isSelected());
        Assert.assertTrue(elementsPage.getCheckBoxHomeBox().isEnabled());
        Assert.assertTrue(elementsPage.getCheckBoxHomeArrow().isEnabled());

        elementsPage.getCheckBoxHomeArrow().click();
        elementsPage.getCheckBoxHomeArrow().click();
        Assert.assertTrue(elementsPage.getCheckBoxDesktopBox().isEnabled());

        Assert.assertTrue(elementsPage.getCheckBoxDesktopArrow().isEnabled());

        Assert.assertTrue(elementsPage.getCheckBoxDesktopBox().isDisplayed());
        elementsPage.getCheckBoxDesktopArrow().click();
        elementsPage.getCheckBoxDesktopBox().click();
        //elementsPage.getCheckBoxDesktopArrow().click();

        Assert.assertTrue(elementsPage.getCheckBoxNotes().isEnabled());
        elementsPage.getCheckBoxNotes().click();

        Assert.assertTrue(elementsPage.getCheckBoxCommands().isEnabled());
        elementsPage.getCheckBoxCommands().click();

        elementsPage.getCheckBoxDocumentsArrow().click();
        Assert.assertTrue(elementsPage.getCheckBoxDocumentsArrow().isEnabled());

        Assert.assertTrue(elementsPage.getCheckBoxDocumentsBox().isEnabled());
        elementsPage.getCheckBoxDocumentsBox().click();
        //elementsPage.getCheckBoxDocumentsBox().click();

        Assert.assertTrue(elementsPage.getCheckBoxWorkspacesArrow().isEnabled());
        elementsPage.getCheckBoxWorkspacesArrow().click();
        //elementsPage.getCheckBoxWorkspacesArrow().click();

        Assert.assertTrue((elementsPage.getCheckBoxWorkspacesBox().isEnabled()));
        elementsPage.getCheckBoxWorkspacesBox().click();
        elementsPage.getCheckBoxWorkspacesBox().click();

        Assert.assertTrue(elementsPage.getCheckBoxReactBox().isEnabled());
        elementsPage.getCheckBoxReactBox().click();

        Assert.assertTrue(elementsPage.getCheckBoxAngularBox().isEnabled());
        elementsPage.getCheckBoxAngularBox().click();

        Assert.assertTrue(elementsPage.getCheckBoxVeuBox().isEnabled());
        elementsPage.getCheckBoxVeuBox().click();

        Assert.assertTrue(elementsPage.getCheckBoxOfficeArrow().isEnabled());
        elementsPage.getCheckBoxOfficeArrow().click();

        Assert.assertTrue(elementsPage.getCheckBoxOfficeBox().isEnabled());
        elementsPage.getCheckBoxOfficeBox().click();

        Assert.assertTrue(elementsPage.getCheckBoxPublicBox().isEnabled());
        elementsPage.getCheckBoxPublicBox().click();

        Assert.assertTrue(elementsPage.getCheckBoxPrivateBox().isEnabled());
        elementsPage.getCheckBoxPrivateBox().click();

        Assert.assertTrue(elementsPage.getCheckBoxClassifiedBox().isEnabled());
        elementsPage.getCheckBoxClassifiedBox().click();

        Assert.assertTrue(elementsPage.getCheckBoxGeneralBox().isEnabled());
        elementsPage.getCheckBoxGeneralBox().click();

        Assert.assertTrue(elementsPage.getCheckBoxDownloadsArrow().isEnabled());
        elementsPage.getCheckBoxDownloadsArrow().click();

        Assert.assertTrue((elementsPage.getCheckBoxDownloadsBox().isEnabled()));
        elementsPage.getCheckBoxDownloadsBox().click();
        elementsPage.getCheckBoxDownloadsBox().click();
        System.out.println(elementsPage.getCheckBoxDownloadsText().getText());
        Assert.assertTrue(elementsPage.getCheckBoxDownloadsText().isDisplayed());

        Assert.assertTrue(elementsPage.getCheckBoxWordFileBox().isEnabled());
        elementsPage.getCheckBoxWordFileBox().click();
        elementsPage.getCheckBoxWordFileBox().click();
        Assert.assertTrue(elementsPage.getCheckBoxWordFileText().isDisplayed());
        System.out.println(elementsPage.getCheckBoxWordFileText().getText());

        Assert.assertTrue(elementsPage.getCheckBoxExcelFileBox().isEnabled());
        elementsPage.getCheckBoxExcelFileBox().click();
        elementsPage.getCheckBoxExcelFileBox().click();
        Assert.assertTrue(elementsPage.getCheckBoxExcelFileText().isDisplayed());
        System.out.println(elementsPage.getCheckBoxExcelFileText().getText());
    }
}
