package Steps;

import Pages.IndexPage;
import Utilities.BrowserFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class StepsDefinition {
    WebDriver driver;
    BrowserFactory browserFactory = new BrowserFactory();

    IndexPage indexPage;


//    @Given("I am on the demoblaze landing page")
//    public void i_am_on_the_demoblaze_landing_page() {
//        driver = browserFactory.startApp("chrome", "https://www.demoblaze.com/");
//        indexPage = new IndexPage(driver);
//    }
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


}
