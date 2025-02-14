package org.cb.ta.pages.elementsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DynamicPropertiesPage extends BasePage {
    public DynamicPropertiesPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }
    @FindBy(xpath = "//h1[@class='text-center']")
    private WebElement dynamicPropertiesText;
    @FindBy(xpath = "//p[text()='This text has random Id']")
    private WebElement randomIpText;
    @FindBy(xpath = "//button [@id=\"enableAfter\"]")
    private WebElement willEnable5Seconds;
    @FindBy(xpath = "//button [@id=\"colorChange\"]")
    private WebElement colorChangeButton;
    @FindBy(xpath = "//button [@id=\"visibleAfter\"]")
    private WebElement visibleAfter;
    @FindBy(xpath = "//*[contains(text(),'Visible After')]")
    private WebElement visibleAfter5Seconds;
}
