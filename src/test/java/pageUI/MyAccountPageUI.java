package pageUI;

public class MyAccountPageUI {
    //Customer Infor
    public static final String FEMALE_GENDER_RADIOBUTTON = "//input[@id='gender-female']";
    public static final String FIRST_NAME_TEXTBOX = "//input[@id='FirstName']";
    public static final String LAST_NAME_TEXTBOX = "//input[@id='LastName']";
    public static final String DATE_OF_BIRTH_TEXTBOX = "//select[@name='DateOfBirthDay']";
    public static final String MONTH_OF_BIRTH_TEXTBOX = "//select[@name='DateOfBirthMonth']";
    public static final String YEAR_OF_BIRTH_TEXTBOX = "//select[@name='DateOfBirthYear']";
    public static final String EMAIL_TEXTBOX = "//input[@id='Email']";
    public static final String COMPANY_NAME_TEXTBOX = "//input[@id='Company']";
    public static final String SAVE_BUTTON = "//button[@iD='save-info-button']";

    //Address
    public static final String ADDRESSES_BUTTON = "//a[text()='Addresses']";
    public static final String ADDNEW_BUTTON = "//button[@class='button-1 add-address-button']";

    //Change Password
    public static final String CHANGE_PASSWORD_BUTTON = "//a[text()='Change password']";
    public static final String OLD_PASSWORD_TEXTBOX = "//input[@id='OldPassword']";
    public static final String NEW_PASSWORD_TEXTBOX = "//input[@id='NewPassword']";
    public static final String CONFIRM_PASSWORD_TEXTBOX = "//input[@id='ConfirmNewPassword']";
    public static final String CHANGE_PASSWORD_SUBMIT_BUTTON = "//button[text()='Change password']";


    public static final String LOGOUT_BUTTON = "//a[@class='ico-logout']";
    public static final String FRAME_CLOSE = "//p[@class='content']/following-sibling::span";
}




