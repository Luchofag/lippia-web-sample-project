package lippia.web.constants;

public class AutoTestConstants {
    // Arrivals y Sliders
    public static final String SHOP_BUTTON_XPATH = "xpath://*[@id=\"menu-item-40\"]/a";
    public static final String HOME_BUTTON_XPATH = "xpath://img[@alt=\"Automation Practice Site\"]";
    public static final String ARRIVAL_XPATH = "xpath://*[@class='woocommerce']";
    public static final String NEW_ARRIVAL_XPATH = "xpath://*[contains(text(),'new arrivals')]";
    public static final String SLIDER_XPATH = "xpath://*[contains(@class,\"n2-ss-canva\")]";

    // Login

    public static final String ACCOUNT_BUTTON_XPATH = "xpath://*[contains(text(),'My Account')]";
    public static final String USERNAME_INPUT_XPATH = "xpath://input[@id=\"username\"]";
    public static final String PASSWORD_INPUT_XPATH = "xpath://input[@id=\"password\"]";
    public static final String SUBMIT_BUTTON_XPATH = "xpath://input[@type=\"submit\"][@name='login']";
    public static final String LOG_VALIDATE_TXT_XPATH = "xpath://strong[contains(text(),'Error')]";
    public static final String LOG_VALIDATE_PASS_TXT_XPATH = "xpath://li[contains(text(),'Password is required.')]";
    // Registration
    public static final String REG_MAIL_INPUT_XPATH = "xpath://input[@id='reg_email']";
    public static final String REG_PASSWORD_INPUT_XPATH = "xpath://input[@id=\"reg_password\"]";
    public static final String REG_BUTTON_XPATH = "xpath://input[@type=\"submit\"][@name='register']";
    public static final String REG_VALIDATE_MAIL_TXT_XPATH = "xpath://*[contains(text(),'Please provide a valid email address.')]";
    public static final String REG_VALIDATE_PASS_TXT_XPATH = "xpath://*[contains(text(),' Please enter an account password.')]";
}