
Feature: Guest Login Page

Scenario: User Login to Guest Id

Given  User Launch The Url
When  User Click The Login As Guest button
And  User Click The Name 
And  User Click The Email
And  User Click The MobileNumber
And  User Click The Agree Icon
And  User Click The Login button in Guest login button
Then  Next Page Shown

When User Send The Mobile Otp and Verification 
And  User Click The Login button
Then  Next Page Shown

Scenario: User Check  - Charts- functionality    
    And User Click the Watch List
    And User mouse over the scrip "Nifty 50"
    And User Click the Charts
    And User Click the Candles Icon
    And User Choose Candle "candle"
    And User Click the Mintues
    And User Choose One Minute
    And Verify One Minute Feed Connection Value and Wait One Minute Very Feed Connection Changes
    And User Click the Five Minute
    And Verify Five Minute Feed Connection Valuebb
    And User Click One Day 
    And Verify One Day Feed Connection Value and Wait One Minute Very Feed Connection Changes














