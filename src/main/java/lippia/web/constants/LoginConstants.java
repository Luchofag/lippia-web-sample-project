package lippia.web.constants;

public class LoginConstants {

    // Login

    public static final String USERNAME_INPUT_XPATH = "xpath://input[@id='username']";
    public static final String PASSWORD_INPUT_XPATH = "xpath://input[@id='password']";
    public static final String LOGIN_BUTTON_XPATH = "xpath://input[@type='submit'][@name='login']";
    public static final String ERROR_VALIDATE_TXT_XPATH = "xpath://strong[contains(text(),'Error')]";
    public static final String LOG_VALIDATE_PASS_TXT_XPATH = "xpath://li[contains(text(),'Password is required.')]";
    public static final String SIGN_OUT_BTN_XPATH = "xpath://a[contains(text(),'Sign out')]";

}