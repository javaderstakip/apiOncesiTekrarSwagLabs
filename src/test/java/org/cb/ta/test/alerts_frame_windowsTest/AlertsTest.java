package org.cb.ta.test.alerts_frame_windowsTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.alerts_frame_windowsPages.AlertsPage;
import org.cb.ta.test.common.BaseTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class AlertsTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    AlertsPage alertsPage = new AlertsPage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        browserWindowsPage.getAlertsFrameWindows().click();//Thread.sleep(1000);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //elementsPage.getElementsButton().click();
        //elementsPage.getDynamicProperties().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }}
