package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.test.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RadioButtonTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        elementsPage.getElementsButton().click();
        elementsPage.getRadioButton().click();
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
    public void radioButtonClick(){
        Assert.assertTrue(elementsPage.getRadioButtonText().isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/radio-button"));
    }
    @Test
    public void radioButton(){
        elementsPage.getRadioButtonYes().click();
        Assert.assertTrue(elementsPage.getRadioButtonYesText().isDisplayed());
        Assert.assertTrue(elementsPage.getRadioButtonYesText().getText().equals("Yes"));
        System.out.println(elementsPage.getRadioButtonYesText().getText());

        elementsPage.getRadioButtonImpressive().click();
        elementsPage.getRadioButtonYes().click();
        Assert.assertTrue(elementsPage.getRadioButtonImpressiveText().isDisplayed());
        Assert.assertTrue(elementsPage.getRadioButtonImpressiveText().getText().equals("Impressive"));
        System.out.println(elementsPage.getRadioButtonImpressiveText().getText());

        Assert.assertTrue(elementsPage.getRadioButtonNo().isSelected());
    }
}
