package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.sun.jna.WString;
import lippia.web.constants.*;
import org.openqa.selenium.WebElement;

import java.util.List;


public class VerificationService extends ActionManager {
    //-----------------------------------------------------HOME-----------------------------------------------------------
    private static List<WebElement> stats() {
        return getElements(HomeConstants.ARRIVAL_XPATH);
    }
    public static void verifyArrivalVisibility(){
        ActionManager.waitVisibility(HomeConstants.NEW_ARRIVAL_XPATH);
        for (WebElement e: stats()) {
            e.isDisplayed();
        };
    }
    private static List<WebElement> statsSec() {
        return getElements(HomeConstants.SLIDER_XPATH);
    }
    public static void verifySliderVisibility(){
        ActionManager.waitVisibility(HomeConstants.NEW_ARRIVAL_XPATH);
        for (WebElement e: statsSec()) {
            e.isDisplayed();
        };
    }
    private static WebElement visibleBillingDetails(){
        return getElement(BillingConstants.BILLING_DETAIL_VALIDATE_TEXT_XPATH);
    }

    public static void verifyBillingDetailsVisibility(){
        visibleBillingDetails().isDisplayed();
    }
    private static WebElement visibleAditionalDetails(){
        return getElement(BillingConstants.ADDITIONAL_DETAILS_VERIFICATION_TEXT_XPATH);
    }

    public static void verifyAditionalDetailsVisibility(){
        visibleAditionalDetails().isDisplayed();
    }

    private static WebElement visibleOrderDetails(){
        return getElement(ShopConstants.ORDER_DETAIL_VALIDATE_TEXT_XPATH);
    }

    public static void verifyOrderDetailsVisibility(){
        visibleOrderDetails().isDisplayed();
    }
    //------------------------------------------------------LOGIN---------------------------------------------------------
    private static WebElement visibleLogUserError() {
        return getElement(LoginConstants.ERROR_VALIDATE_TXT_XPATH);
    }
    public static void verifyErrorUser(){
        visibleLogUserError().isDisplayed();
    }
    private static WebElement visiblePassChange(){
        return getElement(AccountConstants.PASSWORD_CHANGE_VALIDATE_TEXT_XPATH);
    }

    public static void verifyPassChangeVisibility(){
        visiblePassChange().isDisplayed();
    }

    private static WebElement visibleLoginPage(){
        return getElement(AccountConstants.LOGIN_VALIDATE_TEXT_XPATH);
    }

    public static void verifyLoginPage(){
        visibleLoginPage().isDisplayed();
    }

    //--------------------------------------------------REGISTRATION------------------------------------------------------

    private static WebElement visibleRegMailError() {
        return getElement(RegistrationConstants.REG_VALIDATE_MAIL_TXT_XPATH);
    }
    private static WebElement visibleRegPassError() {
        return getElement(RegistrationConstants.REG_VALIDATE_PASS_TXT_XPATH);
    }
    public static void verifyMailError(){
        visibleRegMailError().isDisplayed();
    }
    public static void verifyPasswordError(){
        visibleRegPassError().isDisplayed();
    }

    //------------------------------------------------------SHOP----------------------------------------------------------

}
