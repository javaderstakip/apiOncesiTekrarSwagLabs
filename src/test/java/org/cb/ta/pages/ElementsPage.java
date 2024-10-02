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
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span/label/span[1]")
    private WebElement checkBoxVeuBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/button")
    private WebElement checkBoxOfficeArrow;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label/span[2]")
    private WebElement checkBoxOfficeBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span/label/span[3]")
    private WebElement checkBoxPublicBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[2]/span/label/span[1]")
    private WebElement checkBoxPrivateBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[3]/span/label/span[1]")
    private WebElement checkBoxClassifiedBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/ol/li[4]/span/label/span[1]")
    private WebElement checkBoxGeneralBox;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button")
    private WebElement checkBoxDownloadsArrow;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]")
    private WebElement checkBoxDownloadsBox;
    @FindBy(xpath = "//span[contains(text(),'downloads')]")
    private WebElement checkBoxDownloadsText;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]")
    private WebElement checkBoxWordFileBox;
    @FindBy(xpath = "//span[contains(text(),'wordFile')]")
    private WebElement checkBoxWordFileText;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]")
    private WebElement checkBoxExcelFileBox;
    @FindBy(xpath = "//span[contains(text(),'excelFile')]")
    private WebElement checkBoxExcelFileText;
    @FindBy(xpath = "//*[@id=\"result\"]/span[11]")
    private WebElement checkBoxExcelFileTextLocator;
    @FindBy(xpath = "//*[@id=\"item-2\"]/span")
    private WebElement radioButton;
    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div/div[2]/h1")
    private WebElement radioButtonText;
    @FindBy(xpath = "(//label[@class='custom-control-label'])[1]")
    private WebElement radioButtonYes;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/p/span")
    private WebElement radioButtonYesText;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/label")
    private WebElement radioButtonImpressive;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/p/span")
    private WebElement radioButtonImpressiveText;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[4]")
    private WebElement radioButtonNo;
    @FindBy(xpath = "//*[@id=\"item-3\"]/span")
    private WebElement webTablesButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/h1")
    private WebElement webTablesText;
    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    private WebElement webTablesAdd;
    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/button/span[1]")
    private WebElement webTablesRegistrationFormX;
    @FindBy(xpath = "//div[@id='registration-form-modal']")
    private WebElement webTablesRegistrationForm;
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement webTablesRegistrationFormFirstName2;
    @FindBy(xpath = "//*[@id=\"firstName-wrapper\"]/div[2]")
    private WebElement webTablesRegistrationFormFirstName;
    @FindBy(xpath = "//*[@id=\"firstName-label\"]")
    private WebElement webTablesRegistrationFormFirstNameText;
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement webTablesRegistrationFormLastName;
    @FindBy (xpath = "//input[@id='userEmail']")
    private WebElement webTablesRegistrationFormEmail;
    @FindBy(xpath = "//input[@id='age']")
    private WebElement webTablesRegistrationFormAge;
    @FindBy(xpath = "//input[@id='salary']")
    private WebElement webTablesRegistrationFormSalary;
    @FindBy(xpath = "//input[@id='department']")
    private WebElement webTablesRegistrationFormDepartment;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement webTablesRegistrationFormSubmit;
    @FindBy(xpath = "//input[@id=\"searchBox\"]")
    private WebElement webTablesTypeToSearch;
    @FindBy(xpath = "//span[@id='edit-record-4']")
    private WebElement webTablesActionEditFirst;
    @FindBy(xpath = "//*[@id=\"delete-record-4\"]")
    private WebElement webTablesActionDelete;
    @FindBy(xpath = "//*[contains(text(),'Tahir')]")
    private WebElement webTablesActionDeleteIsDisplayedTahir;
    @FindBy (xpath = "//*[@id=\"delete-record-6\"]")
    private WebElement webTablesActionDelete2;
    @FindBy(xpath = "//*[contains(text(),'Oya')]")
    private WebElement webTablesActionDeleteIsDisplayedOya;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[2]/select")
    private WebElement webTablesRows;
    @FindBy(xpath = "(//div[@class='rt-td'])[1]")
    private WebElement webTablesCellFirst;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[2]/select/option[1]")
    private WebElement webTablesRowsFive;
    @FindBy(xpath = "//option[@value='10']")
    private WebElement webTablesRowsTen;
    @FindBy(xpath = "(//div[@class='rt-td'])[15]")
    private WebElement webTablesCellFifteen;
    @FindBy(xpath = "(//div[@class='rt-td'])[22]")
    private WebElement webTablesRowsFour;
    @FindBy(xpath = "(//div[@class='rt-td'])[57]")
    private WebElement webTablesRowsNineFirstName;
    @FindBy(xpath = "(//div[@class='rt-td'])[6]")
    private WebElement webTablesRowsFirstDepartmant;
    @FindBy(xpath = "(//div[@class='rt-td'])[2]")
    private WebElement webTablesRowsFirstLastName;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/button")
    private WebElement webTablesNext;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/button")
    private WebElement webTablesPrevious;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[1]/span")
    private WebElement webTablesTotalPages;
    @FindBy(xpath = "//span[@class='-pageInfo']//input[@type='number']")
    private WebElement webTablesPage;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[1]/div")
    private WebElement webTablesPage2;
    @FindBy(xpath = "//input[@value='2']")
    private WebElement webTablesPage3;
    @FindBy(xpath = "//*[@type='number']")
    private WebElement webTablesPage4;
    @FindBy(xpath = "//div[@class='-pageJump']")
    private WebElement webTablesPage5;
    @FindBy(xpath = "(//div[@class='rt-resizer'])[3]")
    private WebElement webTablesRtResizer;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]/div[2]")
    private WebElement webTablesRtResizer2;
    @FindBy(xpath = "//div[@class='rt-table']")
    private WebElement webTablesRole;
    @FindBy(xpath = "//div[@role='grid']")
    private WebElement WebTablesRole2;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[1]/div")
    private WebElement webTablesPages;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/div[2]/div/div")
    private WebElement webTablesSearch;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[1]/div[1]")
    private WebElement webTablesFirstName;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[1]")
    private WebElement webTablesLastName;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[3]/div[1]")
    private WebElement webTablesAge;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[4]/div[1]")
    private WebElement webTablesEmail2;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[4]")
    private WebElement webTablesEmail;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[5]/div[1]")
    private WebElement webTablesSalary;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[6]/div[1]")
    private WebElement webTablesDepartment;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div[7]/div[1]")
    private WebElement webTablesAction;

    @FindBy(xpath = "(//div[@class='rt-td'])[1]")
    private WebElement webTablesFirstRows;
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
