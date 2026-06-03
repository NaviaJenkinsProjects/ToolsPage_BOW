Feature: Navia Account page Theme , My Profile , N Coins , Support , Keyboard shortcut, Tour App , App Feedback ,terms and Conditions and logout


Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again

    
Scenario: User Change the Theme
When Navigate to home page
When User Click Account page
When User Click "Light" and Change the Theme Automatically

Scenario: Check the My Profile Functionality

When Navigate to home page
When User Click Account page
When User Click My Profile
And User Click Email ,Phone Eye icon check button working or not
And User Click Email edit and navigate to Rekyc page get the Name ,UCC,Father/spouse name , Cilent ID and Pan
And User Scroll Down and Click Account Eye Icon
And User Click Phone Edit Icon and Check
And User Click Account Edit Icon
And User Click Bank Details Edit Icon

Scenario: Check N coins Functionality

When Navigate to home page
When User Click Account page
When User Click N Coins
And Scroll Down Check the Brokerage & Charges

Scenario: Check Support Functionality

When Navigate to home page
When User Click Account page
When User Click Support and Check

Scenario: Check Keyboard Shortcut

When Navigate to home page
When User Click Account page
When User Click Keyboard Shortcut
When User getting all Navigation and MarketWatch Data
When User Press Alt + O navigate to Pending Orders
When User Press Alt + A navigate to Dashboard
When User Press Alt + P navigate to Position
When User Press Alt + T navigate to Trades
When User Press Alt + H navigate to Holdings
When User Press Alt + F navigate to Funds
When User Press Alt + J navigate to Profile
When User Press Alt + A navigate to Dashboard
When User Press Alt + Down or Up Arrow its navigate to marketwatch select a scrip
When User Press Alt + B buy a scrip
When User Press Alt + S Sell a scrip
                                  # #When User Press Alt + C Open a chart

Scenario: Check Tour App
When Navigate to home page
When User Click Account page
When User Click Tour App and check


Scenario: Check Terms and Conditions

When Navigate to home page
When User Click Account page
When User Click terms and Conditions and Check



 



