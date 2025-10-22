package org.cb.ta.pages.alerts_frame_windowsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ModalDialogsPage extends BasePage {
    public ModalDialogsPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }

    @FindBy(xpath = "(//li[@id=\"item-4\"])[2]")
    private WebElement modalDialogs;
    @FindBy(xpath = "//h1[@class=\"text-center\"]")
    private WebElement modalDialogsText;
}
