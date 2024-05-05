package testdata;

import common.AbstractPage;

public class DataTests extends AbstractPage {

    //Login Page
    public static final String invalidemail = "alo@gmail.com";
    public static final String invalidpassword = "alo";
    //Login Page Messages
    public static final String loginwasunsuccessfullmessage = "Login was unsuccessful. Please correct the errors and try again.\n"+ "No customer account found";
    public static final String loginwithwrongemailiderrormessage = "Login was unsuccessful. Please correct the errors and try again.\n" + "The credentials provided are incorrect";
    //Register Page
    public static final String firstname = "Linh";
    public static final String lastname = "Rose";
    public static final String password = "alo123456";
    public static final String otherconfirmpassword = "alo123";
    public static final String email = "alo" + randomNumber() + "@gmail.com";
    public static final String validemail = email;



//    Register Page Messages
    public static final String thespecifiedemailalreadyexists= "The specified email already exists";
    public static final String registersuccessmessage = "Your registration completed";
    public static final String passworderrormessage = "<p>Password must meet the following rules: </p><ul><li>must have at least 6 characters and not greater than 64 characters</li></ul>";
    public static final String confirmpassworderrormessage = "The password and confirmation password do not match.";


}
