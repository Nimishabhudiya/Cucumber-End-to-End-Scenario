@EndtoEnd

Feature:User able to purchase product From "demo.nopcommerce website."

  Scenario: User able to navigate the books and purchase books successfully
    Given I am on the books category page
    When I click on sortby
    And I select AtoZ from Sort by DropdownList
    And I click on display
    And I select 3 from Display DropdownList
    And I Click on AddtoCart Button on Firstproduct
    And I go to the Shopping cart
    And I Click in Tearms service box
    And I Click on Checkout Button
    And I Click on Checkoutguest Button
    And I enter text in FirstName Field as "Nimisha"
    And I enter text in LastName Field as "Bhudiya"
    And I enter Email in email field as "advcg@gmail.com"
    And I enter address
    And I click On country
    And I Select India country from Country DropDownList.
    And I enter City Name
    And I enter Adrees 1 and Address 2 in their field
    And I enter ZipCode as "370020"
    And I enter PhoneNumber as "1136547895"
    And I enter FaxNumber as "1-256-687"
    And I Click on continue Button
    And I select Second Day option from given 3 option
    And I Click on continue2 Button
    And I select Credit card as a Type of Card
    And I click on continue
    And I click on type card droplist
    And I select Visa type credit card
    And I enter CardholderName
    And I enter 16 digit CardNumber
    And I select Expiry date & Month from DropdownList
    And I select Expire year from Dropdownlist
    And I enter 3 digit CardCode
    And I Click on continue button
    And I Click on confirm Button
    Then I able to proccessed my  order successfully and get the order number as "ORDER NUMBER: 1031"

