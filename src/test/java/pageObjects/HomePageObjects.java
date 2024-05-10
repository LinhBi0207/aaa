package pageObjects;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageUI.HomePageUI;

public class HomePageObjects extends AbstractPage {
    WebDriver driver;

    public HomePageObjects (WebDriver driver) {
        this.driver = driver;
    }

    public void clickToLoginButton() {
        waitToElementClickable(driver, HomePageUI.LOGIN_BUTTON);
        clickToElement(driver, HomePageUI.LOGIN_BUTTON);
    }


    public void clickToRegisterBtn() {
        clickToElement(driver, HomePageUI.REGISTER_BUTTON);
    }

    public void verifyWelcomeMessage(String expected) {
        String actual = getTextElement(driver, HomePageUI.WELCOME_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void clickToMyAccountButton() {
        clickToElement(driver, HomePageUI.MYACCOUNT_BUTTON);
    }
}
