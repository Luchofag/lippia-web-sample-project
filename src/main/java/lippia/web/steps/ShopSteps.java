package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.constants.ShopConstants;
import lippia.web.services.AutoTestService;
import lippia.web.services.ShopService;
import lippia.web.services.VerificationService;
import org.testng.Assert;

public class ShopSteps extends PageSteps {
    @And("hace click en el primer boton add to basket")
    public void clickAddToBasket() {
        AutoTestService.addToBasketBtn();
    }

    @Then("verifico que el impuesto este bien calculado")
    public void verificoQueElImpuestoEsteBienCalculado() {
        assert ShopService.taxCalculate() == 17.50 : "El impuesto esta mal calculado";
        Assert.assertTrue(ShopService.taxCalculate() == 17.50);
    }
}
