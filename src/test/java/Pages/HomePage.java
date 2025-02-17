package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

//The elements to be used or interacted with on this page
    @FindBy(xpath = "//*[@id='nameofuser']")
    WebElement homePageConfirmation_xpath;

    @FindBy(xpath = "//a[contains(.,'Monitors')]")
    WebElement monitors_xpath;

    @FindBy(xpath = "//a[contains(.,'ASUS Full HD')]")
    WebElement asusMonitor_xpath;

    @FindBy(xpath = "//a[contains(.,'Add to cart')]")
    WebElement addToCart_xpath;

    @FindBy(xpath = "//a[contains(.,'Home (current)')]")
    WebElement clickHome_xpath;

    @FindBy(xpath = "//a[contains(.,'Phones')]")
    WebElement phones_xpath;

    @FindBy(xpath = "//a[contains(.,'Nexus 6')]")
    WebElement nexusPhone_xpath;

//initialising the elements with the current object
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public void confirmHomePageLoaded(){
        System.out.println(homePageConfirmation_xpath.getText());
     //   Assert.assertEquals(homePageConfirmation_xpath.getText(), "welcomete2r1");

    }
// creating methods that can be used in the step definitions

    public void clickMonitorsLink(){
        monitors_xpath.click();
    }
    public void clickAsus(){
        asusMonitor_xpath.click();
    }
    public void clickAddToCart(){
        addToCart_xpath.click();
    }
    public void clickHomeLink(){
        clickHome_xpath.click();
    }
    public void clickPhonesLink(){
        phones_xpath.click();
    }
    public void clickNexusPhone(){
        nexusPhone_xpath.click();
    }
    public void addedToCartPopUp(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            Assert.assertTrue(alertText.contains("Product added"), "Product added.");

            alert.accept();

        } catch (TimeoutException e) {
            Assert.fail("Alert not displayed within timeout.");
        } catch (NoAlertPresentException e) {
            Assert.fail("No alert present.");
        }
    }


}
