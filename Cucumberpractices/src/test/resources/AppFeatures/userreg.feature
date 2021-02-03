Feature: User regsitration
Scenario: user registration with different data
Given user is on registartion page
When user eneters following  details
 | naven | automation | nav@gmail.com | 9999| bangalore|
 |tom|automation|tom@gmail.com|2000|pune|
Then user successfully LoggedIn


Scenario: user registration with different data
Given user is on registartion page
When user eneters following  details with columns
	|firsgtname|lastname|email|phone|city|
 | naven | automation | nav@gmail.com | 9999| bangalore|
 |tom|automation|tom@gmail.com|2000|pune|
Then user successfully LoggedIn
