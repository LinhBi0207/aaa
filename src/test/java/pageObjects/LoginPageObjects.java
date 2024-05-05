package pageObjects;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageUI.LoginPageUI;


public class LoginPageObjects extends AbstractPage {
    WebDriver driver;
    public LoginPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToLoginBtn() {
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
    }


    public void verifyEmailErrorMessage() {

        isControlDisplayed(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
    }

    public void inputEmail(String email) {

        sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
    }

    public void inputPassword(String password) {

        sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
    }

    public void verifyLoginWasUnsuccessfullMessage(String expected) {
        boolean errormessage = isControlDisplayed(driver, LoginPageUI.LOGIN_WAS_UNSUCCESSFULL_MESSAGE);
        Assert.assertTrue(errormessage);
        String actual = getTextElement(driver, LoginPageUI.LOGIN_WAS_UNSUCCESSFULL_MESSAGE);
        Assert.assertEquals(actual, expected);
   }

    }



