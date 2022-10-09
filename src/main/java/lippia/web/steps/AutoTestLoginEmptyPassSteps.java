package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutoTestLoginResultService;
import lippia.web.services.AutoTestService;

public class AutoTestLoginEmptyPassSteps extends PageSteps {

    @Given("^The user is in AutomationTesting.in Page$")
    public void homeLogPass(){
        AutoTestService.navigateTo();
    }
    @When("^the user enter in 'My account' page$")
    public void goToMyAccountLogPass() {
        AutoTestService.clickMyAccountButton();
    }
    @And("^put a valid (.*) in username textbox, and empty in password text box and click on login button$")
    public void logTextsBoxesLogPass(String username){
        AutoTestService.enterUserTBox(username);
        AutoTestService.clickLoginButton();
    }
    @Then("Proper error must be displayed 'Invalid password' and prompt to enter login again")
    public void logPassVerification() {
        AutoTestLoginResultService.verifyErrorPassVisibility();
    }

}