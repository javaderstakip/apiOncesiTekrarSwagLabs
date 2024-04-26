package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello world!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

// Yeni bir sekme açın
        driver.switchTo().newWindow(WindowType.TAB);

// Yeni sekmeye geçin
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

// Yeni sekmede bir URL'ye gidin
        driver.get("https://www.google.com");//Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String originalWindow = driver.getWindowHandles().toArray()[0].toString();
        driver.switchTo().window(originalWindow);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.close();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.quit();
    }
}