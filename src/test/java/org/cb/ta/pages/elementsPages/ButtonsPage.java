package org.cb.ta.pages.elementsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ButtonsPage extends BasePage {
    public ButtonsPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }

    @FindBy(xpath = "//*[@id='app']/header/a/img")
    private WebElement homePageButton;
    @FindBy(xpath = "//h1[@class='text-center']")
    private WebElement buttonsText;
    @FindBy(xpath = "//button[@id='doubleClickBtn']")
    private WebElement buttonsDoubleClickLocator;
    @FindBy(xpath = "//p[@id='doubleClickMessage']")
    private WebElement youHaveDoneDoubleClickText;
}
