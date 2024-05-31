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
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/h1")
    private WebElement checkBoxText;
    @FindBy(xpath = "//*[@id=\"item-2\"]/span")
    private WebElement radioButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div/div[2]/h1")
    private WebElement radioButtonText;
    @FindBy(xpath = "//*[@id=\"item-3\"]/span")
    private WebElement webTablesButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/h1")
    private WebElement webTablesText;
    @FindBy(xpath = "(//*[@id=\"item-4\"]/span)[1]")
    private WebElement buttons;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1")
    private WebElement buttonsText;
    @FindBy(xpath = "(//*[@id=\"item-5\"]/span)[1]")
    private WebElement links;
    @FindBy(xpath = "//*[@id=\"linkWrapper\"]/h1")
    private WebElement linksText;
    @FindBy(xpath = "(//*[@id=\"item-6\"])[1]")
    private WebElement brokenLinksImages;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1")
    private WebElement brokenLinksImagesText;
    @FindBy(xpath = "(//*[@id=\"item-7\"])[1]")
    private WebElement uploadAndDownload;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1")
    private WebElement uploadAndDownloadText;
    @FindBy(xpath = "(//*[@id=\"item-8\"])[1]")
    private WebElement dynamicProperties;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h1")
    private WebElement dynamicPropertiesText;
}
