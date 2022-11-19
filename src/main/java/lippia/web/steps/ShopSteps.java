package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {
    @And("hace click en el primer boton add to basket")
    public void clickAddToBasket() {
        ShopService.addToBasket();
    }

}
