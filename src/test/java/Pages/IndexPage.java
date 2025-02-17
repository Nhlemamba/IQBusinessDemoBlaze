package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;

public class IndexPage {

    WebDriver driver;
    @FindBy(xpath = "//a[@id='signin2']")
    WebElement signUp_xpath;

    @FindBy(xpath = "//input[@id='sign-username']")
    WebElement username_xpath;

    @FindBy(xpath = "//input[@id='sign-password']")
    WebElement password_xpath;

    @FindBy(xpath = "//button[@type='button'][contains(.,'Sign up')]")
    WebElement signUpButton_xpath;

    @FindBy(xpath = "//a[@id='login2']")
    WebElement login_xpath;

    @FindBy(xpath = "//input[@id='loginusername']")
    WebElement loginUsername;

    @FindBy(xpath = "//input[@id='loginpassword']")
    WebElement loginPassword;

    @FindBy(xpath = "//button[contains(.,'Log in')]")
    WebElement loginButton;

    //initialising the elements with the current object
    public IndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickSignUp() {
        signUp_xpath.click();
    }

    public void enterUserName(String username) {
        username_xpath.sendKeys(username);
    }

    public void enterPassword(String password) {
        password_xpath.sendKeys(password);
    }

    public void clickSignUpButton() {
        signUpButton_xpath.click();
    }

    //waiting for the pop up and asserting the message

    public void verifySignUpPopUp() {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();
            Assert.assertTrue(alertText.contains("Sign up successful"), "Sign up successful.");

            alert.accept();

        } catch (TimeoutException e) {
            Assert.fail("Alert not displayed within timeout.");
        } catch (NoAlertPresentException e) {
            Assert.fail("No alert present.");
        }


    }


    public void clickLogin() {
        login_xpath.click();
    }

    public void enterLoginUserName(String username) {
        loginUsername.sendKeys(username);
    }

    public void enterLoginPassword(String password) {
        loginPassword.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }


}
