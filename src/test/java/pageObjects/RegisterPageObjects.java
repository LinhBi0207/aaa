package pageObjects;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageUI.RegisterPageUI;

public class RegisterPageObjects extends AbstractPage {
    WebDriver driver;
    public RegisterPageObjects(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToRegisterButton() {
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    public void firstNameErrorMessage(String expected) {
        boolean firstnameerrormessage =  isControlDisplayed(driver, RegisterPageUI.FIRSTNAME_ERROR_MESSAGE);
        Assert.assertTrue(firstnameerrormessage);
        String actual = getTextElement(driver, RegisterPageUI.FIRSTNAME_ERROR_MESSAGE);
        Assert.assertEquals(actual, expected);
    }
    public void lastNameErrorMessage(String expected) {
       boolean lastnameerrormessage = isControlDisplayed(driver, RegisterPageUI.LASTNAME_ERROR_MESSAGE);
       Assert.assertTrue(lastnameerrormessage);
       String actual = getTextElement(driver, RegisterPageUI.LASTNAME_ERROR_MESSAGE);
       Assert.assertEquals(actual, expected);

    }
    public void emailErrorMessage(String expected) {
       boolean emailerrormessage =  isControlDisplayed(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
       Assert.assertTrue(emailerrormessage);
       String actual = getTextElement(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
       Assert.assertEquals(actual, expected);

    }
//    public void passwordErrorMessage(String expected) {
//        boolean passworderrormessage = isControlDisplayed(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
//        Assert.assertTrue(passworderrormessage);
//        String actual = getTextElement(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
//        Assert.assertEquals(actual, expected);
//    }
    public void confirmPasswordErrorMessage(String expected) {
        boolean confirmpassworderrormessage = isControlDisplayed(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
        Assert.assertTrue(confirmpassworderrormessage);
        String actual = getTextElement(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void inputFirstName(String firstname) {
        sendkeyToElement(driver,RegisterPageUI.FIRST_NAME_TEXTBOX, firstname);
    }

    public void inputLastName(String lastname) {
        sendkeyToElement(driver,RegisterPageUI.LAST_NAME_TEXTBOX, lastname);
    }

    public void inputInvalidEmail(String invalidemail) {
        sendkeyToElement(driver,RegisterPageUI.EMAIL_TEXTBOX, invalidemail);
    }

    public void inputPassword(String password) {
        sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
    }

    public void inputConfirmPassword(String confirmpassword) {
        sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, confirmpassword);
    }

    public void inputValidEmail(String email) {
        sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    public void verifyEmailExitedmessage(String expected) {
        boolean emailexitedmessage = isControlDisplayed(driver, RegisterPageUI.EMAIL_EXISTS_ERROR_MESSAGE);
        Assert.assertTrue(emailexitedmessage);
        String actual = getTextElement(driver, RegisterPageUI.EMAIL_EXISTS_ERROR_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void verifySuccessMessage(String expected) {
        boolean registersuccessmessage = isControlEnable(driver,RegisterPageUI.SUCCESS_MESSAGE);
        Assert.assertTrue(registersuccessmessage);
        String actual = getTextElement(driver, RegisterPageUI.SUCCESS_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void clickToRegisterHyperLink() {
        clickToElement(driver, RegisterPageUI.REGISTER_HYPER_LINK);
    }

    public void verifyPasswordErrorMessage(String expected) {
        boolean passworderrormessage = isControlDisplayed(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
        Assert.assertTrue(passworderrormessage);
        String actual = getTextElement(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void verifyConfirmPasswordErrorMessage(String expected) {
        boolean confirmpassworderrormessage = isControlDisplayed(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
        Assert.assertTrue(confirmpassworderrormessage);
        String actual = getTextElement(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
        Assert.assertEquals(actual, expected);
    }



}
