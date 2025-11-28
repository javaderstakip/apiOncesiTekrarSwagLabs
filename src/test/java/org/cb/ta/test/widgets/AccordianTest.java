package org.cb.ta.test.widgets;

import org.cb.ta.pages.ElementsPage;
import org.cb.ta.pages.HomePage;
import org.cb.ta.pages.widgets.AccordianPage;
import org.cb.ta.test.common.BaseTest;
import org.junit.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class AccordianTest extends BaseTest {
    ElementsPage elementsPage = new ElementsPage(driver);
    HomePage homePage = new HomePage(driver);
    AccordianPage accordianPage = new AccordianPage(driver);

    @BeforeClass
    public void beforeTest() throws InterruptedException {
        elementsPage.getHomePageButton().click();//Thread.sleep(1000);
        homePage.getWidgetButton().click();
        accordianPage.getAccordianButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public void afterTest() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //driver.quit();
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        System.out.println("Test basladi.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
        //Thread.sleep(2000);
        //driver.get("https://demoqa.com/upload-download");
        // Pencere "handle"larını al
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        System.out.println("Test calisti.");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        elementsPage.getHomePageButton().click();
//        elementsPage.getElementsButton().click();
//        elementsPage.getLinks().click();
//        Thread.sleep(2000);
//        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());

//        List<String> windowHandles = new ArrayList<>();
//        for (String handle : driver.getWindowHandles()) {
//            if (!handle.equals(driver.getWindowHandle())) {
//                windowHandles.add(handle);
//            }
//        }
//        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
    }
    @Test(priority = 1)
    public void accordianPageBeginningTest(){
        assertTrue(driver.getCurrentUrl()
                .equalsIgnoreCase("https://demoqa.com/accordian"));
        System.out.println("su an hangi linkteyiz? " + driver.getCurrentUrl());
        Assert.assertTrue(accordianPage.getAccordianText().isDisplayed());
        Assert.assertTrue(accordianPage.getAccordianText().getText()
                .equalsIgnoreCase("Accordian"));
        System.out.println("ne yazıyor text te: " + accordianPage.getAccordianText().getText());
    }
    @Test(priority = 2)
    public void loremIpsumTest(){
        accordianPage.getWhatIsLorem().click();
        accordianPage.getWhatIsLorem().click();
        System.out.println("ne yazıyor burda: " + accordianPage.getWhatIsLorem().getText());
        System.out.println("ne yazıyor burda 2: " + accordianPage.getLoremIpsumText().getText());
        assertTrue(accordianPage.getWhatIsLorem().isDisplayed());
        assertTrue(accordianPage.getLoremIpsumText().getText()
                .equalsIgnoreCase("Lorem Ipsum is simply dummy text of the printing " +
                        "and typesetting industry. Lorem Ipsum has been the industry's standard " +
                        "dummy text ever since the 1500s, when an unknown printer took a galley " +
                        "of type and scrambled it to make a type specimen book. It has survived " +
                        "not only five centuries, but also the leap into electronic typesetting, " +
                        "remaining essentially unchanged. It was popularised in the 1960s with " +
                        "the release of Letraset sheets containing Lorem Ipsum passages, and " +
                        "more recently with desktop publishing software like Aldus PageMaker " +
                        "including versions of Lorem Ipsum."));
        accordianPage.getWhatIsLorem().click();
    }
    @Test(priority = 3)
    public void comeFromTest(){
        accordianPage.getWhereDoesIt().click();
        System.out.println("burada ne yazıyor 2 : " + accordianPage.getWhereDoesIt().getText());
        assertTrue(accordianPage.getWhereDoesIt().isDisplayed());
        assertTrue(accordianPage.getWhereDoesIt().isEnabled());
        jsx.executeScript("window.scrollBy(0,200)");
        System.out.println("burada ne yazıyor: " + accordianPage.getComeFromText().getText());
        Assert.assertTrue(accordianPage.getComeFromText().getText().equalsIgnoreCase("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham."));
        accordianPage.getWhereDoesIt().click();
    }
    @Test(priority = 4)
    public void weUseItTest(){
        accordianPage.getWhyDoWe().click();
        System.out.println("burada ne yazıyor: " + accordianPage.getWeUseItText().getText());
        System.out.println("burada ne yazıyor 2 : " + accordianPage.getWhyDoWe().getText());
        assertTrue(accordianPage.getWhyDoWe().isDisplayed());
        assertTrue(accordianPage.getWhyDoWe().isEnabled());
        Assert.assertTrue(accordianPage.getWeUseItText().getText().equalsIgnoreCase("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)."));
        accordianPage.getWhyDoWe().click();
    }
}
