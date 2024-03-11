package org.cb.ta.test.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        this.actions = new Actions(driver);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        webDriverWait.until(ExpectedConditions.urlToBe("https://www.toolsqa.com/selenium-training/"));
//        webDriverWait.until(ExpectedConditions.urlContains("param=value"));
//        webDriverWait.until(ExpectedConditions.urlContains("training"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //webDriverWait.until(ExpectedConditions.visibilityOf(element));
        //webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        jsx = (JavascriptExecutor) driver;
    }
}
