package Steps;

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
//    @When("^I log in with username (.*) and password (.*)")
//    public void i_log_in_with_username_username_and_password_password(String username,String password) {
//        indexPage.enterLoginUserName(username);
//        indexPage.enterLoginPassword(password);
//        indexPage.clickLoginButton();
//
//    }
    @Then("I should see the homepage")
    public void i_should_see_the_homepage() {


    }
    @And("I add an Asus Monitor to the cart")
    public void i_add_an_asus_monitor_to_the_cart() {

    }
    @And("I add a Nexus phone to the cart")
    public void i_add_a_nexus_phone_to_the_cart() {

    }
    @And("I open the cart page")
    public void i_open_the_cart_page() {

    }
    @Then("both items should be displayed in the cart")
    public void both_items_should_be_displayed_in_the_cart() {

    }
    @And("the total amount should be visible")
    public void the_total_amount_should_be_visible() {

    }



}
