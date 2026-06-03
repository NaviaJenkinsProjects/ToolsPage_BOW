Feature: Verify Activity log in Navia web

Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    
    
Scenario: User buy any Scrip

When Navigate to home page
When User Search "BSE","SUNDARAM" Scrip add in MarketWatch
And User mouseover "BSE","SUNDARAM" Scrip and click buy button
And User Select "Delivery / Carry forward " and Choose "Limit" and click Buy Order
And User Click Order Confirmation and Check Order Placed or Insufficient fund


Scenario: User Click Activity and check the log

When User Check the Exchange , Symbol , Series , Qty , Price , B/S , Trig Price , Produt and LUT
And User Check the Order Number , DQty , Book Type , Duration
And User Check Remarks , Set Deposit , Used Deposit , Prev Used, UR_PL and R_PL
And User Click Exchange and Filter "BSE"
And User Click Symbol and Filter "SUNDARAM"
And User Click Series and Filter "B"
And User Click B/S and Filter "Buy"
And User Click Product and Filter "CNC"
And User Click The Position Page and Take the ScreenSort

Scenario: User buy any Scrip

When Navigate to home page
And User Navigate The "Position" Top option
And User Verify The Today P/L Value Check
And User Select The Stock to Chart Open
And User Add/Remove The Indicators in "Aroon" Stock


Scenario: User Check The Market Watch List

When Navigate to home page
And User Create The "Test" MarketList
And User Select The "Test" MarketWatch List
    And User click the search box
    And User Search any "SWIGGY" Script
    And User Mouse Over and Add a Script "SWIGGY"
    And User POP Up Message Appear Verify POP UP
    And User Remove The "SWIGGY" Stock
    
And User Modify The "Navia" MarketList
And User Select The "Test" MarketWatch List
And User Delete The "Navia" MarketList















