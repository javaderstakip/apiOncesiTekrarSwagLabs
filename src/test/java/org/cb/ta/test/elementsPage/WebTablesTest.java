package org.cb.ta.test.elementsPage;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.test.common.BaseTest;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class WebTablesTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getElementsButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getWebTablesButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("Test calisti.");
        Thread.sleep(2000);
    }
    @Test
    public void webTablesClick(){
        Assert.assertTrue(elementsPage.getWebTablesText().isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/webtables"));
    }
    @Test
    public void webTablesTest() throws InterruptedException {
        Assert.assertFalse(elementsPage.getWebTablesAdd().isSelected());
        Assert.assertTrue(elementsPage.getWebTablesAdd().isEnabled());

        elementsPage.getWebTablesAdd().click();//Thread.sleep(3000);
        Assert.assertTrue(elementsPage.getWebTablesRegistrationForm().getText().equals("Registration Form"));
        actions.sendKeys(Keys.TAB).click().perform();//Thread.sleep(3000);

        elementsPage.getWebTablesAdd().click();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Tahir").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Kelb").perform();
        actions.sendKeys(Keys.TAB).sendKeys("tk@gmail.com").perform();
        actions.sendKeys(Keys.TAB).sendKeys("33").perform();
        actions.sendKeys(Keys.TAB).sendKeys("2500").perform();Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Legal").perform();Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();Thread.sleep(3000);
        elementsPage.getWebTablesRegistrationFormSubmit().click();Thread.sleep(3000);

//        elementsPage.getWebTablesRegistrationFormFirstName().click();
//        elementsPage.getWebTablesRegistrationFormFirstNameText().click();
//        Thread.sleep(3000);
//        actions.moveToElement(elementsPage.getWebTablesRegistrationFormFirstName()).click().build().perform();
//        Thread.sleep(3000);
        //elementsPage.getWebTablesRegistrationFormFirstName().sendKeys("Tahir");Thread.sleep(3000);
//        elementsPage.getWebTablesRegistrationFormLastName().sendKeys("Kelb");
//        elementsPage.getWebTablesRegistrationFormEmail().sendKeys("tk@gmail.com");
//        elementsPage.getWebTablesRegistrationFormAge().sendKeys("33");
//        elementsPage.getWebTablesRegistrationFormSalary().sendKeys("2500");
//        elementsPage.getWebTablesRegistrationFormDepartment().sendKeys("Legal");
//        elementsPage.getWebTablesRegistrationFormSubmit().click();
    }
}
