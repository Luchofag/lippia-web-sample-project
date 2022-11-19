package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.RegistrationService;
import lippia.web.services.VerificationService;
public class RegistrationSteps extends PageSteps {
    @And("ingresa un (.*) valido y con la casilla de password vacia, hace click en el boton para registrar la cuenta")
    public void inputMailBox(String mail) {
        RegistrationService.enterMailTBox(mail);
        RegistrationService.clickRegisterButton();
    }
    @Then("el registro debe fallar con el mensaje en pantalla: please enter an account password")
    public void failPassword() {
        VerificationService.verifyPasswordError();
    }
    @And("con las casillas de email y contraseña vacios, hace click en el boton de registrar")
    public void clickRegBtn() {
        RegistrationService.clickRegisterButton();
    }
    @Then("el registro debe fallar con el mensaje en pantalla: please provide valid email address")
    public void failMail() {
        VerificationService.verifyMailError();
    }
}
