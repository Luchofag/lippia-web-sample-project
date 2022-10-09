package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.AutoTestConstants;


public class AutoTestService extends ActionManager {

    public static void navigateTo(){
        WebActionManager.navigateTo(PropertyManager.getProperty("web.base.url"));
    }


    /*public static void enterSearchCriteria(String text) {
        setInput(AutoTestConstants.INPUT_SEARCH_XPATH, text);
    }*/

    //Log
    public static void clickMyAccountButton() {
        click(AutoTestConstants.ACCOUNT_BUTTON_XPATH);
    }

    public static void enterUserTBox(String text) {
        setInput(AutoTestConstants.USERNAME_INPUT_XPATH, text);
    }

    public static void enterPassTBox(String text) {
        setInput(AutoTestConstants.PASSWORD_INPUT_XPATH, text);
    }
    public static void clickLoginButton() {
        click(AutoTestConstants.SUBMIT_BUTTON_XPATH);
    }

    //Reg
    public static void enterMailTBox(String text) {
        setInput(AutoTestConstants.REG_MAIL_INPUT_XPATH, text);
    }

    public static void enterRegPassTBox(String text) {
        setInput(AutoTestConstants.REG_PASSWORD_INPUT_XPATH, text);
    }
    public static void clickRegisterButton() {
        click(AutoTestConstants.REG_BUTTON_XPATH);
    }


    public static void clickShopButton() {
        click(AutoTestConstants.SHOP_BUTTON_XPATH);
    }
    public static void clickHomeButton() {
        click(AutoTestConstants.HOME_BUTTON_XPATH);
    }
}
