package org.cb.ta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import lombok.Getter;

@Getter
public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }

    @FindBy(xpath = "//*[@id='app']/header/a/img")
    private WebElement homePageButton;
    @FindBy(xpath = "(//p[@class='fc-button-label'])[1]")
    private WebElement consenttouseyourdata;
    @FindBy(xpath = "//img[@class='banner-image']")
    private WebElement joinNowButton;
    //@FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")
    private WebElement elementsButton;
    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[2]")
    private WebElement formsButton;
    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[3]")
    private WebElement alertFrameWindowsButton;
    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[4]")
    private WebElement widgetButton;
    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[5]")
    private WebElement interactionsButton;
    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[6]")
    private WebElement bookStoreAplicationButton;


}
