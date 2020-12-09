$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Functionality of Adactin Application",
  "description": "",
  "id": "booking-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the user is able to login the application",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-login-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launches the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the valid username in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the valid password in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User verifies whether HomePage navigates to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launches_the_application()"
});
formatter.result({
  "duration": 18332430300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_username_in_the_username_field()"
});
formatter.result({
  "duration": 1147341400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_password_in_the_password_field()"
});
formatter.result({
  "duration": 184553800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 1923827900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_HomePage_navigates_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 32600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify the user is able search hotels in the application",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-search-hotels-in-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User able to select location from the location dropdown field",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User able to select hotels from the hotel dropdown field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User able to select room type from the room type dropdown field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User able to select number of rooms from the number of rooms dropdown field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters valid checkin date in the checkin field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters valid checkout date in the checkout field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User able to select number of adults in adults per room field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User able to select number of child in children per room field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User verifies whether Search Page navigates to Search Comfirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_able_to_select_location_from_the_location_dropdown_field()"
});
formatter.result({
  "duration": 676989800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_able_to_select_hotels_from_the_hotel_dropdown_field()"
});
formatter.result({
  "duration": 179470600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_able_to_select_room_type_from_the_room_type_dropdown_field()"
});
formatter.result({
  "duration": 236709600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_able_to_select_number_of_rooms_from_the_number_of_rooms_dropdown_field()"
});
formatter.result({
  "duration": 121331100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_checkin_date_in_the_checkin_field()"
});
formatter.result({
  "duration": 171766900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_checkout_date_in_the_checkout_field()"
});
formatter.result({
  "duration": 192538800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_able_to_select_number_of_adults_in_adults_per_room_field()"
});
formatter.result({
  "duration": 185080100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_able_to_select_number_of_child_in_children_per_room_field()"
});
formatter.result({
  "duration": 171082100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_search_button()"
});
formatter.result({
  "duration": 844589600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Search_Page_navigates_to_Search_Comfirmation_Page()"
});
formatter.result({
  "duration": 28200,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify the user is able to select hotel in the application",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-select-hotel-in-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "User able to choose the radio button to confirm the search",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User clicks on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User verifies whether Search Page navigates to Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_able_to_choose_the_radio_button_to_confirm_the_search()"
});
formatter.result({
  "duration": 215794400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_continue_button()"
});
formatter.result({
  "duration": 662280400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Search_Page_navigates_to_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 25900,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Verify the user is able to book a hotel in the application",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-book-a-hotel-in-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "User enters the valid first name in the first name field",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User enters the valid last name in the last name field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User enters the valid billing address in the billing address field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enters the valid credit card details in the credit card number field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User able to choose credit card type from the credit card type dropdown field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User able to choose select month in the month dropdown field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User able to choose select year in the year dropdown field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User enters the valid cvv number in the CVV field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User clicks on the book now button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User verifies whether Book A Hotel Page navigates to Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_first_name_in_the_first_name_field()"
});
formatter.result({
  "duration": 331424400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_last_name_in_the_last_name_field()"
});
formatter.result({
  "duration": 161251800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_billing_address_in_the_billing_address_field()"
});
formatter.result({
  "duration": 207635700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_credit_card_details_in_the_credit_card_number_field()"
});
formatter.result({
  "duration": 189781300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_able_to_choose_credit_card_type_from_the_credit_card_type_dropdown_field()"
});
formatter.result({
  "duration": 159753500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_able_to_choose_select_month_in_the_month_dropdown_field()"
});
formatter.result({
  "duration": 170080300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_able_to_choose_select_year_in_the_year_dropdown_field()"
});
formatter.result({
  "duration": 177910900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enters_the_valid_cvv_number_in_the_CVV_field()"
});
formatter.result({
  "duration": 177925700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_book_now_button()"
});
formatter.result({
  "duration": 144534100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Book_A_Hotel_Page_navigates_to_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 28400,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Verify the user is able confirm the details in the application",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-confirm-the-details-in-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "User clicks on the My Itinerary button",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "User verifies whether Booking Confirmation Page navigates to Booked Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_My_Itinerary_button()"
});
formatter.result({
  "duration": 6474044300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Booking_Confirmation_Page_navigates_to_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 43300,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Verify the user is able to view the itinerary details in the application",
  "description": "",
  "id": "booking-functionality-of-adactin-application;verify-the-user-is-able-to-view-the-itinerary-details-in-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "User clicks on the logout button",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User verifies whether Booked Itinerary Page navigates to Successfully Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_logout_button()"
});
formatter.result({
  "duration": 555806400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_Booked_Itinerary_Page_navigates_to_Successfully_Logout_Page()"
});
formatter.result({
  "duration": 39200,
  "status": "passed"
});
});