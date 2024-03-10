package org.cb.ta.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait webDriverWait;
    protected JavascriptExecutor jsx;

    public BaseTest() {
        this.driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().minimize();
        driver.manage().deleteAllCookies();
        this.actions = new Actions(driver);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        jsx = (JavascriptExecutor) driver;
    }
}
