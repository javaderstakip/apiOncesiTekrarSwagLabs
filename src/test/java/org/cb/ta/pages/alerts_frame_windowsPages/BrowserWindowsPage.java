package org.cb.ta.pages.alerts_frame_windowsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
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

    @FindBy(xpath = "(//div[@class=\"header-text\"])[3]")
    private WebDriver alertsFrameWindows;

}
