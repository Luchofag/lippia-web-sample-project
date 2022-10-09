package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutoTestResultService;
import lippia.web.services.AutoTestService;

public class AutoTestSlidersSteps extends PageSteps {

    @Given("^User is in AutomationTesting.in Page$")
    public void homeSlider(){
        AutoTestService.navigateTo();
    }
    @When("^User is in the home page, click on the shop button from the menu items$")
    public void goToShopSlider() {
        AutoTestService.clickShopButton();
    }
    @And("^user will back to the home page, using the home button$")
    public void backToHomeSlider(){
        AutoTestService.clickHomeButton();
    }
    @Then("The user can see three sliders only")
    public void sliderVerification() {
        AutoTestResultService.verifySliderVisibility();
    }

}