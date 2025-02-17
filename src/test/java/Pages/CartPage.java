package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//a[@class='nav-link'][contains(.,'Cart')]")
    WebElement cartPageLink_xpath;

    @FindBy(xpath = "(//a[@href='#'][contains(.,'Delete')])")
    List<WebElement> listItemsOnCart_xpath;

    @FindBy(xpath = "//h3[@id='totalp']")
    WebElement totalAmountOnCart_xpath;

    @FindBy(xpath = "//button[contains(.,'Place Order')]")
    WebElement placeOrderButton;

    //initialising the elements with the current object
    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void cartPageLink(){
        cartPageLink_xpath.click();
    }
    public void numberOfItemsOnCart(){
        int x = listItemsOnCart_xpath.size();

        System.out.println(listItemsOnCart_xpath.size() +" Items added");

    }
    public void totalAmountOfItemsInCart(){
        totalAmountOnCart_xpath.getText();
        System.out.println(totalAmountOnCart_xpath.getText());
        Assert.assertEquals(totalAmountOnCart_xpath.getText(),"1530");
    }
    public void placeOrder(){
        placeOrderButton.click();
    }




}
