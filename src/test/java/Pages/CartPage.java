package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//a[@class='nav-link'][contains(.,'Cart')]")
    WebElement cartPageLink_xpath;

    @FindBy(xpath = "(//a[@href='#'][contains(.,'Delete')])")
    WebElement listItemsOnCart_xpath;

    @FindBy(xpath = "//h3[@id='totalp']")
    WebElement totalAmountOnCart_xpath;

    @FindBy(xpath = "//button[contains(.,'Place Order')]")
    WebElement placeOrderButton;




}
