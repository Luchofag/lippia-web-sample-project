package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutoTestRegResultService;
import lippia.web.services.AutoTestService;

public class AutoTestRegEmptyPassSteps extends PageSteps {

    @Given("^The user is in AutomationTesting.in Page$")
    public void homeEmptyPass(){
        AutoTestService.navigateTo();
    }
    @When("^Click on My Account Menu$")
    public void goToMyAccountEmptyPass() {
        AutoTestService.clickMyAccountButton();
    }
    @And("^Enter valid (.*) in Email-Address textbox, enter empty password in password textbox and click on Register button$")
    public void logTextsBoxesEmptyPass(String regEmail){
        AutoTestService.enterMailTBox(regEmail);
        AutoTestService.clickLoginButton();
    }
    @Then("Registration must fail with a warning message 'please enter an account password'")
    public void emptyPassVerification() {
        AutoTestRegResultService.verifyErrorRegPassVisibility();
    }

}