Feature: Verify the Holding Calculations

Scenario: Calculate Current , Investment , Total P/V Value and P/V
Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Login Again
  
  Scenario: Calculate Current  
    When Navigate to home page
    And User Click Holdings
    And Verify Adding All Stock Investment Value is Equal to Investment Value
    And Verify Adding All Stock Curr Value is Equal to Current Value
    And Verify Adding All Stock P/L Value is Equal to P/L
    And Verify Adding All Stock Today P/L Value is Equal to Today P/L Value
    And Verify Calculate Current Value Subtract Investment Value Its Equal to P/L Value
    
