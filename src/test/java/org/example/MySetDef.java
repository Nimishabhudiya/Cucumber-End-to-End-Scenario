package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MySetDef extends BasePage {

    Books books = new Books();

    @Given("^I am on the books category page$")
    public void i_am_on_the_books_category_page() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://demo.nopcommerce.com/books");
        System.out.println("user successfully navigate on book");

    }

    @When("^I click on sortby$")
    public void i_click_on_sortby()  {
        books.clickSortBy();

    }

    @When("^I select AtoZ from Sort by DropdownList$")
    public void i_select_AtoZ_from_Sort_by_DropdownList()  {
        books.AtoZ();

    }

    @When("^I click on display$")
    public void i_click_on_display()  {
        books.clickDisplay();
    }

    @When("^I select (\\d+) from Display DropdownList$")
    public void i_select_from_Display_DropdownList(int arg1) {
        books.Display();

    }

    @When("^I Click on AddtoCart Button on Firstproduct$")
    public void i_Click_on_AddtoCart_Button_on_Firstproduct() {
        books.AddCart();

    }

    @When("^I go to the Shopping cart$")
    public void i_go_to_the_Shopping_cart() {
        books.ShoppingCart();

    }

    @When("^I Click in Tearms service box$")
    public void i_Click_in_Tearms_service_box()  {
        books.AgreeButton();
    }

    @When("^I Click on Checkout Button$")
    public void i_Click_on_Checkout_Button() {
        books.CheckoutButton();

    }

    @When("^I Click on Checkoutguest Button$")
    public void i_Click_on_Checkoutguest_Button() {
        books.CheckoutGuest();

    }

    @When("^I enter text in FirstName Field as \"([^\"]*)\"$")
    public void i_enter_text_in_FirstName_Field_as(String arg1) {
        books.FirstName();

    }

    @When("^I enter text in LastName Field as \"([^\"]*)\"$")
    public void i_enter_text_in_LastName_Field_as(String arg1){
        books.LastName();

    }

    @When("^I enter Email in email field as \"([^\"]*)\"$")
    public void i_enter_Email_in_email_field_as(String arg1) {
        books.Email();

    }
    @When("^I enter address$")
    public void i_enter_address() {
       books.Address();
    }


    @When("^I click On country$")
    public void i_click_On_country(){
        books.clickCountry();

    }

    @When("^I Select India country from Country DropDownList\\.$")
    public void i_Select_India_country_from_Country_DropDownList()  {
        books.Country();

    }

    @When("^I enter City Name$")
    public void i_enter_City_Name() {
        books.CityName();

    }

    @When("^I enter Adrees (\\d+) and Address (\\d+) in their field$")
    public void i_enter_Adrees_and_Address_in_their_field(int arg1, int arg2)  {
        books.Addresses();

    }

    @When("^I enter ZipCode as \"([^\"]*)\"$")
    public void i_enter_ZipCode_as(String arg1)  {
        books.ZipCode();

    }

    @When("^I enter PhoneNumber as \"([^\"]*)\"$")
    public void i_enter_PhoneNumber_as(String arg1){
        books.PhoneNumber();

    }

    @When("^I enter FaxNumber as \"([^\"]*)\"$")
    public void i_enter_FaxNumber_as(String arg1) {
        books.FaxNumber();

    }

    @When("^I Click on continue Button$")
    public void i_Click_on_continue_Button()  {
        books.Continue1();

    }

    @When("^I select Second Day option from given (\\d+) option$")
    public void i_select_Second_Day_option_from_given_option(int arg1)  {
        books.SecondDay();

    }
    @When("^I Click on continue2 Button$")
    public void i_Click_on_continue2_Button() {
        books.Continue2();

    }

    @When("^I select Credit card as a Type of Card$")
    public void i_select_Credit_card_as_a_Type_of_Card() {
        books.TypeCreditCard();

    }

    @When("^I click on continue$")

    public void i_click_on_continue(){
        books.continue3();

    }

    @When("^I click on type card droplist$")
    public void i_click_on_type_card_droplist()  {
        books.SelectCardType();

    }

    @When("^I select Visa type credit card$")
    public void i_select_Visa_type_credit_card() {
        books.VisaCard();

    }

    @When("^I enter CardholderName$")
    public void i_enter_CardholderName()  {
        books.CardHolderName();

    }

    @When("^I enter (\\d+) digit CardNumber$")
    public void i_enter_digit_CardNumber(int arg1) {
        books.CardNumber();

    }

    @When("^I select Expiry date & Month from DropdownList$")
    public void i_select_Expiry_date_Month_from_DropdownList() {
        books.DateAndmonth();

    }

    @When("^I select Expire year from Dropdownlist$")
    public void i_select_Expire_year_from_Dropdownlist() {
        books.ExpireYear();

    }

    @When("^I enter (\\d+) digit CardCode$")
    public void i_enter_digit_CardCode(int arg1)  {
        books.CardCode();

    }

    @When("^I Click on continue button$")
    public void i_Click_on_continue_button() {
        books.Continue4();

    }

    @When("^I Click on confirm Button$")
    public void i_Click_on_confirm_Button()  {
        books.Confirm();
    }

    @Then("^I able to proccessed my  order successfully and get the order number as \"([^\"]*)\"$")
    public void i_able_to_proccessed_my_order_successfully_and_get_the_order_number_as(String arg1) {

    }

}
