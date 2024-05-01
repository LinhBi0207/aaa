package pageUI;

import org.bouncycastle.pqc.crypto.newhope.NHSecretKeyProcessor;

public class RegisterPageUI {
    public static final String MALE_GENDER_RADIO_BUTTON = "//input[@id='gender-male']";
    public static final String FIRST_NAME_TEXTBOX = "//input[@id='FirstName']";
    public static final String LAST_NAME_TEXTBOX = "//input[@id='LastName']";
    public static final String DATE_OF_BIRTH_TEXTBOX = "//select[@name='DateOfBirthDay']";
    public static final String MONTH_OF_BIRTH_TEXTBOX = "//select[@name='DateOfBirthMonth']";
    public static final String YEAR_OF_BIRTH_TEXTBOX = "//select[@name='DateOfBirthYear']";
    public static final String EMAIL_TEXTBOX = "//input[@id='Email']";
    public static final String COMPANY_NAME_TEXTBOX = "//input[@id='Company']";
    public static final String PASSWORD_TEXTBOX = "//input[@id='Password']";
    public static final String CONFIRM_PASSWORD_TEXTBOX = "//input[@id='ConfirmPassword']";
    public static final String REGISTER_BUTTON = "//button[@name='register-button']";

    //Register hyperlink
    public static final String REGISTER_HYPER_LINK = "//a[@class='ico-register']";
    //Success Messages
    public static final String SUCCESS_MESSAGE = "//div[@class='result']";

    //Error Messages
    public static final String FIRSTNAME_ERROR_MESSAGE = "//span[@id='FirstName-error']";
    public static final String LASTNAME_ERROR_MESSAGE = "//span[@id='LastName-error']";
    public static final String EMAIL_ERROR_MESSAGE = "//span[@id='Email-error']";
    public static final String PASSWORD_ERROR_MESSAGE = "//span[@class ='field-validation-error']";
    public static final String CONFIRM_PASSWORD_ERROR_MESSAGE = "//span[@id='ConfirmPassword-error']";
    public static final String EMAIL_EXISTS_ERROR_MESSAGE = "//div[@class='message-error validation-summary-errors']";

}
