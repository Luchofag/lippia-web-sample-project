package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.sun.jna.WString;
import lippia.web.constants.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class VerificationService extends ActionManager {
    //-----------------------------------------------------HOME-----------------------------------------------------------
    private static List<WebElement> stats() {
        return getElements(HomeConstants.ARRIVAL);
    }
    public static void verifyArrivalVisibility(){
        ActionManager.waitVisibility(HomeConstants.NEW_ARRIVAL);
        for (WebElement e: stats()) {
            e.isDisplayed();
        };
    }
    private static List<WebElement> statsSec() {
        return getElements(HomeConstants.HOME_SLIDER);
    }
    public static void verifySliderVisibility(){
        ActionManager.waitVisibility(HomeConstants.NEW_ARRIVAL);
        for (WebElement e: statsSec()) {
            e.isDisplayed();
        };
    }
    private static WebElement visibleBillingDetails(){
        return getElement(BillingConstants.BILLING_DETAIL_VALIDATE_TEXT);
    }

    public static void verifyBillingDetailsVisibility(){
        visibleBillingDetails().isDisplayed();
    }
    private static WebElement visibleAditionalDetails(){
        return getElement(BillingConstants.ADDITIONAL_DETAILS_VERIFICATION_TEXT);
    }

    public static void verifyAditionalDetailsVisibility(){
        visibleAditionalDetails().isDisplayed();
    }

    private static WebElement visibleOrderDetails(){
        waitVisibility(ShopConstants.ORDER_DETAIL_VALIDATE_TEXT_XPATH);
        return getElement(ShopConstants.ORDER_DETAIL_VALIDATE_TEXT_XPATH);
    }

    public static void verifyOrderDetailsVisibility(){
        Assert.assertTrue(visibleOrderDetails().isDisplayed());
    }
    //------------------------------------------------------LOGIN---------------------------------------------------------
    private static WebElement visibleLogUserError() {
        return getElement(LoginConstants.ERROR_VALIDATE_TXT);
    }
    public static void verifyErrorUser(){
        Assert.assertTrue(visibleLogUserError().isDisplayed());
    }
    private static WebElement visiblePassChange(){
        return getElement(AccountConstants.PASSWORD_CHANGE_VALIDATE_TEXT);
    }

    public static void verifyPassChangeVisibility(){
        visiblePassChange().isDisplayed();
    }

    private static WebElement visibleLoginPage(){
        return getElement(AccountConstants.LOGIN_VALIDATE_TEXT);
    }

    public static void verifyLoginPage(){
        Assert.assertTrue(visibleLoginPage().isDisplayed());
    }

    //--------------------------------------------------REGISTRATION------------------------------------------------------

    private static WebElement visibleRegMailError() {
        return getElement(RegistrationConstants.SIGN_VALIDATE_MAIL_TXT);
    }
    private static WebElement visibleRegPassError() {
        return getElement(RegistrationConstants.SIGN_VALIDATE_PASS_TXT);
    }
    public static void verifyMailError(){
        Assert.assertTrue(visibleRegMailError().isDisplayed());
    }
    public static void verifyPasswordError(){
        Assert.assertTrue(visibleRegPassError().isDisplayed());
    }

    //------------------------------------------------------SHOP----------------------------------------------------------

}
