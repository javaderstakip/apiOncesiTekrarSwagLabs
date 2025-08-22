package org.cb.ta.test.alerts_frame_windowsTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.alerts_frame_windowsPages.AlertsPage;
import org.cb.ta.test.common.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class AlertsTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    AlertsPage alertsPage = new AlertsPage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();Thread.sleep(1000);
        alertsPage.getAlertsFrameWindows().click();Thread.sleep(1000);
//        alertsPage.getAlertsFrameWindows2().click();//Thread.sleep(1000);
//        alertsPage.getAlertsFrameWindows3().click();//Thread.sleep(1000);
        alertsPage.getAlerts().click();//Thread.sleep(1000);

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //elementsPage.getElementsButton().click();
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
    public void alertBeginningTest(){
        assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/alerts"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
    }
    @Test(priority = 2)
    public void toSeeAlertTest() throws InterruptedException {
        alertsPage.getToSeeAlert().click(); Thread.sleep(2000);
        try {
            // demoqa.com/alerts adresine gidin

            // Alert'i tetikleyen butona tıklayın
            // Ekran görüntüsüne göre, 'Click Button to see alert' veya benzeri bir butona tıklamanız gerekiyor.
            // Bu örnekte, ilk 'Click me' butonuna tıklayarak alert'i tetikleyelim.
            // Butonun XPath'ini veya CSS Selector'ını doğru bulmanız önemlidir.
            // Ekran görüntüsündeki "Click me" butonunun locator'ı, aşağıdaki gibi olabilir:
            // driver.findElement(By.id("alertButton")).click(); // Eğer id'si buysa
            // Ya da belirli bir metin içeriyorsa:

            // Alert'in görünmesini bekleyin (maksimum 10 saniye)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());

            // Alert'e geçiş yapın
            Alert alert = driver.switchTo().alert();

            // Alert kutusunun metnini alın (isteğe bağlı, doğrulama için)
            String alertMessage = alert.getText();
            System.out.println("Alert Mesajı: " + alertMessage); // Konsola "Alert Mesajı: demoqa.com says You clicked a button" yazacaktır

            // Alert'teki "OK" düğmesine tıklayarak kapatın
            alert.accept(); // Bu, "OK" veya "Kabul Et" düğmesine basar

            System.out.println("Alert başarıyla kapatıldı.");

            // Alert kapatıldıktan sonra sayfadaki başka bir elementi kontrol edebilirsiniz
            // Örneğin: driver.findElement(By.id("elementAfterAlert")).isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Tarayıcıyı kapatın
            //driver.quit();
        }
    }
    @Test(priority = 3)
    public void afterFiveSecondsTest() throws InterruptedException {
        alertsPage.getAfterFiveSeconds().click();
        try {
            // demoqa.com/alerts adresine gidin

            // Alert'in görünmesini bekleyin (maksimum 10 saniye)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());

            // Alert'e geçiş yapın
            Alert alert = driver.switchTo().alert();

            // Alert kutusunun metnini alın (isteğe bağlı, doğrulama için)
            String alertMessage = alert.getText();
            System.out.println("Alert Mesajı: " + alertMessage); // Konsola "Alert Mesajı: demoqa.com says You clicked a button" yazacaktır

            Thread.sleep(2000);
            // Alert'teki "OK" düğmesine tıklayarak kapatın
            alert.accept(); // Bu, "OK" veya "Kabul Et" düğmesine basar

            System.out.println("Alert başarıyla kapatıldı.");

            // Alert kapatıldıktan sonra sayfadaki başka bir elementi kontrol edebilirsiniz
            // Örneğin: driver.findElement(By.id("elementAfterAlert")).isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Tarayıcıyı kapatın
            //driver.quit();
        }
    }
    @Test(priority = 4)
    public void confirmBoxTest() throws InterruptedException {
        alertsPage.getConfirmBox().click();
        try {
            // demoqa.com/alerts adresine gidin

            // Alert'in görünmesini bekleyin (maksimum 10 saniye)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());

            // Alert'e geçiş yapın
            Alert alert = driver.switchTo().alert();

            // Alert kutusunun metnini alın (isteğe bağlı, doğrulama için)
            String alertMessage = alert.getText();
            System.out.println("Alert Mesajı: " + alertMessage); // Konsola "Alert Mesajı: demoqa.com says You clicked a button" yazacaktır

            Thread.sleep(2000);
            // Alert'teki "OK" düğmesine tıklayarak kapatın
            alert.dismiss(); // Bu, "OK" veya "Kabul Et" düğmesine basar
            //alert.accept();

            System.out.println("Alert başarıyla kapatıldı.");

            // Alert kapatıldıktan sonra sayfadaki başka bir elementi kontrol edebilirsiniz
            // Örneğin: driver.findElement(By.id("elementAfterAlert")).isDisplayed();
            Assert.assertTrue(alertsPage.getConfirmBoxAppear().getText()
                    .equalsIgnoreCase("You selected Cancel"));
            System.out.println(alertsPage.getConfirmBoxAppear().getText());
            Assert.assertTrue(alertsPage.getConfirmBoxAppear().isDisplayed());
            System.out.println(alertsPage.getConfirmBoxAppear().isDisplayed());
            alertsPage.getConfirmBox().click();
            alert.accept();
            Assert.assertTrue(alertsPage.getConfirmBoxAppear().getText()
                    .equalsIgnoreCase("You selected Ok"));
            System.out.println(alertsPage.getConfirmBoxAppear().getText());
            Assert.assertTrue(alertsPage.getConfirmBoxAppear().isDisplayed());
            System.out.println(alertsPage.getConfirmBoxAppear().isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Tarayıcıyı kapatın
            //driver.quit();
        }
    }
    @Test(priority = 5)
    public void promptBoxTest() throws InterruptedException {
        alertsPage.getPromptBox().click();
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());
            //Thread.sleep(3000);
            Alert promptAlert = driver.switchTo().alert();
//            promptAlert.accept();
//            alertsPage.getPromptBox().click();
            promptAlert.sendKeys("Ada");Thread.sleep(2000);
            promptAlert.accept();
            System.out.println("acaba burda : "+alertsPage.getPromptBoxAppear().getText());
            Assert.assertTrue(alertsPage.getPromptBoxAppear().getText()
                    .equalsIgnoreCase("You entered Ada"));
            //alert.dismiss();
            promptAlert.accept();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Tarayıcıyı kapatın
            //driver.quit();
        }
    }
}
