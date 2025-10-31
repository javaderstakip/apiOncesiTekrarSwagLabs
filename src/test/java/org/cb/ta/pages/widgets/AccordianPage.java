package org.cb.ta.pages.widgets;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AccordianPage extends BasePage {
    public AccordianPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }
    @FindBy(xpath = "(//li[@id=\"item-0\"])[4]")
    private WebElement accordianButton;
}
