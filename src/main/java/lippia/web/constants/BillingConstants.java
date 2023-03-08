package lippia.web.constants;

public class BillingConstants {

    //Billing Details
    public static final String ADDITIONAL_DETAILS_VERIFICATION_TEXT = "xpath://h3[contains(text(),'Additional Information')]";
    public static final String BILLING_DETAIL_VALIDATE_TEXT = "xpath://h3[contains(text(),'Billing Details')]";
    public static final String FIRST_NAME_INPUT = "xpath://input[@id='billing_first_name']";
    public static final String LAST_NAME_INPUT = "xpath://input[@id='billing_last_name']";
    public static final String EMAIL_INPUT = "xpath://input[@id='billing_email']";
    public static final String PHONE_INPUT = "xpath://input[@id='billing_phone']";
    public static final String ADDRESS_INPUT = "xpath://input[@id='billing_address_1']";
    public static final String COUNTRY_DROPDOWN = "xpath://span[@id='select2-chosen-1']";
    public static final String COUNTRY_DROPDOWN_INPUT = "xpath://input[@id='s2id_autogen1_search']";
    public static final String DROPDOWN_MATCH = "xpath://span[@class='select2-match']";
    public static final String CITY_INPUT = "xpath://input[@id='billing_city']";
    public static final String COUNTY_DROPDOWN = "xpath://span[@id='select2-chosen-2']";
    public static final String COUNTY_DROPDOWN_INPUT = "xpath://input[@id='s2id_autogen2_search']";
    public static final String POSTCODE_INPUT = "xpath://input[@id='billing_postcode']";
}