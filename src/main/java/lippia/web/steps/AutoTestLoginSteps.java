package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutoTestLoginResultService;
import lippia.web.services.AutoTestResultService;
import lippia.web.services.AutoTestService;

public class AutoTestLoginSteps extends PageSteps {

    @Given("^The user is in Automation Testing Practice Page$")
    public void homeLog(){
        AutoTestService.navigateTo();
    }
    @When("^User enter in 'My Account' page$")
    public void goToMyAccountLog() {
        AutoTestService.clickMyAccountButton();
    }
    @And("^put incorrect (.*) in username textbox, and incorrect (.*) in password text box and click on login button$")
    public void logTextsBoxesLog(String username, String logPassword){
        AutoTestService.enterUserTBox(username);
        AutoTestService.enterPassTBox(logPassword);
        AutoTestService.clickLoginButton();
    }
    @Then("Proper error must be displayed 'Invalid username' and prompt to enter login again")
    public void logVerification() {
        AutoTestLoginResultService.verifyErrorUserVisibility();
    }

}