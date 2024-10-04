package org.cb.ta.pages.elementsPages;

import org.cb.ta.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage {
    public RadioButtonPage(WebDriver driver) {
        super(driver);
        this.baseUrl = "https://demoqa.com/";
    }
    public void navigate(){
        driver.get(baseUrl);
    }


}
