package org.cb.ta.test.formsPageTest;

import org.cb.ta.pages.formsPages.PracticeFormPage;
import org.cb.ta.test.common.BaseTest;
import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.DynamicPropertiesPage;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

    @Test (priority = 2)
    public void practiceFormBeginningFulling2() throws InterruptedException, AWTException {
        practiceFormPage.getFirstName().click();//Thread.sleep(3000);
        practiceFormPage.getFirstName().sendKeys("Hakan");
        //Assert.assertTrue(practiceFormPage.getFirstName().getText().equals("Hakan"));//hata veriyor, test ensonda submit edildikten sonra assert ile test edildi ve gecti.
//        Assert.assertTrue(practiceFormPage.getFirstNameId().getText()
//                .equalsIgnoreCase("Hakan"));
//        Assert.assertTrue(practiceFormPage.getFirstNameId2().getText()
//                .equalsIgnoreCase("Hakan"));
        System.out.println(practiceFormPage.getFirstName().getText());

        practiceFormPage.getLastName().click();//Thread.sleep(3000);
        practiceFormPage.getLastName().sendKeys("Basar");
//        Assert.assertTrue(practiceFormPage.getLastName().getText().equals("Basar"));
        System.out.println(practiceFormPage.getLastName().getText());

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

    //    actions.sendKeys(Keys.ENTER);Thread.sleep(3000);
        jsx.executeScript("window.scrollBy(0,200)");Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();Thread.sleep(3000);
        practiceFormPage.getSubjects().isDisplayed();
        System.out.println(practiceFormPage.getSubjects().isDisplayed());
        practiceFormPage.getSubjects().isEnabled();
        System.out.println(practiceFormPage.getSubjects().isEnabled());
        practiceFormPage.getSubjects().click();
    //    practiceFormPage.getSubjects().sendKeys("mat");//sendKeys("") ile olmayacak sanırım, baska bisey istiyor buyuk ıhtımal.
    //    actions.sendKeys(Keys.ENTER);Thread.sleep(3000);//Math secimi
    //    actions.sendKeys(Keys.ARROW_DOWN).build().perform();
    //    actions.sendKeys(Keys.ARROW_UP).build().perform();
    //    actions.sendKeys(Keys.ENTER).build().perform();Thread.sleep(3000);//asagıdaki ve yukarıdaki secimleri yoruma aldık.

        actions.moveToElement(practiceFormPage.getSubjects()).click().sendKeys("m").perform();Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

        Thread.sleep(3000);

        jsx.executeScript("window.scrollBy(0,200)");

        practiceFormPage.getHobiesSports().click();//Thread.sleep(2000);
        Assert.assertTrue(practiceFormPage.getHobiesSports().isEnabled());
        practiceFormPage.getHobiesReading().click();//Thread.sleep(2000);
        Assert.assertTrue(practiceFormPage.getHobiesReading().isEnabled());
        practiceFormPage.getHobiesMusic().click();//Thread.sleep(2000);
        Assert.assertTrue(practiceFormPage.getHobiesMusic().isEnabled());

        // Dosya yükleme butonuna tıkla
        //practiceFormPage.getChoseFile().click();//locator u calısmadı
        practiceFormPage.getSelectPicture().click();//locator calıstı
        // Dosya yolunu panoya kopyala
        StringSelection stringSelection = new StringSelection("C:\\Users\\Msi\\Pictures\\Screenshot (15).png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        // Klavye tuşlarıyla dosya yolunu yapıştır ve Enter'a bas
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        practiceFormPage.getCurrentAddress().click();
        practiceFormPage.getCurrentAddress().sendKeys("hasar...");

        jsx.executeScript("window.scrollBy(0,200)");

        //practiceFormPage.getState().click();//bu locator da calıstı
        //practiceFormPage.getState2();//bu locator bı ıse yaramadı
        practiceFormPage.getSelectStade().click();//NCR secımı
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_UP).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();//Thread.sleep(3000);

        practiceFormPage.getSelectStade().click();//gurgaon secimi
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();//Thread.sleep(3000);

        practiceFormPage.getState().click();//uttar predesh
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        //actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();//Thread.sleep(3000);

        practiceFormPage.getSelectCity().click();//lucknow
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();//Thread.sleep(3000);

        practiceFormPage.getState().click();//haryana
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();//Thread.sleep(3000);

        practiceFormPage.getSelectCity().click();//panipat
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();//Thread.sleep(3000);

        practiceFormPage.getState().click();//rajatshan
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();//Thread.sleep(3000);

        practiceFormPage.getSelectCity().click();//jaiselmer
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();//Thread.sleep(3000);

        practiceFormPage.getSubmit().click();//calisiyor
        //practiceFormPage.getSubmitButton().click();//iki submit button da calisiyor
    }
    @Test (priority = 3)
    public void practiceFormBeginningFulling3(){
        System.out.println("practiceFormBeginningFulling3(): "
                + practiceFormPage.getStudentname().getText());
        Assert.assertTrue(practiceFormPage.getStudentname().getText().equals("Hakan Basar"));
        System.out.println("practiceFormBeginningFulling3(): "
                + practiceFormPage.getStudentEmail().getText());
        Assert.assertTrue(practiceFormPage.getStudentEmail().getText().equals("hakanbasar@gmail.com"));
        System.out.println("practiceFormBeginningFulling3(): "
                + practiceFormPage.getStudentGender().getText());
        Assert.assertTrue(practiceFormPage.getStudentGender().getText().equals("Other"));
        System.out.println("practiceFormBeginningFulling3(): "
                + practiceFormPage.getStudentMobile().getText());
        System.out.println("practiceFormBeginningFulling3(): "
                + practiceFormPage.getStudentDateOfBirth().getText());
        System.out.println("practiceFormBeginningFulling3(): "
                + practiceFormPage.getStudentSubject().getText());
        System.out.println("practiceFormBeginningFulling3(): "
                + practiceFormPage.getStudentHobbies().getText());
        System.out.println("practiceFormBeginningFulling3(): "
                + practiceFormPage.getStudentPicture().getText());
        System.out.println("practiceFormBeginningFulling3(): "
                + practiceFormPage.getStudentAddress().getText());
        System.out.println("practiceFormBeginningFulling3(): "
                + practiceFormPage.getStudentStateAndCity().getText());
        
    }
}
