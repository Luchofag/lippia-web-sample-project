package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistrationConstants;

public class RegistrationService extends ActionManager {

    //REGISTRATION
    public static void enterMailTBox(String text) {
        setInput(RegistrationConstants.SIGN_MAIL_INPUT, text);
    }
    public static void clickRegisterButton() {
        click(RegistrationConstants.SIGN_BUTTON);
        AutoTestService.closeAds();
    }
}
