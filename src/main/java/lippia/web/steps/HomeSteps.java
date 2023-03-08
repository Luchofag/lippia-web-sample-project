package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.AutoTestService;
import lippia.web.services.VerificationService;

import static lippia.web.services.AutoTestService.closeAds;

public class HomeSteps extends PageSteps {

    @Given("El usuario esta en la Home Page")
    public void homeLog(){
        AutoTestService.navigateTo();
    }
    @When("el usuario hace click en el boton 'shop' del menu")
    public void goToShopArrival() {
        AutoTestService.clickShopButton();
    }

    @And("regresa al home page, con el boton de 'home'")
    public void backToHomeArrival() {
        AutoTestService.clickHomeButton();
    }

    @Then("el usuario puede ver solo tres 'arrivals'")
    public void arrivalVerification() {
        VerificationService.verifyArrivalVisibility();
    }

    @When("el usuario hace click en la imagen del primer 'arrival'")
    public void clickInArrival(){
        AutoTestService.navigateTo();
        AutoTestService.clickInArrival();
    }

    @And("ingrese en la pagina del libro, hace click en Add to basket para agregarlo al carro")
    public void addToBasket() {
        AutoTestService.addToBasketBtn();
    }

    @And("ingresa al Item menu, para ver el carro de compras")
    public void goToBasket() {
        AutoTestService.goToBasket();
    }

    @When("el usuario puede ver el importe total, procede haciendo click en el boton Proceed to chekout")
    public void proceedToCheckout() {
        AutoTestService.proceedToCheckout();
    }

    @Then("el usuario puede ver el detalle de facturacion e informacion adicional")
    public void elUsuarioPuedeVerElDetalleDeFacturacionEInformacionAdicional() {
        VerificationService.verifyBillingDetailsVisibility();
        VerificationService.verifyAditionalDetailsVisibility();
    }

    @And("^el usuario ingresa los datos de (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void fillForm(String fName, String lName, String mail, String phone, String country,
                         String address, String city, String county, String postcode){
        AutoTestService.fillFirstName(fName);
        AutoTestService.fillLastName(lName);
        AutoTestService.fillMail(mail);
        AutoTestService.fillPhone(phone);
        AutoTestService.fillCountry(country);
        AutoTestService.fillAddress(address);
        AutoTestService.fillCity(city);
        AutoTestService.fillCounty(county);
        AutoTestService.fillPostcode(postcode);
        closeAds();
    }

    @Then("el usuario puede ver los detalles del pedido")
    public void orderDetails() {
        VerificationService.verifyOrderDetailsVisibility();
    }

    @When("hace click en place order, para realizar el pedido")
    public void clickPlaceOrder() throws InterruptedException {
        closeAds();
        AutoTestService.clickPlaceOrder();

    }
}
