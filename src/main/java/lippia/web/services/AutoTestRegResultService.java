package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutoTestConstants;


public class AutoTestRegResultService extends ActionManager {

    /*private static WebElement visibleStat() {
        return getElement(AutoTestConstants.LOG_VALIDATE_TXT_XPATH);
    }*/
    public static void verifyErrorMailVisibility(){
        ActionManager.waitVisibility(AutoTestConstants.REG_VALIDATE_MAIL_TXT_XPATH);
    }
    public static void verifyErrorRegPassVisibility(){
        ActionManager.waitVisibility(AutoTestConstants.REG_VALIDATE_PASS_TXT_XPATH);
    }

}
