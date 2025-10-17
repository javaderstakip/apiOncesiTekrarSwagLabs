package org.cb.ta.pages.alerts_frame_windowsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class NestedFramesPage extends BasePage{
    public NestedFramesPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }

    @FindBy(xpath = "(//li[@class=\"btn btn-light \"])[14]")
    private WebElement nestedFrames;
    @FindBy(xpath = "//h1[@class=\"text-center\"]")
    private WebElement nestedFramesText;
    @FindBy(xpath = "(//div[@id=\"framesWrapper\"]/div)[1]")
    private WebElement sampleNestedIframepageText;
    @FindBy(xpath = "//iframe[@id=\"frame1\"]")
    private WebElement frameOne;
    @FindBy(xpath = "//div[@id=\"frame1Wrapper\"]/iframe")
    private WebElement parentFrame;
    @FindBy(tagName=("iframe"))
    private WebElement childFrame;
}
