package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutoTestConstants;
import org.openqa.selenium.WebElement;
import java.util.List;


public class AutoTestResultService extends ActionManager {

    private static List<WebElement> stats() {
        return getElements(AutoTestConstants.ARRIVAL_XPATH);
    }
    public static void verifyArrivalVisibility(){
        ActionManager.waitVisibility(AutoTestConstants.NEW_ARRIVAL_XPATH);
        for (WebElement e: stats()) {
            e.isDisplayed();
        };
    }
    private static List<WebElement> statsSec() {
        return getElements(AutoTestConstants.SLIDER_XPATH);
    }
    public static void verifySliderVisibility(){
        ActionManager.waitVisibility(AutoTestConstants.NEW_ARRIVAL_XPATH);
        for (WebElement e: statsSec()) {
            e.isDisplayed();
        };
    }
}
