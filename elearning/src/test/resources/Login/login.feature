Feature: Login Features
This feature includes scenario that would validate the following features.
1. Login as Admin
2. Login as Linda.anderson
3. Login with Negative data

Background: 
Given I am able to naviagte onto the login page

@execute
Scenario Outline: login with different user
When I Enter the username as "<user>"
And I Enter the password as "<pwd>"
And I click on the login button
Then I should see the username as "<name>"

Examples:
|user					 |pwd		       		|name			 				 |
|Dsingh				 |Dsingh@1234     |Dkumar Singh				|
|Teacher3				|Teacher@123		|FTeacher3 LTeacher3|
|FLStudent1				|Student@123		|FStudent1 LStudent1|

@execute
Scenario: Login with Negative data
When I Enter the username as "Dks" 
And I Enter the password as "Dks" 
And I click on the login button
Then I should see a Error meassage as "Login failed - incorrect login or password." 
