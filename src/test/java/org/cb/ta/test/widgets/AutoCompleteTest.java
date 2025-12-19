package org.cb.ta.test.widgets;

import net.bytebuddy.asm.Advice;
import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.HomePage;
import org.cb.ta.pages.widgets.AccordianPage;
import org.cb.ta.pages.widgets.AutoCompletePage;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class AutoCompleteTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    HomePage homePage = new HomePage(driver);
    AutoCompletePage autoCompletePage = new AutoCompletePage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();//Thread.sleep(1000);
        homePage.getWidgetButton().click();
        autoCompletePage.getAutoCompleteButton().click();
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

//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
        //Thread.sleep(2000);
        //driver.get("https://demoqa.com/upload-download");
        // Pencere "handle"larını al
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

//        List<String> windowHandles = new ArrayList<>();
//        for (String handle : driver.getWindowHandles()) {
//            if (!handle.equals(driver.getWindowHandle())) {
//                windowHandles.add(handle);
//            }
//        }
//        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
    }
    @Test(priority = 1)
    public void autoCompletePageBeginningTest(){
        Assert.assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/auto-complete"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        System.out.println("ne yazıyor: " + autoCompletePage.getAutoCompleteText().getText());
        Assert.assertTrue(autoCompletePage.getAutoCompleteText().isDisplayed());
        Assert.assertTrue(autoCompletePage.getAutoCompleteText().getText()
                .equalsIgnoreCase("Auto Complete"));
    }
    @Test(priority = 2)
    public void autoCompletePageMultipleContainerTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));Thread.sleep(2000);
        //Assert.assertTrue(autoCompletePage.getMultipleContainer().isSelected());
        autoCompletePage.getMultipleContainer().click();Thread.sleep(2000);
        autoCompletePage.getMultipleContainer().sendKeys("ye");
    }
}
