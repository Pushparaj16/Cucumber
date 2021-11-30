Feature: Validation of Adactin Web Application

Background:
		Given User launch Adactin web application
    When User enters valid username and password
    And User clicks Login button
    Then user validate search hotel page is displayed

  Scenario: TC01_Validation of order id in Adactin Web Application
    When User selects location, hotels, room type in search hotel page
    And clicks Search button
    Then user validate search results page is displayed
    When User clicks on radio button
    And clicks Continue button
    Then user validate book hotel page is displayed
    When User enter valid first name, last name, Billing address
    When User enters valid credit card number, credit card type, expiry date and enters valid cvv
    And clicks Book Now button
    Then user validate order id is displayed

  Scenario Outline: TC02_Validation of order id with multiple orders in Adactin Web Application
    
    When user selects valid "<location>", "<hotels>" and "<roomType>" in search hotel page
    And clicks Search button
    Then user validate search results page is displayed
    When User clicks on radio button
    And clicks Continue button
    Then user validate book hotel page is displayed
    When user enters valid "<firstName>", "<lastName>" and "<billingAddress>"
    When user enters valid "<creditCardNumber>", "<creditCardType>", "<month>", "<year>" and "<cvvNumber>"
    And clicks Book Now button
    Then user validate order id is displayed

    Examples: 
      | location    | hotels         | roomType     | firstName | lastName | billingAddress             | creditCardNumber  | creditCardType | month | year | cvvNumber |
      | Melbourne   | Hotel Creek    | Standard     | Mitchel   | Marsh    | No.1, melbourne, Australia |  3143478290048573 | VISA           |     8 | 2021 |       345 |
      | Brisbane    | Hotel Hervey   | Double       | David     | Warner   | No.45 sydney, brisbane     |  6489046829000873 | AMEX           |    10 | 2022 |       384 |
      | Adelaide    | Hotel Cornice  | Deluxe       | Steven    | Smith    | No.9, colorado             | 97448910839450984 | MAST           |    12 | 2019 |       000 |
      | Sydney      | Hotel Sunshine | Super Deluxe | Ricky     | Pointing | No.343, kangaroostreet     |  1110999749637901 | OTHR           |     2 | 2020 |       444 |
      | Los Angeles | Hotel Cornice  | Deluxe       | MS        | Dhoni    | No,7, Jamshedpur, Ranchi   |  0000738847998640 | VISA           |     1 | 2022 |       034 |
