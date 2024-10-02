package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.Keys;
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
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Thread.sleep(2000);
    }
    @Test
    public void webTablesClick() throws InterruptedException {
        Assert.assertTrue(elementsPage.getWebTablesText().isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/webtables"));
        jsx.executeScript("window.scrollBy(0,250)");
        actions.clickAndHold(elementsPage.getWebTablesRtResizer())
                .moveToLocation(920,0).release().build().perform();
        actions.clickAndHold(elementsPage.getWebTablesRtResizer2())
                .moveToLocation(1050,0).release().build().perform();
        //üstteki iki moveToLocation komutu sıfır noktasından konumu istenilen yere götürür
        actions.clickAndHold(elementsPage.getWebTablesRtResizer())
                .moveByOffset(900,0).release().build().perform();
        actions.clickAndHold(elementsPage.getWebTablesRtResizer2())
                .moveByOffset(-300,0).release().build().perform();
        //bu iki moveByOffset komutu bulunulan noktadan istenilen yere götürür
        //Thread.sleep(2000);
        Assert.assertTrue(elementsPage.getWebTablesFirstName().isDisplayed());
        Assert.assertTrue(elementsPage.getWebTablesFirstName().isEnabled());
        System.out.println("isEnabled mı: " + elementsPage.getWebTablesFirstName().isEnabled());
        System.out.println("isEnabled False mi: " + elementsPage.getWebTablesFirstName().isEnabled());
        Assert.assertTrue(elementsPage.getWebTablesLastName().isDisplayed());
        Assert.assertTrue(elementsPage.getWebTablesEmail().isDisplayed());
        Assert.assertTrue(elementsPage.getWebTablesSalary().isDisplayed());
        Assert.assertTrue(elementsPage.getWebTablesDepartment().isDisplayed());
        Assert.assertTrue(elementsPage.getWebTablesAction().isDisplayed());
        //jsx.executeScript("arguments[0].scrollIntoView();", elementsPage.getWebTablesRole());//ise yaramadı
        jsx.executeScript("arguments[0].scrollIntoView();", elementsPage.getWebTablesFirstName());//ise yaradı
        //Thread.sleep(1000);
        Assert.assertTrue(elementsPage.getWebTablesFirstName().isDisplayed());
        jsx.executeScript("arguments[0].scrollIntoView();", elementsPage.getWebTablesLastName());
        //Thread.sleep(1000);
        Assert.assertTrue(elementsPage.getWebTablesLastName().isDisplayed());
        jsx.executeScript("arguments[0].scrollIntoView();", elementsPage.getWebTablesEmail());
        //Thread.sleep(1000);
        Assert.assertTrue(elementsPage.getWebTablesEmail().isDisplayed());
        jsx.executeScript("arguments[0].scrollIntoView();", elementsPage.getWebTablesSalary());
        //Thread.sleep(1000);
        Assert.assertTrue(elementsPage.getWebTablesSalary().isDisplayed());
        jsx.executeScript("arguments[0].scrollIntoView();", elementsPage.getWebTablesDepartment());
        //Thread.sleep(1000);
        Assert.assertTrue(elementsPage.getWebTablesDepartment().isDisplayed());
        jsx.executeScript("arguments[0].scrollIntoView();", elementsPage.getWebTablesAction());
        //Thread.sleep(1000);
        Assert.assertTrue(elementsPage.getWebTablesAction().isDisplayed());
        Assert.assertTrue(elementsPage.getWebTablesAction().isEnabled());
        System.out.println("action isEnabled' mı:" + elementsPage.getWebTablesAction().isEnabled());
        actions.moveToElement(elementsPage.getWebTablesRole());//ise yarasa bile istedigimiz degil
        actions.moveToElement(elementsPage.getWebTablesFirstName());//ise yarasa bile istedigimiz degil
        //Thread.sleep(1000);
    }
    @Test
    public void webTablesTest() throws InterruptedException {
        Assert.assertFalse(elementsPage.getWebTablesAdd().isSelected());
        Assert.assertTrue(elementsPage.getWebTablesAdd().isEnabled());
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesAdd().click();//Thread.sleep(3000);
        Assert.assertTrue(elementsPage.getWebTablesRegistrationForm().getText().equals("Registration Form"));
        actions.sendKeys(Keys.TAB).click().perform();//Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesAdd().click();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Tahir").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Kelb").perform();
        actions.sendKeys(Keys.TAB).sendKeys("tk@gmail.com").perform();
        actions.sendKeys(Keys.TAB).sendKeys("33").perform();
        actions.sendKeys(Keys.TAB).sendKeys("2500").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Legal").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        elementsPage.getWebTablesRegistrationFormSubmit().click();//Thread.sleep(3000);
        Assert.assertTrue(elementsPage.getWebTablesRowsFour().getText().equals("Tahir"));
        System.out.println(elementsPage.getWebTablesRowsFour().getText());

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

        elementsPage.getWebTablesAdd().click();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Hasan Hüseyin Basri").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Hayırhahoğullarıgillerden").perform();
        actions.sendKeys(Keys.TAB).sendKeys("oh@gmail.com").perform();
        actions.sendKeys(Keys.TAB).sendKeys("40").perform();
        actions.sendKeys(Keys.TAB).sendKeys("20500").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Insurance").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        elementsPage.getWebTablesRegistrationFormSubmit().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesAdd().click();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Saniyegül Cavidanşah Handan").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Yakutnur Mihribanzadegiller").perform();
        actions.sendKeys(Keys.TAB).sendKeys("oh@gmail.com").perform();
        actions.sendKeys(Keys.TAB).sendKeys("40").perform();
        actions.sendKeys(Keys.TAB).sendKeys("45000").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys("Insurance").perform();//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        elementsPage.getWebTablesRegistrationFormSubmit().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesFirstName().click();//Thread.sleep(1000);
        Assert.assertTrue(elementsPage.getWebTablesFirstRows().getText().equals("Alden"));
        elementsPage.getWebTablesLastName().click();//Thread.sleep(1000);
        elementsPage.getWebTablesAge().click();//Thread.sleep(1000);
        elementsPage.getWebTablesEmail().click();//Thread.sleep(1000);
        elementsPage.getWebTablesSalary().click();//Thread.sleep(1000);
        elementsPage.getWebTablesDepartment().click();//Thread.sleep(1000);
        elementsPage.getWebTablesAction().click();//Thread.sleep(1000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesFirstName().click();//Thread.sleep(1000);
        elementsPage.getWebTablesFirstName().click();//Thread.sleep(1000);
        Assert.assertTrue(elementsPage.getWebTablesFirstRows().getText().equals("Tahir"));
        elementsPage.getWebTablesLastName().click();//Thread.sleep(1000);
        elementsPage.getWebTablesAge().click();//Thread.sleep(1000);
        elementsPage.getWebTablesEmail().click();//Thread.sleep(1000);
        elementsPage.getWebTablesSalary().click();//Thread.sleep(1000);
        elementsPage.getWebTablesDepartment().click();//Thread.sleep(1000);
        elementsPage.getWebTablesAction().click();//Thread.sleep(1000);
        elementsPage.getWebTablesAction().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Thread.sleep(1000);
        jsx.executeScript("window.scrollBy(0,250)");
        //Thread.sleep(1000);

        elementsPage.getWebTablesTypeToSearch().click();
        actions.sendKeys("tahir").perform();
        elementsPage.getWebTablesSearch().click();Thread.sleep(3000);
        Assert.assertTrue(elementsPage.getWebTablesSearch().isEnabled());
        elementsPage.getWebTablesTypeToSearch().click();
        //Assert.assertTrue(elementsPage.getWebTablesFirstRows().getText().equals("Tahir"));
        Assert.assertTrue(elementsPage.getWebTablesFirstRows().getText().equalsIgnoreCase("tahir"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesTypeToSearch().click();
        actions.sendKeys("duran").perform();
        elementsPage.getWebTablesSearch().click();Thread.sleep(3000);
        Assert.assertTrue(elementsPage.getWebTablesSearch().isEnabled());
        elementsPage.getWebTablesTypeToSearch().click();
        Assert.assertTrue(elementsPage.getWebTablesRowsFirstLastName().getText()
                .equalsIgnoreCase("duran"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesTypeToSearch().click();
        actions.sendKeys("insurance").perform();
        elementsPage.getWebTablesSearch().click();Thread.sleep(3000);
        Assert.assertTrue(elementsPage.getWebTablesSearch().isEnabled());
        elementsPage.getWebTablesTypeToSearch().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Assert.assertTrue(elementsPage.getWebTablesRowsFirstDepartmant().getText()
                .equalsIgnoreCase("insurance"));
        System.out.println("birinci satır altıncı sütun getText: "+elementsPage.getWebTablesRowsFirstDepartmant().getText());
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        elementsPage.getWebTablesActionEditFirst().click();
        actions.sendKeys(Keys.TAB).perform();Thread.sleep(3000);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB).sendKeys("Kadir").perform();
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.TAB).sendKeys("5000").perform();Thread.sleep(3000);
        actions.sendKeys(Keys.TAB);//Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();//Thread.sleep(3000);
        elementsPage.getWebTablesRegistrationFormSubmit().click();
        elementsPage.getWebTablesFirstName().click();
        elementsPage.getWebTablesFirstName().click();
        Assert.assertTrue(elementsPage.getWebTablesRowsFirstLastName().getText().equals("Kadir"));
        System.out.println("ilk satırın lastname i ne oldu :" + elementsPage.getWebTablesRowsFirstLastName().getText());
        Thread.sleep(3000);

        jsx.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1000);
        elementsPage.getWebTablesRows().click();//Thread.sleep(1000);
        elementsPage.getWebTablesRowsFive().click();//Thread.sleep(1000);
        elementsPage.getWebTablesNext().click();//Thread.sleep(3000);
//        System.out.println("page number ne yazdı acaba: " + elementsPage.getWebTablesPage().getText());
//        System.out.println("page number ne yazdı acaba2: " + elementsPage.getWebTablesPage2().getText());
//        System.out.println("page number ne yazdı acaba3: " + elementsPage.getWebTablesPage3().getText());
//        System.out.println("page number ne yazdı acaba4: " + elementsPage.getWebTablesPage4().getText());
//        System.out.println("page number ne yazdı acaba5: " + elementsPage.getWebTablesPage5().getText());
//        Assert.assertTrue(elementsPage.getWebTablesPage5().getText().equals(""));
        elementsPage.getWebTablesPrevious().click();//Thread.sleep(3000);
//        Assert.assertTrue(elementsPage.getWebTablesPage().getText().equalsIgnoreCase("1"));
        elementsPage.getWebTablesPages().click();//Thread.sleep(3000);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("2")
                .sendKeys(Keys.ENTER).build().perform();
        //Thread.sleep(1000);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("1")
                .sendKeys(Keys.ENTER).build().perform();
        //Thread.sleep(3000);
        Assert.assertTrue(elementsPage.getWebTablesTotalPages().getText().equals("2"));
        System.out.println("toplam sayfa sayısı :" + elementsPage.getWebTablesTotalPages().getText());

        elementsPage.getWebTablesRows().click();
        elementsPage.getWebTablesRowsTen().click();
        elementsPage.getWebTablesFirstName().click();
        System.out.println("ilk satır ilk situn: " + elementsPage.getWebTablesFirstRows().getText());
        Assert.assertTrue(elementsPage.getWebTablesFirstRows().getText().equals("Alden"));
        System.out.println("FirstRows testimiz çalıştı, sen de bi bak!");
        elementsPage.getWebTablesFirstName().click();
        Assert.assertTrue(elementsPage.getWebTablesFirstRows().getText().equals("Tahir"));
        
        Assert.assertTrue(elementsPage.getWebTablesActionDeleteIsDisplayedTahir().isDisplayed());
        System.out.println("tahir görünüyor mu? " + elementsPage.getWebTablesActionDeleteIsDisplayedTahir()
                .isDisplayed());
        elementsPage.getWebTablesActionDelete().click();Thread.sleep(2000);
        Assert.assertFalse(elementsPage.getWebTablesCellFirst().getText()
                .equalsIgnoreCase("tahir"));
        System.out.println("tahir görünüyor mu? " + elementsPage.getWebTablesCellFirst().getText());
        Assert.assertTrue(elementsPage.getWebTablesActionDeleteIsDisplayedOya().isDisplayed());
        System.out.println("oya var mı? "+elementsPage.getWebTablesActionDeleteIsDisplayedOya().isDisplayed());
        elementsPage.getWebTablesActionDelete2().click();
        Assert.assertFalse(elementsPage.getWebTablesCellFifteen().getText()
                .equalsIgnoreCase("oya"));
        System.out.println(elementsPage.getWebTablesCellFifteen().getText());
    }
}
