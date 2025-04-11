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
    @FindBy(xpath = "(//div[@class=\"col-md-4 col-sm-6\"])[1]")
    private WebElement firstNameId2;
    @FindBy(xpath = "//button[@id=\"submit\"]")
    private WebElement submitButton;
    @FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id=\"userEmail\"]")
    private WebElement eMail;
    @FindBy(xpath = "//input[@id=\"gender-radio-1\"]")
    private WebElement genderInputMale;
    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    private WebElement genderLabelMale;
    @FindBy(xpath = "//input[@id=\"gender-radio-2\"]")
    private WebElement genderInputFemale;
    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")
    private WebElement genderLabelFemale;
    @FindBy(xpath = "//input[@id=\"gender-radio-3\"]")
    private WebElement genderInputOther;
    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[3]/label")
    private WebElement genderLabelOther;
    @FindBy(xpath = "//input[@id=\"userNumber\"]")
    private WebElement mobileNumber;
    @FindBy(xpath = "//input[@id=\"dateOfBirthInput\"]")
    private WebElement dateOfBirth;
    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[9]")
    private WebElement september;
    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]")
    private WebElement yirmiUcuncuGun;
    @FindBy(xpath = "//option[@value=\"1980\"]")
    private WebElement binDokuzYuzSeksen;
    @FindBy(xpath = "//div[@id=\"subjectsContainer\"]")
    private WebElement subjects;
    @FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div")
    private WebElement subjects2;
    @FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div/div[1]/div[1]")
    private WebElement subjects3;
    @FindBy(xpath = "//div[@id=\"subjectsContainer\"]")
    private WebElement subjects4;
    @FindBy(xpath = "//*[@id=\"subjectsWrapper\"]/div[2]")
    private WebElement subjects5;
    @FindBy(xpath = "//*[@id=\"subjectsContainer\"]/div/div[2]")
    private WebElement subjects6;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
    private WebElement hobiesSports;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")
    private WebElement hobiesReading;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")
    private WebElement hobiesMusic;
    @FindBy(xpath = "//*[@id=\"uploadPicture\"]")
    private WebElement selectPicture;
//    @FindBy(xpath = "//*[@id=\"uploadPicture\"]")
//    private WebElement uploadPicture;
}
