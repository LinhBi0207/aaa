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
import pageObjects.MyAccountPageObjects;
import testdata.DataTests;
import testdata.DataTestsMyAccount;

public class Testcase_MyAccount_Page extends BaseTest {
    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;
    LoginPageObjects loginPageObjects;
    HomePageObjects homePageObjects;
    MyAccountPageObjects myaccountPageObjects;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
        openUrl(driver, "https://demo.nopcommerce.com/");

        //Preconditions
        homePageObjects = new HomePageObjects(driver);
        homePageObjects.clickToLoginButton();

        loginPageObjects = new LoginPageObjects(driver);
        logger.info("Step 01: Step 01: Input valid email");
        loginPageObjects.inputEmail(DataTests.email);

        logger.info("Step 03: Input wrong password");
        loginPageObjects.inputPassword(DataTests.password);

        logger.info("Step 03: Click Login Button");
        loginPageObjects.clickToLoginBtn();

        logger.info("Step 04: Click to MyAccount Button");
        homePageObjects = new HomePageObjects(driver);
        homePageObjects.clickToMyAccountButton();

    }
    @AfterClass
    public void afterClass() {
        quitBrowser();

    }

    @Test
    public void TC_01_Update_Information() {

        myaccountPageObjects = new MyAccountPageObjects(driver);
        logger.info("Step 01: Select Female Gender");
        myaccountPageObjects.selectFemaleGenfer();

        logger.info("Step 02: Change FirstName");
        myaccountPageObjects.inputFirstName(DataTestsMyAccount.firstname);

        logger.info("Step 03: Change LastName");
        myaccountPageObjects.inputLastName(DataTestsMyAccount.lastname);

        logger.info("Step 04: Change Dob");
        myaccountPageObjects.selectDate("11");
        myaccountPageObjects.selectMonth("February");
        myaccountPageObjects.selectYear("1997");


        logger.info("Step 05: Change Email");
        myaccountPageObjects.inputEmail(DataTestsMyAccount.email);

        logger.info("Step 06: Change Company info");
        myaccountPageObjects.inputCompanyinfo(DataTestsMyAccount.companyname);

        logger.info("Step 07: Click Save Button");
        myaccountPageObjects.clickSaveButton();
    }
    @Test
    public void TC_02_Add_Adress() {
        logger.info("Step 01: Click to Address Button");
        myaccountPageObjects.clickToAddressButton();

        logger.info("Step 02: Click to Addnew button");
        myaccountPageObjects.clickToAddnewButton();
    }
}
