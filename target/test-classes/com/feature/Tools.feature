Feature: Dashboard Tools Functionality

Scenario: Login Navia
    Given User Navigate to Navia 
    When User Click login with client code
    And User Enter Client Code
    And User  Enter Password
    And User Click Agree CheckBox
    And User Click Login button
    And User Click Otp Verification and enter manualy
    And User Click Login Again
    
            
Scenario: Verify Margin Calculator

    When Navigate to home page
    And User MouseOver Dashboard and Click Tools
    And user Mouse Over The Element
    And User Click Tools "Margin Calculator"
    And User Select Exchange "MCXFO"
    And User enter net quantity "50"
    And User Select Buy or Sell "SELL"
    And User Click Add
    And Again User Select Exchange "BSEFO"
    And Again User enter net quantity "50"
    And Again User Select Buy or Sell "BUY"
    And Again User Click Add
    And Verify Initial Margin , Exposure margin and Net Premium is equal to total Amount Required

Scenario: Verify Trusted Partners

    When Navigate to home page
    And User MouseOver Dashboard and Click Tools
    And user Mouse Over The Element
    And User Click Tools "Trusted Partners"
    And User Scroll Down and Up
    And User Verify Shown All API Partners
    And User Click Algo-Bridge Verify 
    And User Click BackTesting and Verify
    And User Click Community and Verify
    And User Click Low Code and No Code and Verify
    And User Click Paper Trading and Verify
    And User Click Trading and Verify
    And User Click Other and Verify
    
Scenario: Verify API

    When Navigate to home page
    And User MouseOver Dashboard and Click Tools
    And user Mouse Over The Element
    And User Click Tools "API"   
    And User Scroll Down to FAQs 
    And User click Plus One by One 
 

    
Scenario: Verify Blogs

    When Navigate to home page
    And User MouseOver Dashboard and Click Tools  
    And user Mouse Over The Element 
    And User Click Tools "Blogs" 
    And User Verify Blog Page Loading

    
Scenario: Verify Ban List
    
    When Navigate to home page
    And User MouseOver Dashboard and Click Tools
    And user Mouse Over The Element
    And User Click Tools "Ban List"
    And User getting Securities in Ban Data
    And User Click Possible Entrance
    And User Click Possible Exits
    And User Search Symbols "BPCL" 
    And User Click Clear in Search Symbols
    And User Click All and getting data of stock , Previous and Current
    
#Scenario: Verify Cross Currency
#
    #When Navigate to home page
    #And User MouseOver Dashboard and Click Tools
    #And user Mouse Over The Element
    #And User Click Tools "Cross Currency"  
    #And User Getting Currency Values for "INR"
    #
#Scenario: Verify Forex Heat map
    #
    #When Navigate to home page
    #And User MouseOver Dashboard and Click Tools
    #And user Mouse Over The Element
    #And User Click Tools "Forex Heat map"  
    #And User Getting forex heat map Values for "INR"
    
Scenario: Verify Global

    When Navigate to home page
    And User MouseOver Dashboard and Click Tools
    And user Mouse Over The Element
    And User Click Tools "Global"  
    And User Verify Global Page
    
Scenario: Verify Buy Back
    
    When Navigate to home page
    And User MouseOver Dashboard and Click Tools
    And user Mouse Over The Element
    And User Click Tools "Buy Back"  
    And User Verify Buy Back Page
    

 
Scenario: Verify Demo Videos

    When Navigate to home page
    When User MouseOver Dashboard and Click Tools
    And user Mouse Over The Element
    And User Click Tools "Demo Videos" 
    And User Scroll Down and Up Verify Navia App Demo Videos Logo
    

    
  Scenario: Verify World Market

    When Navigate to home page
    And User MouseOver Dashboard and Click Tools
    And user Mouse Over The Element
    And User Click Tools "World Market"
    And User Select world indices , commodities ,  forex or crypto "Forex"
    And User Choose 1day , 1month , 3month , 1year , 5year or All "5Y"
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    #Scenario: Verify Univ
#
    #When Navigate to home page
    #And User MouseOver Dashboard and Click Tools
    #And user Mouse Over The Element
    #And User Click Tools "Univ" 
    #And User Select "INVESTMENT BASICS"
    #And Scroll Down and up take Investment Basics Image
    #And User MouseOver Dashboard and Click Tools
    #And User Click Tools "Univ" 
    #And User Scroll Down and up take Asset Classes Image
    #And User MouseOver Dashboard and Click Tools
    #And User Click Tools "Univ"
    #And User Scroll Down and up take Investment vehicles Image
    #And User MouseOver Dashboard and Click Tools
    #And User Click Tools "Univ"
    #And User navigate to fundamental analysis page and take  fudamental analysis Image
    #And User MouseOver Dashboard and Click Tools
    #And User Click Tools "Univ"
    #And User navigate to technical analysis page and take  Technical analysis Image
    #And User MouseOver Dashboard and Click Tools
    #And User Click Tools "Univ"
    #And User navigate to all about option analysis page and take  All About Option Image
    #And User MouseOver Dashboard and Click Tools
    #And User Click Tools "Univ"
    #And User navigate to portfolio and strategies page and take  Protfolio and Strategies Image
   