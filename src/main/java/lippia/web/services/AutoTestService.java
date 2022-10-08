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

    public static void clickShopButton() {
        click(AutoTestConstants.SHOP_BUTTON_XPATH);
    }
    public static void clickHomeButton() {
        click(AutoTestConstants.HOME_BUTTON_XPATH);
    }
}
