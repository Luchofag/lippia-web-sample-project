package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AccountConstants;
import lippia.web.constants.LoginConstants;


public class LoginService extends ActionManager {

    //LOGIN
    public static void clickMyAccountButton() {
        click(AccountConstants.ACCOUNT_BUTTON);
    }
    public static void enterUserTBox(String text) {
        setInput(LoginConstants.USERNAME_INPUT, text);
    }
    public static void clickAccountDetails() {
        click(AccountConstants.ACCOUNT_DETAILS_BTN);
    }
    public static void clickLogOutBtn(){
        click(AccountConstants.LOGOUT_BTN);
    }
    public static void enterPassTBox(String text) {
        setInput(LoginConstants.PASSWORD_INPUT, text);
    }
    public static void clickLoginButton() {
        click(LoginConstants.LOGIN_BUTTON);
    }
    public static void clickSignOutBtn(){
        click(LoginConstants.SIGN_OUT_BTN);
    }
}
