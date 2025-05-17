package org.cb.ta.test.alerts_frame_windowsTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.alerts_frame_windowsPages.BrowserWindowsPage;
import org.cb.ta.test.common.BaseTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BrowserWindowsTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        browserWindowsPage.getAlertsFrameWindows().
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //elementsPage.getElementsButton().click();
        practiceFormPage.getPracticeForm().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //elementsPage.getDynamicProperties().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}
