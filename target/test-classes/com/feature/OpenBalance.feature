Feature: Navia Online Trading Market Open Balance Check

Scenario: Check the Open Balance Leader deposit
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    And User Click Funds and Click Ledger Deposite Amount
    And User Click and Select latest Obligation
    