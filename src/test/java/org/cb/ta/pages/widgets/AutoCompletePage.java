package org.cb.ta.pages.widgets;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AutoCompletePage extends BasePage {
    public AutoCompletePage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }

    @FindBy (xpath = "(//li[@id=\"item-1\"])[3]")
    private WebElement autoCompleteButton;
}
