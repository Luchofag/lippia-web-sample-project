package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AutoTestResultService;
import lippia.web.services.AutoTestService;

public class AutoTestSteps extends PageSteps {

    @Given("^The user is in AutomationTesting.in Page$")
    public void home(){
        AutoTestService.navigateTo();
    }
    @When("^The user is in the home page, click the shop button from the menu items$")
    public void goToShop() {
        AutoTestService.clickShopButton();
    }
    @And("^Return to the home page, using the home button$")
    public void backToHome(){
        AutoTestService.clickHomeButton();
    }
    @Then("The user can see three arrivals only")
    public void statVerification() {
        AutoTestResultService.verifyResults();
    }
}