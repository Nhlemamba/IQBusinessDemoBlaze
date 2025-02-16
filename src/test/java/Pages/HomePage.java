package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

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

    @FindBy(xpath = "//a[@id='cartur']")
    WebElement cartLink_xpath;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public void confirmHomePageLoaded(){
        homePageConfirmation_xpath.getText();

    }


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
    public void addPhonesToCart(){
        addToCart_xpath.click();
    }


}
