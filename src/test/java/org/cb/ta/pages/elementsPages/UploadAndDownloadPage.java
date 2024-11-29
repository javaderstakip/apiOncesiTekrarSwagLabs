package org.cb.ta.pages.elementsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class UploadAndDownloadPage extends BasePage{
    public UploadAndDownloadPage (WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }
    @FindBy(xpath = "//h1[@class=\"text-center\"]")
    private WebElement uploadAndDownloadText;
    @FindBy(xpath = "//a[@id=\"downloadButton\"]")
    private WebElement downloadButton;
}
