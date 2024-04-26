package org.cb.ta.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ElementsPage extends BasePage{

    public ElementsPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }

    @FindBy(xpath = "//*[@id='app']/header/a/img")
    private WebElement homePageButton;
    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
    private WebElement elementsButton;
    @FindBy(xpath = "(//*[@id='item-0']/span)[1]")
    private WebElement TextBox;
    @FindBy(xpath = "(//*[@id='item-1']/span)[1]")
    private WebElement checkBox;
    @FindBy(xpath = "//*[@id='userName-label']")
    private WebElement fullNameText;
}
