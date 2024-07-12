package org.cb.ta.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Queue;

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
    @FindBy(xpath = "//*[@id=\"userName\"]")
    private WebElement fullName;
    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    private WebElement email;
    @FindBy(xpath = "//*[@id=\"currentAddress\"]")
    private WebElement currentAddress;
    @FindBy(xpath = "//*[@id=\"permanentAddress\"]")
    private WebElement permanentAddress;
    @FindBy(xpath = "//*[@id='submit']")
    private WebElement submit;
    @FindBy(xpath = "<div class=\"border col-md-12 col-sm-12\"><p id=\"name\" class=\"mb-1\">Name:hami mandıralı</p><p id=\"email\" class=\"mb-1\">Email:ha@gmail.com</p><p id=\"currentAddress\" class=\"mb-1\">Current Address :hatay, turkıye </p><p id=\"permanentAddress\" class=\"mb-1\">Permananet Address :hatay, turkıye</p></div>")
    private WebElement submitControlTest;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement textBoxTextVerify;
    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement eMailTextVerify;
    @FindBy(xpath = "//p[@id='currentAddress']")
    private WebElement currentAddressTextVerify;
    @FindBy(xpath = "//p[@id=\"permanentAddress\"]")
    private WebElement permenantAddressTextVerify;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement nameControl;
    @FindBy(xpath = "(//*[@id='item-1']/span)[1]")
    private WebElement checkBox;
    @FindBy(xpath = "//*[@id='userName-label']")
    private WebElement fullNameText;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/h1")
    private WebElement checkBoxText;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/div/button[1]")
    private WebElement plusButton;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/div/button[2]")
    private WebElement minesButton;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/label/span[3]")
    private WebElement checkBoxHomeBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/button")
    private WebElement checkBoxHomeArrow;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]")
    private WebElement checkBoxDesktopBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")
    private WebElement checkBoxDesktopArrow;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[3]")
    private WebElement checkBoxNotes;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[3]")
    private WebElement checkBoxCommands;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button")
    private WebElement checkBoxDocumentsArrow;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]")
    private WebElement checkBoxDocumentsBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button")
    private WebElement checkBoxWorkspacesArrow;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]")
    private WebElement checkBoxWorkspacesBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[3]")
    private WebElement checkBoxReactBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label/span[3]")
    private WebElement checkBoxAngularBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button")
    private WebElement checkBoxOfficeArrow;
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
