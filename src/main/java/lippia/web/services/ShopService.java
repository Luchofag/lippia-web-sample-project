package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.ShopConstants;



public class ShopService extends ActionManager {
    public static void addToBasket(){
        click(ShopConstants.ADD_BUTTON_XPATH);
    }

}
