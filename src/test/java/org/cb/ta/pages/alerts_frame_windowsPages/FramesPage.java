package org.cb.ta.pages.alerts_frame_windowsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }
    @FindBy(xpath = "(//li[@id=\"item-2\"])[1]")
    private WebElement frames;
    @FindBy(xpath = "(//span[@class=\"text\"])[1]")
    private WebElement frames2;
    @FindBy(xpath = "(//li[@class=\"btn btn-light \"])[13]")
    private WebElement frames3;
}
