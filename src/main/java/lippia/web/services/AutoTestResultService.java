package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutoTestConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class AutoTestResultService extends ActionManager {

    private static WebElement stats() {
        return getElement(AutoTestConstants.FIRST_ARRIVAL_XPATH,
                AutoTestConstants.SECOND_ARRIVAL_XPATH,AutoTestConstants.THIRD_ARRIVAL_XPATH);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyResults(){
        Assert.assertTrue(getStats().isEmpty());
    }
}
