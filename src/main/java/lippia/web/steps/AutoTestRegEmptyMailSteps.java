package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutoTestLoginResultService;
import lippia.web.services.AutoTestRegResultService;
import lippia.web.services.AutoTestService;

public class AutoTestRegEmptyMailSteps extends PageSteps {

    @Given("^User is in Automation Testing Practice Site$")
    public void homeEmptyMail(){
        AutoTestService.navigateTo();
    }
    @When("^user enter in 'My account' page$")
    public void goToMyAccountEmptyMail() {
        AutoTestService.clickMyAccountButton();
    }
    @And("^Enter empty Email Address in Email-Address textbox, and enter a valid (.*) in password textbox, and click on Register button$")
    public void logTextsBoxesEmptyMail(String regPassword){
        AutoTestService.enterRegPassTBox(regPassword);
        AutoTestService.clickRegisterButton();
    }
    @Then("Registration must fail with a warning message 'please provide valid email address'")
    public void emptyMailVerification() {
        AutoTestRegResultService.verifyErrorMailVisibility();
    }

}