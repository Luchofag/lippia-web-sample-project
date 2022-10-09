package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutoTestConstants;
import org.openqa.selenium.WebElement;


public class AutoTestLoginResultService extends ActionManager {

    /*private static WebElement visibleStat() {
        return getElement(AutoTestConstants.LOG_VALIDATE_TXT_XPATH);
    }*/
    public static void verifyErrorUserVisibility(){
        ActionManager.waitVisibility(AutoTestConstants.LOG_VALIDATE_TXT_XPATH);
    }
    public static void verifyErrorPassVisibility(){
        ActionManager.waitVisibility(AutoTestConstants.LOG_VALIDATE_PASS_TXT_XPATH);
    }

}
