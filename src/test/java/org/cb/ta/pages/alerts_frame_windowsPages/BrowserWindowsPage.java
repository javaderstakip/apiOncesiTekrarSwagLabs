package org.cb.ta.pages.alerts_frame_windowsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class BrowserWindowsPage extends BasePage {
    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }

    public void navigate(){
        driver.get(baseUrl);
    }

    @FindBy(xpath = "(//div[@class=\"card mt-4 top-card\"])[3]")
    private WebElement alertsFrameWindows;
    @FindBy(xpath = "(//div[@class=\"header-text\"])[3]")
    private WebElement alertsFrameWindows2;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/span/div/div[1]/span")
    private WebElement alertsFrameWindows3;
    @FindBy(xpath = "(//*[@id=\"item-0\"]/span)[3]")
    private WebElement browserWindows;
    @FindBy(xpath = "//h1[@class=\"text-center\"]")
    private WebElement browserWindowsText;
    @FindBy(xpath = "//button[@id=\"tabButton\"]")
    private WebElement newTab;
    @FindBy(xpath = "//h1[@id=\"sampleHeading\"]")
    private WebElement sampleText;
    @FindBy(xpath = "//button[@id=\"windowButton\"]")
    private WebElement newWindow;

}
