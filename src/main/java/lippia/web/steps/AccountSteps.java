package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutoTestService;
import lippia.web.services.LoginService;
import lippia.web.services.VerificationService;

public class AccountSteps extends PageSteps {
    @And("hace click en el menu 'My account'")
    public void goToMyAccountLog() {
        LoginService.clickMyAccountButton();
        AutoTestService.closeAds();
    }
    @When("^ingresa (.*) y (.*) validos en las casillas correspondientes, luego hace click en el boton de 'login'$")
    public void logTextsBoxesLog(String username, String logPassword){
        LoginService.enterUserTBox(username);
        LoginService.enterPassTBox(logPassword);
        LoginService.clickLoginButton();
        AutoTestService.closeAds();
    }
    @And("el usuario entra exitosamente a la pagina de la cuenta, hace click en 'account details'")
    public void goToAccountDetails(){
        LoginService.clickAccountDetails();
        AutoTestService.closeAds();
    }
    @Then("el usuario puede ver la posibilidad de cambiar la contrasena")
    public void passChangeVerification() {
        VerificationService.verifyPassChangeVisibility();
    }
    @And("el usuario entra exitosamente a la pagina de la cuenta, hace click en 'Logout'")
    public void clickLogout(){
        LoginService.clickLogOutBtn();
        AutoTestService.closeAds();
    }
    @Then("el usuario regresa a la pagina de login")
    public void loginPageVerification(){
        VerificationService.verifyLoginPage();
    }
}