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
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/checkbox"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getCheckBoxText().isDisplayed());
        System.out.println(elementsPage.getCheckBoxText());
    }
    @Test
    public void radioButtonClick(){
        elementsPage.getRadioButton().click();
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/radio-button"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getCheckBoxText().isDisplayed());
    }
    @Test
    public void webTablesButtonClick(){
        elementsPage.getWebTablesButton().click();
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/webtables"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getWebTablesText().isDisplayed());
    }
    @Test
    public void buttonsClick(){
        elementsPage.getButtons().click();
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/buttons"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getButtonsText().isDisplayed());
    }
    @Test
    public void linksClick(){
        elementsPage.getLinks().click();
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/links"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getLinks().isDisplayed());
        System.out.println(elementsPage.getLinks());
    }
    @Test
    public void brokenLinksImagesClick(){
        elementsPage.getBrokenLinksImages().click();
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/broken"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getBrokenLinksImagesText().isDisplayed());
        System.out.println(elementsPage.getBrokenLinksImagesText());
    }
    @Test
    public void uploadAndDownloadClick(){
        elementsPage.getUploadAndDownload().click();
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/upload-download"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getUploadAndDownload().isDisplayed());
        System.out.println(elementsPage.getUploadAndDownloadText());
    }
    @Test
    public void dynamicPropertiesClick(){
        elementsPage.getDynamicProperties().click();
        webDriverWait.until(WebDriver::getCurrentUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/dynamic-properties"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(elementsPage.getDynamicProperties().isDisplayed());
        System.out.println(elementsPage.getDynamicProperties());

    }
}
