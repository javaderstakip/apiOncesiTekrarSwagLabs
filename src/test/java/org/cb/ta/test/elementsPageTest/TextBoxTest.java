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

public class TextBoxTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
//        home.getConsenttouseyourdata().click();
//        Thread.sleep(3000);
        elementsPage.getHomePageButton().click();
        elementsPage.getElementsButton().click();
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
    public void textBoxClick() throws InterruptedException {
        elementsPage.getTextBox().click();
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/text-box"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getFullNameText().isDisplayed());
        System.out.println(elementsPage.getFullNameText());
        elementsPage.getFullName().sendKeys("hami mandıralı");
        elementsPage.getEmail().sendKeys("ha@gmail.com");
        elementsPage.getCurrentAddress().sendKeys("hatay, turkıye");
        elementsPage.getPermanentAddress().sendKeys("hatay, turkıye");
        jsx.executeScript("window.scrollBy(0,250)");
        elementsPage.getSubmit().click();
        Assert.assertTrue(elementsPage.getNameControl().isDisplayed());
        System.out.println(elementsPage.getNameControl().isDisplayed());
        Assert.assertTrue(elementsPage.getTextBoxTextVerify().getText().equals("Name:hami mandıralı"));
        Assert.assertFalse(elementsPage.getTextBoxTextVerify().getText().equals("Name:hami mandıral"));
        System.out.println(elementsPage.getTextBoxTextVerify().getText());
        Assert.assertTrue(elementsPage.getEMailTextVerify().getText().equals("Email:ha@gmail.com"));
        System.out.println(elementsPage.getEMailTextVerify().getText());
        Assert.assertTrue(elementsPage.getCurrentAddressTextVerify().getText().equals("Current Address :hatay, turkıye"));
        System.out.println(elementsPage.getCurrentAddressTextVerify().getText());
        Assert.assertTrue(elementsPage.getPermenantAddressTextVerify().getText().equals("Permananet Address :hatay, turkıye"));
        System.out.println(elementsPage.getPermenantAddressTextVerify().getText());
        //Thread.sleep(3000);
    }
}
