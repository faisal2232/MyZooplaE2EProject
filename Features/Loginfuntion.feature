Feature: User able to Login and Logout from Zoopla Application 

Discription: "User now able to login in and logout from Zoopla application with valid credentials" 

@sanity
Scenario: User able to login in to Zoopla application with valid username.

	Given User able to open any browsers.
	And  User able enter "https://www.zoopla.co.uk" URL
	When user able to click sign in button
	And  User able to enter username  
	And  User able to enter password
	When User able to click login in button
	Then User able to verify the user information "Welcome back to your account" on the UI and LogOut
    