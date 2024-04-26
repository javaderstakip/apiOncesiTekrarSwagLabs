package org.cb.ta.test;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.HomePage;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ElementsPageTest extends BaseTest {
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
        driver.quit();
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        Thread.sleep(2000);
    }

    @Test
    public void textBoxClick(){
        elementsPage.getTextBox().click();
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/text-box"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getFullNameText().isDisplayed());
        System.out.println(elementsPage.getFullNameText());
    }
    @Test
    public void checkBoxClick(){
        elementsPage.getCheckBox().click();
    }
}
