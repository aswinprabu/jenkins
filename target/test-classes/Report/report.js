$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AdactIn.feature");
formatter.feature({
  "name": "Validation of OrderId in AdactIn hotel Web Application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User launch AdactIn Hotel Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_AdactIn_Hotel_Web_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TA01_Validation of OrderID in Booking Confirmation Page with valid inputs",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User verify whether login page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_whether_login_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters valid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_username_and_valid_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Search Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Search_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters valid location,valid hotels,valid roomtype, valid numberofrooms,valid checkindate,valid checkoutdate, valid adultsperroom,valid childperroom",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_location_valid_hotels_valid_roomtype_valid_numberofrooms_valid_checkindate_valid_checkoutdate_valid_adultsperroom_valid_childperroom()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Select Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Select_Hotel_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on select radio Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_select_radio_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Continue_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Book Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Book_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters valid firstname, valid lastname, valid creditcardnumber, valid creditcardtype, valid expirymonth,valid expiryyear, valid cvvnumber",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_firstname_valid_lastname_valid_creditcardnumber_valid_creditcardtype_valid_expirymonth_valid_expiryyear_valid_cvvnumber()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Book now Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Book_now_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Booking order page is displayed and  OrderId is validated",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Booking_order_page_is_displayed_and_OrderId_is_validated()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "TA02_Validation of OrderID in Booking Confirmation Page with valid inputs",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User verify whether login page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters \"\u003cuserName\u003e\",\"\u003cpassWord\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Search Hotel Page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters valid \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomType\u003e\",\"\u003cnumberOfRooms\u003e\",\"\u003ccheckInDate\u003e\",\"\u003ccheckOutDate\u003e\",\"\u003cadultsPerRoom\u003e\",\"\u003cchildPerRoom\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on Search Button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Select Hotel page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on select radio Button",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Book Hotel Page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters \"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003cbillingAddress\u003e\",\"\u003ccreditCardNumber\u003e\",\"\u003ccreditCardType\u003e\",\"\u003cexpiryMonth\u003e\",\"\u003cexpiryYear\u003e\",\"\u003ccvvNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on Book now Button",
  "keyword": "And "
});
formatter.step({
  "name": "User verify Booking order page is displayed and  OrderId is validated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord",
        "location",
        "hotels",
        "roomType",
        "numberOfRooms",
        "checkInDate",
        "checkOutDate",
        "adultsPerRoom",
        "childPerRoom",
        "firstName",
        "lastName",
        "billingAddress",
        "creditCardNumber",
        "creditCardType",
        "expiryMonth",
        "expiryYear",
        "cvvNumber"
      ]
    },
    {
      "cells": [
        "aswinprabu9444",
        "aswinprabu9444",
        "Adelaide",
        "Hotel Cornice",
        "Super Deluxe",
        "2 - Two",
        "18/12/2021",
        "19/12/2021",
        "4 - Four",
        "3 - Three",
        "Karan",
        "Haridoss",
        "Vellore",
        "1234567890123456",
        "Master Card",
        "1",
        "2022",
        "444"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User launch AdactIn Hotel Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_AdactIn_Hotel_Web_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TA02_Validation of OrderID in Booking Confirmation Page with valid inputs",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User verify whether login page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_whether_login_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters \"aswinprabu9444\",\"aswinprabu9444\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Search Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Search_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters valid \"Adelaide\",\"Hotel Cornice\",\"Super Deluxe\",\"2 - Two\",\"18/12/2021\",\"19/12/2021\",\"4 - Four\",\"3 - Three\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Select Hotel page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Select_Hotel_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on select radio Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_select_radio_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Book Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Book_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters \"Karan\",\"Haridoss\",\"Vellore\",\"1234567890123456\",\"Master Card\",\"1\",\"2022\",\"444\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Book now Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Book_now_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify Booking order page is displayed and  OrderId is validated",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verify_Booking_order_page_is_displayed_and_OrderId_is_validated()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});