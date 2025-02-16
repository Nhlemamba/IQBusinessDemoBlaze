package Steps;

import Pages.CartPage;
import Pages.HomePage;
import Pages.IndexPage;
import Utilities.BrowserFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class StepsDefinition {
    WebDriver driver;
    BrowserFactory browserFactory = new BrowserFactory();

    IndexPage indexPage;
    HomePage homePage;
    CartPage cartPage;

    @Given("I am on the demoblaze landing page")
    public void i_am_on_the_demoblaze_landing_page() {
        driver = browserFactory.startApp("chrome", "https://www.demoblaze.com/");
        indexPage = new IndexPage(driver);

    }
    @Given("I click on the Sign up option")
    public void i_click_on_the_sign_up_option() {
        indexPage.clickSignUp();

    }
    @Given("I enter the username (.*)$")
    public void i_enter_the_username(String username) {
        indexPage.enterUserName(username);

    }
    @Given("I enter the password (.*)$")
    public void i_enter_the_password(String password) {
        indexPage.enterPassword(password);

    }
    @When("I click the Sign up button")
    public void i_click_the_sign_up_button() throws InterruptedException {
        Thread.sleep(6000);
        indexPage.clickSignUpButton();

    }
    @Then("a confirmation message should appear in a pop-up")
    public void a_confirmation_message_should_appear_in_a_pop_up() {
        indexPage.verifySignUpPopUp();

    }
    @When("I click login")
    public void i_click_login() {
       indexPage.clickLogin();
    }
    @And("^I log in with username (.+) and password (.+)$")
    public void i_log_in_with_username_and_password(String username,String password) {
        indexPage.enterLoginUserName(username);
        indexPage.enterLoginPassword(password);
        indexPage.clickLoginButton();

    }

    @Then("I should see the homepage")
    public void i_should_see_the_homepage() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.confirmHomePageLoaded();


    }
    @And("I add an Asus Monitor to the cart")
    public void i_add_an_asus_monitor_to_the_cart() throws InterruptedException {
        Thread.sleep(3000);
        homePage.clickMonitorsLink();
        homePage.clickAsus();
        homePage.clickAddToCart();
        homePage.addedToCartPopUp();

    }
    @And("I add a Nexus phone to the cart")
    public void i_add_a_nexus_phone_to_the_cart() throws InterruptedException {
        homePage.clickHomeLink();
        homePage.clickNexusPhone();
        homePage.clickAddToCart();
        homePage.addedToCartPopUp();
// adding the second phone
        homePage.clickAddToCart();
        homePage.addedToCartPopUp();

    }
    @And("I open the cart page")
    public void i_open_the_cart_page() {
        cartPage = new CartPage(driver);
        cartPage.cartPageLink();


    }
    @Then("all items should be displayed in the cart")
    public void all_items_should_be_displayed_in_the_cart() {
        cartPage.numberOfItemsOnCart();

    }
    @And("the total amount should be visible")
    public void the_total_amount_should_be_visible() {
        cartPage.totalAmountOfItemsInCart();

    }



}
