package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.ButtonsPage;
import org.cb.ta.test.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class ButtonsTest extends BaseTest {
    ButtonsPage buttonsPage = new ButtonsPage(driver);
    ElementsPage elementsPage = new ElementsPage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getElementsButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getButtons().click();
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
        //Thread.sleep(2000);
    }
    @Test
    public void buttonsTestClick(){

        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/buttons"));
        System.out.println("Buttons yazısı göründü mü? "+buttonsPage.getButtonsText().getText());
        Assert.assertTrue(buttonsPage.getButtonsText().isDisplayed());
    }
    @Test
    public void doubleClick() throws InterruptedException {
        Thread.sleep(2000);
        actions.doubleClick(buttonsPage.getButtonsDoubleClickLocator()).build().perform();
        System.out.println("cift clikledi mi? ");
        Assert.assertTrue(buttonsPage.getYouHaveDoneDoubleClickText().getText()
                .equalsIgnoreCase("You have done a double click"));
        System.out.println("evet : "+ buttonsPage.getYouHaveDoneDoubleClickText().getText());
    }
}
