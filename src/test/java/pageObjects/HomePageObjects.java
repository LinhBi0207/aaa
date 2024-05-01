package pageObjects;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
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
}
