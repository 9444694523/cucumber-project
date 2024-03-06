Feature: Facebook Login

@Main
Scenario Outline: Login to facebook 
When User enters email address or phone number "<MobileNo>"
And User enters the password "<Password>"
And User clicks on login button
#Then Validate the user credentials in db and proceed to homepage "<MobileNo>""<Password>""https://www.facebook.com"

Examples: 
|MobileNo    |Password |
|3278634932  |sridhar  |
#|7638743873	 |maverick |