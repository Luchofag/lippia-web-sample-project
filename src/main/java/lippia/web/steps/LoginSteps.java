package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutoTestService;
import lippia.web.services.LoginService;
import lippia.web.services.VerificationService;

public class LoginSteps extends PageSteps {
    @When("ingresa (.*) y (.*) con letras cambiadas en las casillas correspondientes")
    public void logTextBox(String username, String password) {
        LoginService.enterUserTBox(username.toUpperCase());
        LoginService.enterPassTBox(password.toUpperCase());
    }

    @And("hace click en el boton de login")
    public void clickLoginBtn() {
        LoginService.clickLoginButton();
    }

    @Then("se muestra en pantalla un mensaje de usuario o contrasena incorrecta")
    public void validateError() {
        VerificationService.verifyErrorUser();
    }


    @When("ingresa (.*) y (.*) validos en las casillas correspondientes")
    public void logInputOk(String username, String password) {
        LoginService.enterUserTBox(username);
        LoginService.enterPassTBox(password);
    }

    @When("se logea exitosamente, hace click en el boton de sign out, para salir del sitio")
    public void clickLogout() {
        LoginService.clickSignOutBtn();
    }

    @And("hace click en el boton atras, para volver a la pagina anterior")
    public void clickBackBtn() {
        AutoTestService.backButton();
    }

    @Then("puede ver que no vuelve al dashboard de la cuenta")
    public void loginPageVisible() {
        VerificationService.verifyLoginPage();
    }
}
