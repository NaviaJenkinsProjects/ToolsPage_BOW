Feature: Stock Transaction – Buy, Convert, and Sell

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
And User Buy The "MITTAL" Stock For "NSE" to Option
And User Select the The "Market" Order
And User Click the "BUY" Options for Stock
And User Click The Position Page and Take the ScreenSort
And User Verify The Today P/L Value Check
    

Scenario: User Square-off any Scrip
When Navigate to home page
And User Navigate The "Position" Top option
And User Covert The "MITTAL" Stock
And User Covert The "MITTAL" Stock
And User Click The "MITTAL" Stock to "Square-off" Options
And User Navigate The "Holdings" Top option
And User Slect The "EASEMYTRIP" Stock and "Sell" Order


Scenario: User Chart any Scrip
When Navigate to home page
And User Navigate The "Position" Top option
And User Seleck The Chart "MITTAL" Stock
And User Add/Remove The Indicators in "Aroon" Stock
And User Slect the "1" Stock in Chart
And User Add The Indicators in "Chop Zone" Stocks
And User Slect the "2" Stock in Chart
And User Slect the "3" Stock in Chart
And User Remove The Indicators in "Chop Zone" Stocks






  