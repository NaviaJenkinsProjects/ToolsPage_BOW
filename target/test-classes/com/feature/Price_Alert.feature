
Feature: Price Alert the Application

 Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    Then  Next Page Shown

Scenario: User Verify The Price Alert - Lesser then - functionality

 When Navigate to home page 
And User Click The Search Options "EICHERMOT" button
And User Select The "Stocks" Stock Option
And User Click The Stock "EICHERMOT" and "NSE" button
And User Select The "Price Alert" Icon button
And User Selcth The "Lesser then" Option and Send The "3" Value
And User Click The Save button
Then Next Page Shown

Scenario: User Verify The Price Alert - Greater then - functionality

 When Navigate to home page 
And User Click The Search Options "TATASTEEL" button
And User Select The "Stocks" Stock Option
And User Click The Stock "TATASTEEL" and "BSE" button
And User Select The "Price Alert" Icon button
And User Selcth The "Greater then" Option and Send The "2" Value
And User Click The Save button
Then Next Page Shown


Scenario: User Add The - Stock - functionality

 When Navigate to home page 
And User MouseOver Dashboard and Click Price Alert
And User Select The Alert Tab "Current" Options
And User Select The "TATASTEEL" Option All Datas To Print
And User Click The "TATASTEEL" Option To Remove button
And User Select The "EICHERMOT" Option All Datas To Print
   #And User Click The "EICHERMOT" Option To Remove button



















