package org.cb.ta.pages.elementsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LinksPage extends BasePage {
    public LinksPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }

    @FindBy(xpath = "(//span[@class='text'])[6]")
    private WebElement links;
    @FindBy(xpath = "//h1[@class='text-center']")
    private WebElement linksText;
    @FindBy(xpath = "//*[@id=\"linkWrapper\"]/h5[1]/strong")
    private WebElement newTabText;
    @FindBy(xpath = "//a[@id='simpleLink']")
    private WebElement linksHome;
    @FindBy(xpath = "//a[@id='dynamicLink']")
    private WebElement linksHomeeja8R;
}
