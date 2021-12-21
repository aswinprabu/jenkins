Feature: Validation of OrderId in AdactIn hotel Web Application 

Background:
Given User launch AdactIn Hotel Web Application

Scenario: TA01_Validation of OrderID in Booking Confirmation Page with valid inputs
Then User verify whether login page is displayed
When User enters valid username and valid password
And User clicks on Login Button
Then User verify Search Hotel Page is displayed
When User enters valid location,valid hotels,valid roomtype, valid numberofrooms,valid checkindate,valid checkoutdate, valid adultsperroom,valid childperroom
And User clicks on Search Button
Then User verify Select Hotel page is displayed
And User clicks on select radio Button
And User clicks on Continue Button
Then User verify Book Hotel Page is displayed
When User enters valid firstname, valid lastname, valid creditcardnumber, valid creditcardtype, valid expirymonth,valid expiryyear, valid cvvnumber
And User clicks on Book now Button
Then User verify Booking order page is displayed and  OrderId is validated

Scenario Outline: TA02_Validation of OrderID in Booking Confirmation Page with valid inputs

Then User verify whether login page is displayed
When User enters "<userName>","<passWord>"
And User clicks on Login Button
Then User verify Search Hotel Page is displayed
When User enters valid "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childPerRoom>"
And User clicks on Search Button
Then User verify Select Hotel page is displayed
And User clicks on select radio Button
And User clicks on Continue button
Then User verify Book Hotel Page is displayed
When User enters "<firstName>","<lastName>","<billingAddress>","<creditCardNumber>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
And User clicks on Book now Button
Then User verify Booking order page is displayed and  OrderId is validated

Examples:
|userName|passWord|location|hotels|roomType|numberOfRooms|checkInDate|checkOutDate|adultsPerRoom|childPerRoom|firstName|lastName|billingAddress|creditCardNumber|creditCardType|expiryMonth|expiryYear|cvvNumber|
|aswinprabu9444|aswinprabu9444|Adelaide|Hotel Cornice|Super Deluxe|2 - Two|18/12/2021|19/12/2021|4 - Four|3 - Three|Karan|Haridoss|Vellore|1234567890123456|Master Card|1|2022|444|
#|aswinprabu9444|aswinprabu9444|Sydney|Hotel Creek|Standard|2 - Two|19/12/2021|20/12/2021|1 - One|1 - One|Aswin|Prabu|Old Trafford, London|1234567890123456|American Express|1|2022|444|
#|aswinprabu9444|aswinprabu9444|London|Hotel Sunshine|Double|3 - Three|20/12/2021|21/12/2021|2 - Two|1 - One|Rafi|Mehar|Korukkupet, Chennai|1234567890123456|VISA|4|2022|444|
#|aswinprabu9444|aswinprabu9444|Brisbane|Hotel Hervey|Deluxe|5 - Five|21/12/2021|22/12/2021|3 - Three|2 - Two|Murali|NV|Chennai|1234567890123456|VISA|5|2022|444|
#|aswinprabu9444|aswinprabu9444|Paris|Hotel Creek|Double|9 - Nine|22/12/2021|23/12/2021|4 - Four|4 - Four|Ram|Sakthi|Kallakuruchi|1234567890123456|American Express|10|2022|444|

 

