package pageObjects;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUI.MyAccountPageUI;

public class MyAccountPageObjects extends AbstractPage {
    WebDriver driver;

   public MyAccountPageObjects(WebDriver driver) {
       this.driver = driver;
   }

    public void selectFemaleGenfer() {
        clickToElement(driver, MyAccountPageUI.FEMALE_GENDER_RADIOBUTTON);
    }


    public void inputFirstName(String firstname) {
        sendkeyToElement(driver, MyAccountPageUI.FIRST_NAME_TEXTBOX, firstname);
    }

    public void inputLastName(String lastname) {
        sendkeyToElement(driver, MyAccountPageUI.LAST_NAME_TEXTBOX, lastname);
    }

    public void selectDate(String value) {
        selectItemInDropdow(driver, MyAccountPageUI.DATE_OF_BIRTH_TEXTBOX, value);
    }

    public void selectMonth(String value) {
        selectItemInDropdow(driver, MyAccountPageUI.MONTH_OF_BIRTH_TEXTBOX, value);
    }
    public void selectYear(String value) {
        selectItemInDropdow(driver, MyAccountPageUI.YEAR_OF_BIRTH_TEXTBOX, value);
    }

    public void inputEmail(String email) {
        sendkeyToElement(driver, MyAccountPageUI.EMAIL_TEXTBOX, email);
    }

    public void inputCompanyinfo(String companyname) {
        sendkeyToElement(driver, MyAccountPageUI.COMPANY_NAME_TEXTBOX, companyname);
    }

    public void clickSaveButton() {
        clickToElement(driver, MyAccountPageUI.SAVE_BUTTON);
    }

    public void clickToAddressButton() {
       clickToElement(driver,MyAccountPageUI.ADDRESSES_BUTTON);
    }

    public void clickToAddnewButton() {
       clickToElement(driver, MyAccountPageUI.ADDNEW_BUTTON);
    }
}
