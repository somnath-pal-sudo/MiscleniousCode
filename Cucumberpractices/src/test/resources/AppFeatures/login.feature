Feature: Login Feature
 
 Scenario Outline: Login -possible combination
 Given user is on application landing page
 When user clicks on sign in button
 Then user is displayed signin page
 When user enters "<username>" in username field
 And usr enters "<password>" in password field
 And usr clicks signin button
 Then user gets login failed error message
 
 		Examples: 
 		|username| |password|
 		|incorrectusername||12345|
 		|incorrectusername||aqwer|
 		|naveen@gmail.com||1234@123|
 
 