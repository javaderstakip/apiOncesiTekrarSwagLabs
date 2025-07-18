package org.cb.ta.pages.alerts_frame_windowsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }

    @FindBy(xpath = "(//li[@class=\"btn btn-light \"])[12]")//(//span[@class=\"text\"])[1]")
    private WebElement alerts;
    @FindBy(xpath = "(//div[@class=\"card mt-4 top-card\"])[3]")
    private WebElement alertsFrameWindows;
    @FindBy(xpath = "(//div[@class=\"header-text\"])[3]")
    private WebElement alertsFrameWindows2;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[3]/span/div/div[1]/span")
    private WebElement alertsFrameWindows3;
    @FindBy(xpath = "//button[@id=\"alertButton\"]")
    private WebElement toSeeAlert;
    @FindBy(xpath = "//button[@id=\"timerAlertButton\"]")
    private WebElement afterFiveSeconds;
    @FindBy(xpath = "//button[@id=\"confirmButton\"]")
    private WebElement confirmBox;
}
