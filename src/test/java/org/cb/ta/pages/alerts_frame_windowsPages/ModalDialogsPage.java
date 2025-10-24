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
    @FindBy(xpath = "//div[contains(text(),'Click on')]")
    private WebElement clickOnButtonText;
    @FindBy(xpath = "//button[@id=\"showSmallModal\"]")
    private WebElement smallModalButton;
    @FindBy(xpath = "//div[@class=\"modal-title h4\"]")
    private WebElement smallModalWindow;
    @FindBy(xpath = "//button[@id=\"closeSmallModal\"]")
    private WebElement smallModalCloseButton;
    @FindBy(xpath = "//button[@class=\"close\"]")
    private WebElement smallModelHiddenButton;
    @FindBy(xpath = "//div[@class=\"modal-body\"]")
    private WebElement smallModalWindowText;
    @FindBy(xpath = "//button[@id=\"showLargeModal\"]")
    private WebElement largeModelButton;
    @FindBy(xpath = "//button[@id=\"closeLargeModal\"]")
    private WebElement largeModalCloseButton;
    @FindBy(xpath = "//div[@id=\"example-modal-sizes-title-lg\"]")
    private WebElement largeModalWindow;
    @FindBy(xpath = "//div[@class=\"modal-body\"]")
    private WebElement largeModalWindowText;
}
