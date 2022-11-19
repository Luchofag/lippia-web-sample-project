package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AutoTestService extends ActionManager {

    public static void navigateTo(){
        WebActionManager.navigateTo(PropertyManager.getProperty("web.base.url"));
        closeAds();
    }
    public static void backButton(){
        DriverManager.getDriverInstance().getWrappedDriver().navigate().back();
    }
    public static void closeAds() {
        WebDriver driver = DriverManager.getDriverInstance();
        try {
            WebElement iframe1 = getElement(HomeConstants.AD_IFRAME1_XPATH);
            if (iframe1.isDisplayed()) {
                driver.switchTo().frame(iframe1);
                try {
                    getElement(HomeConstants.AD_CLOSE_BUTTON_XPATH).click();
                } catch (Exception e) {
                    WebElement iframe2 = getElement(HomeConstants.AD_IFRAME2_XPATH);
                    driver.switchTo().frame(iframe2);
                    click(HomeConstants.AD_CLOSE_BUTTON_XPATH);
                }
                driver.switchTo().defaultContent();
            }
        } catch (Exception e) {
            System.out.println("NO ADS!");
        }
    }
    public static void clickShopButton() {
        click(HomeConstants.SHOP_BUTTON_XPATH);
        closeAds();
    }
    public static void clickHomeButton() {
        click(HomeConstants.HOME_BUTTON_XPATH);
        closeAds();
    }
    public static void clickInArrival(){
        click(HomeConstants.ARRIVAL_IMAGE_XPATH);
        closeAds();
    }
    public static void addToBasketBtn(){
        click(ShopConstants.ADD_BUTTON_XPATH);
        closeAds();
    }
    public static void goToBasket(){
        click(ShopConstants.CART_MENU_ITEM_XPATH);
        closeAds();
    }
    public static void proceedToCheckout(){
        click(ShopConstants.CHECKOUT_BUTTON_XPATH);
        closeAds();
    }
    public static void fillFirstName(String fName) {
        setInput(BillingConstants.FIRST_NAME_INPUT_XPATH, fName);
    }
    public static void fillLastName(String lName){
        setInput(BillingConstants.LAST_NAME_INPUT_XPATH, lName);
    }
    public static void fillMail(String mail){
        setInput(BillingConstants.EMAIL_INPUT_XPATH, mail);
    }
    public static void fillPhone(String phone){
        setInput(BillingConstants.PHONE_INPUT_XPATH, phone);
    }
    public static void fillCountry(String country){
        click(BillingConstants.COUNTRY_DROPDOWN_XPATH);
        setInput(BillingConstants.COUNTRY_DROPDOWN_INPUT_XPATH, country);
        click(BillingConstants.DROPDOWN_MATCH_XPATH);
    }
    public static void fillAddress(String addres){
        setInput(BillingConstants.ADDRESS_INPUT_XPATH, addres);
    }
    public static void fillCity(String city){
        setInput(BillingConstants.CITY_INPUT_XPATH, city);
    }
    public static void fillCounty(String county){
        click(BillingConstants.COUNTY_DROPDOWN_XPATH);
        setInput(BillingConstants.COUNTY_DROPDOWN_INPUT_XPATH, county);
        click(BillingConstants.DROPDOWN_MATCH_XPATH);
    }
    public static void fillPostcode(String postcode){
        setInput(BillingConstants.POSTCODE_INPUT_XPATH, postcode);
    }
    public static void clickPlaceOrder(){
        click(ShopConstants.PLACE_ORDER_BUTTON_XPATH);
        closeAds();
    }




}
