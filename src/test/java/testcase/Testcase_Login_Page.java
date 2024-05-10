package testcase;

import common.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import testdata.DataTests;
import testdata.DataTestsHomePage;

public class Testcase_Login_Page extends BaseTest {
    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;
    LoginPageObjects loginPageObjects;
    HomePageObjects homePageObjects;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
        openUrl(driver, "https://demo.nopcommerce.com/");

    }
    @AfterClass
    public void afterClass() {
        quitBrowser();

    }

    @Test
    public void TC_01_Login_WithEmptyData(){
        homePageObjects = new HomePageObjects(driver);
        logger.info("Step 01: Click on Register button at Home page");
        homePageObjects.clickToLoginButton();

        logger.info("Step 02: Click on Login button at Login page");
        loginPageObjects = new LoginPageObjects(driver);
        loginPageObjects.clickToLoginBtn();

        logger.info("Step 03: Verify email error message displayed");
        loginPageObjects.verifyEmailErrorMessage();
        refreshToPage(driver);
    }

    @Test
    public void TC_02_Login_WithInvalidEmail() {
        refreshToPage(driver);
        logger.info("Step 01: Input Invalid Email");

        loginPageObjects.inputEmail(DataTests.invalidemail);
        loginPageObjects.inputPassword(DataTests.invalidpassword);

        logger.info("Step 02: Click Login Button");
        loginPageObjects.clickToLoginBtn();

        logger.info("Step 03: Verify Login was unsuccessfull message displayed");
        loginPageObjects.verifyLoginWasUnsuccessfullMessage(DataTests.loginwasunsuccessfullmessage);

    }

    @Test
    public void TC_03_Login_WithNotExitsEmail () {
        logger.info("Step 01: Input email not exits");
        loginPageObjects.inputEmail(DataTests.emailNotExist);

        logger.info("Step 02: Click Login Button");
        loginPageObjects.clickToLoginBtn();

        logger.info("Step 03: Verify error message");
        loginPageObjects.verifyLoginWasUnsuccessfullMessage(DataTests.loginwithwrongemailiderrormessage);
    }

    @Test
    public void TC_04_Login_With_EmptyPassword() {
        logger.info("Step 01: Step 01: Input valid email");
        loginPageObjects.inputEmail(DataTests.validemail);

        logger.info("Step 02: Click Login Button");
        loginPageObjects.clickToLoginBtn();

        logger.info("Step 03: Verify error message");
        loginPageObjects.verifyLoginWasUnsuccessfullMessage(DataTests.loginwithwrongemailiderrormessage);
//        refreshToPage(driver);
    }
    @Test
    public void TC_05_Login_With_WrongPassword() {
        logger.info("Step 01: Step 01: Input valid email");
        loginPageObjects.inputEmail(DataTests.validemail);

        logger.info("Step 03: Input wrong password");
        loginPageObjects.inputPassword(DataTests.invalidpassword);

        logger.info("Step 03: Click Login Button");
        loginPageObjects.clickToLoginBtn();

        logger.info("Step 03: Verify error message");
        loginPageObjects.verifyLoginWasUnsuccessfullMessage(DataTests.loginwithwrongemailiderrormessage);
    }
    @Test
    public void TC_06_Login_Successfully() {
        logger.info("Step 01: Step 01: Input valid email");
        loginPageObjects.inputEmail(DataTests.email);

        logger.info("Step 03: Input wrong password");
        loginPageObjects.inputPassword(DataTests.password);

        logger.info("Step 03: Click Login Button");
        loginPageObjects.clickToLoginBtn();

        logger.info("Step 04: Verify navigated to homepage successfully");
        homePageObjects = new HomePageObjects(driver);
        homePageObjects.verifyWelcomeMessage(DataTestsHomePage.welcomemessage);
        refreshToPage(driver);
    }

}
