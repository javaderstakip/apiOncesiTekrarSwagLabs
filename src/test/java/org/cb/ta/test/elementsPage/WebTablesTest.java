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
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getElementsButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Thread.sleep(2000);
    }
    @Test
    public void webTablesClick(){
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertTrue(elementsPage.getWebTablesText().isDisplayed());
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/webtables"));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void webTablesTest() throws InterruptedException {
        Assert.assertFalse(elementsPage.getWebTablesAdd().isSelected());
        Assert.assertTrue(elementsPage.getWebTablesAdd().isEnabled());
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesAdd().click();//Thread.sleep(3000);
        Assert.assertTrue(elementsPage.getWebTablesRegistrationForm().getText().equals("Registration Form"));
        actions.sendKeys(Keys.TAB).click().perform();//Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

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

        elementsPage.getWebTablesAdd().click();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Bahri").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Duran").perform();
        actions.sendKeys(Keys.TAB).sendKeys("bd@gmail.com").perform();
        actions.sendKeys(Keys.TAB).sendKeys("23").perform();
        actions.sendKeys(Keys.TAB).sendKeys("21500").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Compliance").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        elementsPage.getWebTablesRegistrationFormSubmit().click();//Thread.sleep(3000);

        elementsPage.getWebTablesAdd().click();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Oya").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Hayır").perform();
        actions.sendKeys(Keys.TAB).sendKeys("oh@gmail.com").perform();
        actions.sendKeys(Keys.TAB).sendKeys("40").perform();
        actions.sendKeys(Keys.TAB).sendKeys("4500").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Insurance").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        elementsPage.getWebTablesRegistrationFormSubmit().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesFirsName().click();
        elementsPage.getWebTablesLastName().click();
        elementsPage.getWebTablesAge().click();
        //elementsPage.getEmail().click();
        elementsPage.getWebTablesSalary().click();
        elementsPage.getWebTablesDepartment().click();
        elementsPage.getWebTablesAction().click();Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesFirsName().click();
        elementsPage.getWebTablesLastName().click();
        elementsPage.getWebTablesAge().click();
        //elementsPage.getEmail().click();
        elementsPage.getWebTablesSalary().click();
        elementsPage.getWebTablesDepartment().click();
        elementsPage.getWebTablesAction().click();Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesTypeToSearch().click();
        actions.sendKeys("tahir").perform();
        elementsPage.getWebTablesSearch().click();
        Assert.assertTrue(elementsPage.getWebTablesSearch().isEnabled());
        elementsPage.getWebTablesTypeToSearch().click();
        actions.sendKeys(Keys.DELETE).perform();

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
