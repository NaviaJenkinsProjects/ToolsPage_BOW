
Feature: Manage Stocks in Watchlist

Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    
Scenario: Add & Remove a stock to the watchlist

    When Navigate to home page
    And User Click The "Pre-Market" Market watchlist
    And User Search Any "TCS" Stock and "BSE" Option
    And User Click The Add and Remove The Stock

    And User Search Any "WIPRO" Stock and "NSE" Option
    And User Click The Add and Remove The Stock
    
 Scenario: Add & Remove Current Feature in BSE & NSE the watchlist

    When Navigate to home page
    And User Click The "Pre-Market" Market watchlist
    And User Click The Current "SENSEX" Futures Option 
    And User Select The Current "BSE" Futures Option  
    
    And User Click The Current "NIFTY" Futures Option 
    And User Select The Current "NSE" Futures Option  
    
  Scenario: Add & Remove Current Feature in MCX the watchlist

    When Navigate to home page
    And User Click The "Pre-Market" Market watchlist   
    And User Click The Current "MCX" Futures Option
    And User Select The Current "NSE" Futures Options
    
    And User Click The Current "MCX" Futures Option
    And User Select The Current "MCX" Futures Options

  Scenario: Add & Remove Current Option in NSE & BSE the watchlist

    When Navigate to home page
    And User Click The "Pre-Market" Market watchlist
    And User Click The Current "Sensex" Option
    And User Click The Add and Remove The Stock
    
    And User Click The Current "Nifty 50" Option
    And User Click The Add and Remove The Stock
    
    












