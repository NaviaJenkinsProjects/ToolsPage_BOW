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

When User Click The Profile 
And  User Click The Theme button
And  User Click The Niftyfifty Icon
And  User Click The Chart button
Then  Next Page Shown

#When User Click The Chart Minutes button 
#And  User Change The Five Minutes Chart Icon 
#And  User Change The Fifteen Minutes Chart Icon
#And  User Change The One Hour Chart Icon
#And  User Change The One Day Chart Icon
#Then  Next Page Shown
#
#When User Click The Chart Icon button   #Candles
#And User Click The Candles Icon button
#And User Click The Indicator button
#And User Click The Indicator To Value Send  #Mass Index

#Scenario: User Check The Setting Options: Symbol,Status Line,Scales and Apperance button
#
#When User Click The Setting button
#And User Click The Color Bars button
#And User Click The Body button
#And User Click The Borders button
#And User Click The Wick button
#And User Click The Last Price Line button
#And User Click The Price button
#And User Click The Line button
#And User Click The Fill button
#And User Click The LastLine button
#And User Click The HighAndLowPrice button
#And User Click The Precision button
#And User Click The TimeZone button
#Then User Click The SymbolOkey button
#
#When User Again Check Setting button
#And User Click The Status Line button
#And User Click The Symbol button
#And User Click The Open Market Status button
#And User Click The OHLC Value button
#And User Click The Bar Value Change button
#And User Click The Volume button Disable
#And User Click The Indicator Titles button
#And User Click The Indicator Arguments button
#And User Click The Indicator Value button
#And User Click The Status Background button
#Then User Click The StatusOkey button
#
#When User Again Check Setting button In Scales
#And User Click The Scales button
#And User Click The Symbol Label button
#And User Click The Symbol Last Price  button
#And User Click The High and Low button
#And User Click the Indicator Name button
#And User Click The Indicator Value Label button
#And User Click The No Overlapping Label button
#And User Click The Countdown Bar Close button
#And User Click the Indicator Lock Price To Bar Ratio button
#And User Click the Indicator Scales Placement button
#And User Click the Indicator Date Format button
#Then User Click The ScalesOkey button
#
#
#When User Again Click The Setting button
#And User Click The Apperance button
#And User Click The Background button
#And User Click The Very Grid Lines button
#And User Click The Horz Grid lines button
#And User Click The Session Breaks button
#And User Click The Scales Text button
#And User Click The Scales Lines button
#And User Click The Crosshair button
#And User Click The Watermark button
#And User Click The Navigation button
#And User Click The pane button
#And User Click The Top Margin button
#And User Click The Bottom Margin button
#And User Click The Right Margin button
#And User Click The Template button
#And User Click The ApperanceOkey  button
#
#Scenario: Check The Camera Functionality
#When Navigate To Home Page Guest Login
#And User Click Dropdown
#And User Mouseover "Nifty 50" Click The Chart  # Nifty 50,S&P BSE SENSEX,Nifty 500
#And Navigate To Frames For Chart
#And  User Click Camera Icon
#And Navigate To Frames For Chart
#And  User Click The Save Chart Image
#And Navigate To Frames For Chart
#And  User Click Camera Icon
#And Navigate To Frames For Chart
#And  User Click The Copy Chart Image
#And Navigate To Frames For Chart
#And  User Click Camera Icon
#And Navigate To Frames For Chart
#And  User Click The Copy Link To Chart Image
#And Navigate To Frames For Chart
#And  User Click Camera Icon
#And Navigate To Frames For Chart
#And  User Click The Open Image In New Tab
#And Navigate To Frames For Chart
#And  User Click The Current Window Tab
#And Navigate To Frames For Chart
#And  User Click Camera Icon
#And Navigate To Frames For Chart
#And  User Click The Tweet Chart Image
#Then User Close The Tweet Chart
 
Scenario: Check The Date Ranges Tabs Functionality
#When Navigate To Home Page Guest Login
#And User Click Dropdown
#And User Mouseover "Nifty 50" Click The Chart  # Nifty 50,S&P BSE SENSEX,Nifty 500
#And Navigate To Frames For Chart
#And User Click The Data Range "5y"
#And Navigate To Frames For Chart
#And User Click The Data Range "1y"
#And Navigate To Frames For Chart
#And User Click The Data Range "3m"
#And Navigate To Frames For Chart
#And User Click The Data Range "1m"
#And Navigate To Frames For Chart
#And User Click The Data Range "1d"
#And Navigate To Frames For Chart
#And User Click The Data Range "5d"
#Then User Close The Data Ranges Tab


Scenario: User Check The Chart Save button
And Navigate To Frames For Chart
When User Click The Save button
And Navigate To Frames For Chart
And User Click The New Chart Layout button
And Navigate To Frames For Chart
And User Click The Save button
And Navigate To Frames For Chart
And User Click The Manage Chart Layout button
And Navigate To Frames For Chart
And User Click The Rename button
And Navigate To Frames For Chart
And User Again Click The Manage Chart Layout button
And Navigate To Frames For Chart
And User Click The Copy Chart Layout button
And Navigate To Frames For Chart
And User Click The Again Manage Chart Layout button
And Navigate To Frames For Chart
And User Click The Load Layout button
And Navigate To Frames For Chart
Then User Click The Load Layout Close button


Scenario: User Check The Chart Window size
#When User Click the Window Size Check
And User Click The Chart Size Window One button
And User Click The Chart Size Window Two button
And User Click The Chart Size Window Three button
And User Click The Chart Size Window Maximum button
And User Click The Chart Close button
Then  Next Page Shown

#When User Agaien Click The Niftyfifty Icon
#And  User Agaien Click The Chart button


