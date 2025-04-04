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
        Assert.assertTrue(practiceFormPage.getPracticeFormText().isDisplayed());
        Assert.assertTrue(practiceFormPage.getPracticeFormText().getText()
                .equalsIgnoreCase("Practice Form"));
        System.out.println("text kisminda ne yaziyor: " + practiceFormPage.getPracticeFormText()
                .getText());
        Assert.assertTrue(practiceFormPage.getStudentRegistrationFormText().isDisplayed());
        Assert.assertTrue(practiceFormPage.getStudentRegistrationFormText().getText()
                .equalsIgnoreCase("Student Registration Form"));
        System.out.println("text kisminda ne yaziyor: " + practiceFormPage
                .getStudentRegistrationFormText().getText());
    }
    @Test(priority = 2)
    public void practiceFormBeginningFulling() throws InterruptedException {
        practiceFormPage.getFirstName().click();//Thread.sleep(3000);
        practiceFormPage.getFirstName().sendKeys("Hakan");

        practiceFormPage.getLastName().click();//Thread.sleep(3000);
        practiceFormPage.getLastName().sendKeys("Basar");

        practiceFormPage.getEMail().click();
        practiceFormPage.getEMail().sendKeys("hakanbasar@gmail.com");

        practiceFormPage.getGenderLabelMale().click();//Thread.sleep(3000);
        practiceFormPage.getGenderLabelFemale().click();//Thread.sleep(3000);
        practiceFormPage.getGenderLabelOther().click();//Thread.sleep(3000);

        practiceFormPage.getMobileNumber().click();
        practiceFormPage.getMobileNumber().sendKeys("3125353535");

        practiceFormPage.getDateOfBirth().click();//Thread.sleep(3000);
        practiceFormPage.getBinDokuzYuzSeksen().click();//Thread.sleep(3000);
        practiceFormPage.getSeptember().click();//Thread.sleep(3000);
        practiceFormPage.getYirmiUcuncuGun().click();//Thread.sleep(3000);

        jsx.executeScript("window.scrollBy(0,250)");
        practiceFormPage.getSubjects4().click();Thread.sleep(3000);
        practiceFormPage.getSubjects4().sendKeys("Practices Forms");
    }
    @Test(priority = 2)
    public void firstName() throws InterruptedException {
        practiceFormPage.getFirstName().click();Thread.sleep(3000);
        practiceFormPage.getFirstName().sendKeys("Hakan");
        practiceFormPage.getFirstName().click();
//        jsx.executeScript("window.scrollBy(0,550)");
//        practiceFormPage.getSubmitButton().click();Thread.sleep(3000);
//        System.out.println(practiceFormPage.getFirstName().getText());
//        Assert.assertTrue(practiceFormPage.getFirstName().getText()
//                .equalsIgnoreCase("Hakan"));

        practiceFormPage.getLastName().click();//Thread.sleep(3000);
        practiceFormPage.getLastName().sendKeys("Basar");
        System.out.println(practiceFormPage.getLastName().getText());
        jsx.executeScript("window.scrollBy(0,550)");
        practiceFormPage.getSubmitButton().click();Thread.sleep(3000);
        System.out.println(practiceFormPage.getLastName().getText());

//        practiceFormPage.getFirstNameId().click();
//        practiceFormPage.getFirstNameId().sendKeys("Hakan");
//        practiceFormPage.getFirstNameId().click();
//        jsx.executeScript("window.scrollBy(0,550)");
//        practiceFormPage.getSubmitButton().click();
//        System.out.println(practiceFormPage.getFirstNameId().getText());
//        Assert.assertTrue(practiceFormPage.getFirstNameId().getText()
//                .equals("Hakan"));
    }
    @Test(priority = 3)
    public void lastName() throws InterruptedException {
        practiceFormPage.getLastName().click();//Thread.sleep(3000);
        practiceFormPage.getLastName().sendKeys("Basar");
        System.out.println(practiceFormPage.getLastName().getText());
    }
}
