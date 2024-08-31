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
    public void webTablesClick() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertTrue(elementsPage.getWebTablesText().isDisplayed());
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/webtables"));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions.clickAndHold(elementsPage.getWebTablesRtResizer())
                .moveToLocation(920,0).release().build().perform();
        actions.clickAndHold(elementsPage.getWebTablesRtResizer2())
                .moveToLocation(1050,0).release().build().perform();
        //üstteki iki moveToLocation komutu sıfır noktasından konumu istenilen yere götürür
        actions.clickAndHold(elementsPage.getWebTablesRtResizer())
                .moveByOffset(900,0).release().build().perform();
        actions.clickAndHold(elementsPage.getWebTablesRtResizer2())
                .moveByOffset(-1000,0).release().build().perform();
        //bu iki moveByOffset komutu bulunulan noktadan istenilen yere götürür
        Thread.sleep(1000);
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
        actions.sendKeys(Keys.TAB).sendKeys("2500").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Legal").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
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

        elementsPage.getWebTablesFirsName().click();//Thread.sleep(1000);
        elementsPage.getWebTablesLastName().click();//Thread.sleep(1000);
        elementsPage.getWebTablesAge().click();//Thread.sleep(1000);
        elementsPage.getWebTablesEmail().click();//Thread.sleep(1000);
        elementsPage.getWebTablesSalary().click();//Thread.sleep(1000);
        elementsPage.getWebTablesDepartment().click();//Thread.sleep(1000);
        elementsPage.getWebTablesAction().click();//Thread.sleep(1000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesFirsName().click();//Thread.sleep(1000);
        elementsPage.getWebTablesLastName().click();//Thread.sleep(1000);
        elementsPage.getWebTablesAge().click();//Thread.sleep(1000);
        elementsPage.getWebTablesEmail().click();//Thread.sleep(1000);
        elementsPage.getWebTablesSalary().click();//Thread.sleep(1000);
        elementsPage.getWebTablesDepartment().click();//Thread.sleep(1000);
        elementsPage.getWebTablesAction().click();//Thread.sleep(1000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Thread.sleep(1000);
        jsx.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1000);

        elementsPage.getWebTablesTypeToSearch().click();
        actions.sendKeys("tahir").perform();
        elementsPage.getWebTablesSearch().click();//Thread.sleep(3000);
        Assert.assertTrue(elementsPage.getWebTablesSearch().isEnabled());
        elementsPage.getWebTablesTypeToSearch().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesTypeToSearch().click();
        actions.sendKeys("duran").perform();
        elementsPage.getWebTablesSearch().click();//Thread.sleep(3000);
        Assert.assertTrue(elementsPage.getWebTablesSearch().isEnabled());
        elementsPage.getWebTablesTypeToSearch().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesActionEdit().click();
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB).sendKeys("Kadir").perform();
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB).sendKeys("5000").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB);//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        elementsPage.getWebTablesRegistrationFormSubmit().click();

        //jsx.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1000);
        elementsPage.getWebTablesRows().click();Thread.sleep(1000);
        elementsPage.getWebTablesRowsFive().click();Thread.sleep(1000);
        elementsPage.getWebTablesNext().click();Thread.sleep(3000);
        elementsPage.getWebTablesPrevious().click();Thread.sleep(3000);
        elementsPage.getWebTablesPages().click();Thread.sleep(3000);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("2").perform();
        Thread.sleep(1000);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("1").perform();

        Thread.sleep(3000);
        elementsPage.getWebTablesActionDelete().click();Thread.sleep(2000);
        elementsPage.getWebTablesActionDelete2().click();

    }
}
