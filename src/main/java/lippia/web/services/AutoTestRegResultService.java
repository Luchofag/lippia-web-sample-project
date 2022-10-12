package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutoTestConstants;
import org.openqa.selenium.WebElement;


public class AutoTestRegResultService extends ActionManager {

    private static WebElement visibleRegMailError() {
        return getElement(AutoTestConstants.REG_VALIDATE_MAIL_TXT_XPATH);
    }
    private static WebElement visibleRegPassError() {
        return getElement(AutoTestConstants.REG_VALIDATE_PASS_TXT_XPATH);
    }
    /*public static void verifyErrorMailVisibility(){
        ActionManager.waitVisibility(AutoTestConstants.REG_VALIDATE_MAIL_TXT_XPATH);
    }*/
    public static void verifyErrorMailVisibility(){
        visibleRegMailError().isDisplayed();
    }
    /*public static void verifyErrorRegPassVisibility(){
        ActionManager.waitVisibility(AutoTestConstants.REG_VALIDATE_PASS_TXT_XPATH);
    }*/
    public static void verifyErrorRegPassVisibility(){
        visibleRegPassError().isDisplayed();
    }

}
