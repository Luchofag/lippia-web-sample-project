package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistrationConstants;

public class RegistrationService extends ActionManager {

    //REGISTRATION
    public static void enterMailTBox(String text) {
        setInput(RegistrationConstants.REG_MAIL_INPUT_XPATH, text);
    }
    public static void clickRegisterButton() {
        click(RegistrationConstants.REG_BUTTON_XPATH);
        AutoTestService.closeAds();
    }
}
