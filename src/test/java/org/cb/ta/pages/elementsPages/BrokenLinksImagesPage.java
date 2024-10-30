package org.cb.ta.pages.elementsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class BrokenLinksImagesPage extends BasePage {
    public BrokenLinksImagesPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }

    @FindBy(xpath = "//h1[@class=\"text-center\"]")
    private WebElement BrokenLinksImagesText;
    @FindBy(xpath = "(//img[@src=\"/images/Toolsqa.jpg\"])[2]")
    private WebElement validImage;
    @FindBy(xpath = "//img[@src=\"/images/Toolsqa_1.jpg\"]")
    private WebElement brokenImage;

}
