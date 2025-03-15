package org.cb.ta.pages.formsPages;

import lombok.Getter;
import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class PracticeFormPage extends BasePage{

    public PracticeFormPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }
    @FindBy(xpath = "(//div[@class=\"card mt-4 top-card\"])[2]")
    private WebElement forms;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[2]/div")
    private WebElement practiceForm;
    @FindBy(xpath = "//h1[@class=\"text-center\"]")
    private WebElement practiceFormText;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/h5")
    private WebElement studentRegistrationFormText;
    @FindBy(xpath = "//input[@placeholder=\"First Name\"]")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id=\"firstName\"]")
    private WebElement firstNameId;
    @FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
    private WebElement lastName;
}
