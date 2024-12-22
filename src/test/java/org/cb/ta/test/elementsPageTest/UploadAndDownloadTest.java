package org.cb.ta.test.elementsPageTest;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.elementsPages.BrokenLinksImagesPage;
import org.cb.ta.pages.elementsPages.LinksPage;
import org.cb.ta.pages.elementsPages.UploadAndDownloadPage;
import org.cb.ta.test.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class UploadAndDownloadTest extends BaseTest{
    ElementsPage elementsPage = new ElementsPage(driver);
    UploadAndDownloadPage uploadAndDownloadPage = new UploadAndDownloadPage(driver);
    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getElementsButton().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        elementsPage.getUploadAndDownload().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public void afterTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
//        Thread.sleep(2000);
//        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        //driver.get("https://demoqa.com/upload-download");
    }
    @Test(priority = 1)
    public void uploadAndDownloadBeginingTest(){
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demoqa.com/upload-download"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(uploadAndDownloadPage.getUploadAndDownloadText().getText()
                .equalsIgnoreCase("Upload and Download"));
        System.out.println("text kisminda ne yaziyor: "+ uploadAndDownloadPage
                .getUploadAndDownloadText().getText());
        Assert.assertTrue(uploadAndDownloadPage.getUploadAndDownloadText().isDisplayed());
    }
    @Test(priority = 2)
    public void downloadButtonTest(){
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory", "\"C:\\Users\\Msi\\Downloads\"");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        WebDriver driver = new ChromeDriver(options);
        // İndirme işleminin tamamlanmasını bekle (örneğin, belirli bir süre veya bir koşul gerçekleşene kadar)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingIndicator")));
        uploadAndDownloadPage.getDownloadButton().click();
        // İndirme işleminin tamamlanmasını bekle (örneğin, belirli bir süre veya bir koşul gerçekleşene kadar)
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingIndicator")));
    }
    @Test(priority = 3)
    public void downLoadTest() {
        // ... diğer test kodları ...

        String downloadPath = "C:/Users/Msi/Downloads";
        String expectedFileName = "sampleFile (9).jpeg";

        if (isFileDownloaded(downloadPath, expectedFileName)) {
            System.out.println("Dosya başarıyla indirildi!");
        } else {
            System.out.println("Dosya indirme başarısız.");
        }
    }

    public static boolean isFileDownloaded(String downloadPath, String fileName) {
        //Not: bu method dosya adının tam olarak doğru olup olmadığını kontrol eder.
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (File file : dirContents) {
            if (file.getName().equals(fileName)) {
                return true; // Dosya bulundu
            }
        }
        return false; // Dosya bulunamadı
    }
    public boolean isFileDownloadedPartial(String downloadDir, String fileNameStartsWith) {
        //Not: bu method dosya adının istenen kısma kadarki bölümünü kontrol eder. yani dinamik kontrol yapar.
            File dir = new File(downloadDir);
        File[] dirContents = dir.listFiles();

        for (File file : dirContents) {
            if (file.getName().startsWith(fileNameStartsWith)) {
                return true;
            }
        }
        return false;
    }
    @Test(priority = 4)
    public void selectFileTest(){
        //uploadAndDownloadPage.getSelectAFile().click();

        String uploadPath = "C:/Users/Msi/Downloads/sampleFile (8).jpeg";
        String expectedFileName = "sampleFile (9).jpeg";

        //uploadAndDownloadPage.getSelectAFile().sendKeys(uploadPath);//farklı bir yöntemle test etmek için sanırım, daha ne olduğunu bulamadık.
        uploadAndDownloadPage.getChooseFile().sendKeys(uploadPath);//Choosefile butonuyla upload testi yapıyor.
    }
    @Test(priority = 5)
    public void chooseFileTest(){
        uploadAndDownloadPage.getChooseFile().click();
    }
}
