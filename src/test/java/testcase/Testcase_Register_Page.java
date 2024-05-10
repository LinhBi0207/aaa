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
import pageObjects.RegisterPageObjects;
import testdata.DataTests;

public class Testcase_Register_Page extends BaseTest {
    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;
    LoginPageObjects loginPageObjects;
    HomePageObjects homePageObjects;
    RegisterPageObjects registerPageObjects;

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
    public void TC_01_Register_With_EmptyData() {
        logger.info("Step 01: Click to Register button at Home Page");
        homePageObjects = new HomePageObjects(driver);
        homePageObjects.clickToRegisterBtn();

        logger.info("Step 02: Click to Register button at Register PAge");
        registerPageObjects = new RegisterPageObjects(driver);
        registerPageObjects.clickToRegisterButton();

        logger.info("Step 03: Verify error messages display");
        registerPageObjects.firstNameErrorMessage("First name is required.");
        registerPageObjects.lastNameErrorMessage("Last name is required.");
        registerPageObjects.emailErrorMessage("Email is required.");
        registerPageObjects.confirmPasswordErrorMessage("Password is required.");

    }

    @Test
    public void TC_02_Register_With_InValidEmail() {
        logger.info("Step 01: Reload Register Page");
        refreshToPage(driver);

        logger.info("Step 02: Input FirstName");
        registerPageObjects.inputFirstName(DataTests.firstname);

        logger.info("Step 03: Input LastName");
        registerPageObjects.inputLastName(DataTests.lastname);

        logger.info("Step 04: Input InvalidEmail");
        registerPageObjects.inputInvalidEmail(DataTests.invalidemail);

        logger.info("Step 05: Input Password");
        registerPageObjects.inputPassword(DataTests.password);

        logger.info("Step 06: Input ConfirmPassword");
        registerPageObjects.inputConfirmPassword(DataTests.otherconfirmpassword);
    }

    @Test
    public void TC_03_Register_With_ValidInformation() {
        logger.info("Step 01: Reload Register Page");
        refreshToPage(driver);

        logger.info("Step 02: Input FirstName");
        registerPageObjects.inputFirstName(DataTests.firstname);
        logger.info("Step 03: Input LastName");
        registerPageObjects.inputLastName(DataTests.lastname);

        logger.info("Step 04: Input ValidEmail");
        registerPageObjects.inputValidEmail(DataTests.validemail);

        logger.info("Step 05: Input Password");
        registerPageObjects.inputPassword(DataTests.password);
        logger.info("Step 06: Input ConfirmPassword");
        registerPageObjects.inputConfirmPassword(DataTests.password);

        logger.info("Step 07: Click Register button");
        registerPageObjects.clickToRegisterButton();

        logger.info("Step 08: Verify success messages display");
        registerPageObjects.verifySuccessMessage(DataTests.registersuccessmessage);
    }
    @Test
    public void TC_04_Register_With_Exited_Email () {
        logger.info("Step 01: Click to Register Hyperlink");
        openUrl(driver, "https://demo.nopcommerce.com/register?returnUrl=%2F");

        logger.info("Step 02: Input FirstName");
        registerPageObjects.inputFirstName(DataTests.firstname);

        logger.info("Step 03: Input LastName");
        registerPageObjects.inputLastName(DataTests.lastname);

        logger.info("Step 04: Input ValidEmail");
        registerPageObjects.inputValidEmail(DataTests.validemail);

        logger.info("Step 05: Input Password");
        registerPageObjects.inputPassword(DataTests.password);
        logger.info("Step 06: Input ConfirmPassword");
        registerPageObjects.inputConfirmPassword(DataTests.password);

        logger.info("Step 07: Click Register button");
        registerPageObjects.clickToRegisterButton();

        logger.info("Step 08: Verify 'The specified email already exists' display");
        registerPageObjects.verifyEmailExitedmessage(DataTests.thespecifiedemailalreadyexists);

    }
    @Test
    public void TC_05_Register_With_Invalid_Password () {
        logger.info("Step 01: Click to Register Hyperlink");
        openUrl(driver, "https://demo.nopcommerce.com/register?returnUrl=%2F");

        logger.info("Step 02: Input FirstName");
        registerPageObjects.inputFirstName(DataTests.firstname);

        logger.info("Step 03: Input LastName");
        registerPageObjects.inputLastName(DataTests.lastname);

        logger.info("Step 04: Input ValidEmail");
        registerPageObjects.inputValidEmail(DataTests.email);

        logger.info("Step 05: Input Password");
        registerPageObjects.inputPassword(DataTests.invalidpassword);

        logger.info("Step 06: Input ConfirmPassword");
        registerPageObjects.inputConfirmPassword(DataTests.invalidpassword);

        logger.info("Step 07: Click to register button");
        registerPageObjects.clickToRegisterButton();

        logger.info("Step07: Verify Error Password Message");
        registerPageObjects.verifyPasswordErrorMessage(DataTests.passworderrormessage);

    }
    @Test
    public void TC_06_Register_With_Invalid_ConfirmPassword() {
        logger.info("Step 01: Click to Register Hyperlink");
        openUrl(driver, "https://demo.nopcommerce.com/register?returnUrl=%2F");

        logger.info("Step 02: Input FirstName");
        registerPageObjects.inputFirstName(DataTests.firstname);

        logger.info("Step 03: Input LastName");
        registerPageObjects.inputLastName(DataTests.lastname);

        logger.info("Step 04: Input ValidEmail");
        registerPageObjects.inputValidEmail(DataTests.email);

        logger.info("Step 05: Input Password");
        registerPageObjects.inputPassword(DataTests.password);

        logger.info("Step 06: Input ConfirmPassword");
        registerPageObjects.inputConfirmPassword(DataTests.otherconfirmpassword);
        registerPageObjects.clickToRegisterButton();

        // Them step click vao Register button o day
        // Vi trong behavior la nhap confirm password xong hover ra khoi textbox thi moi hien thi error message
        // Ma thang sendkey trong selenium chi truyen data vao va khong co hanh vi hover ra khoi textbox nen ko hien thi loi
        registerPageObjects.clickToRegisterButton();

        logger.info("Step07: Verify Error ConfirmPassword Message");
        registerPageObjects.verifyConfirmPasswordErrorMessage(DataTests.confirmpassworderrormessage);
    }
}


