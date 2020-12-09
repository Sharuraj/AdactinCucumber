Feature: Booking Functionality of Adactin Application

Background:
Given User launches the application
When User log into the application

@SmokeTest
  Scenario Outline: Verify the user is able to login the application
    Given User launches the application
    When User enters the valid "<username>" in the username field
    And User enters the valid "<password>" in the password field
    And User clicks on the login button
    Then User verifies whether HomePage navigates to Search Hotel Page

Examples:
|username|password|
|Hema|123456|
|raj|111|
|Sharuraj|mypass123|

  Scenario: Verify the user is able search hotels in the application
    When User able to select location "7" as "index" from the location dropdown field
    And User able to select hotels "Hotel Hervey" as "value" from the hotel dropdown field
    And User able to select roomtype "3" as "index" from the room type dropdown field
    And User able to select number of rooms "1" as "value" from the number of rooms dropdown field
    And User enters valid checkin date in the checkin field
    And User enters valid checkout date in the checkout field
    And User able to select number of adults "2 - Two" as "text" in adults per room field
    And User able to select number of child "1" as "value" in children per room field
    And User clicks on the search button
    Then User verifies whether Search Page navigates to Search Comfirmation Page

  Scenario: Verify the user is able to select hotel in the application
    When User able to choose the radio button to confirm the search
    And User clicks on the continue button
    Then User verifies whether Search Page navigates to Book A Hotel Page

  Scenario: Verify the user is able to book a hotel in the application
    When User enters the valid "Sharikaa" in the firstname field
    And User enters the valid "Rajesh" in the lastname field
    And User enters the valid "1,Lakeview Apartments,Texas" in the billingaddress field
    And User enters the valid "7564823467894512" in the creditcardnumber field
    And User able to choose creditcardtype "MAST" as "value" from the creditcardtype dropdown field
    And User able to choose expmonth "11" as "value" in the month dropdown field
    And User able to choose expyear "2021" as "text" in the year dropdown field
    And User enters the valid "595" in the CVV field
    And User clicks on the book now button
    Then User verifies whether Book A Hotel Page navigates to Booking Confirmation Page

  Scenario: Verify the user is able confirm the details in the application
  When User clicks on the My Itinerary button
  Then User verifies whether Booking Confirmation Page navigates to Booked Itinerary Page

  Scenario: Verify the user is able to view the itinerary details in the application
  When User clicks on the logout button
  Then User verifies whether Booked Itinerary Page navigates to Successfully Logout Page

  