Feature: signup Features
This feature includes scenario that would validate the following features.
1. Signup as Student
2. Signup as Teacher

Background: 
Given I am able to naviagte onto the signup page

@execute
Scenario Outline: Signup with different user
When I Enter the first name as "<fname>"
And I Enter the last name as "<lname>"
And I Enter the email as "<email>"
And I Enter the registration username as "<user>"
And I Enter the registration password as "<pwd>"
And I Enter the confirm password as "<pwd>"
And I Enter the phone as "<phone>"
And I am creating account for student
#And I am creating account for teacher
And I click on the register button
Then I should see the username as "<name>"

Examples:
|fname					|lname		    |email								 	|user			|pwd						|phone		      |name					|
#Teacher
#|FTeacher3			|LTeacher3     |F.LTeacher3@gmail.com	|Teacher3|Teacher@123		|9163123456			|FTeacher3 LTeacher3|
#|FTeacher4			|LTeacher4     |F.LTeacher4@gmail.com	|Teacher4|Teacher@123		|9163123456			|FTeacher4 LTeacher4|
#|FTeacher5			|LTeacher5     |F.LTeacher5@gmail.com	|Teacher5|Teacher@123		|9163123456			|FTeacher5 LTeacher5|
#|FTeacher6			|LTeacher6     |F.LTeacher6@gmail.com	|Teacher6|Teacher@123		|9163123456			|FTeacher6 LTeacher6|

#Student
|FStudent1			|LStudent1   |F.LStudent1@gmail.com	|FLStudent1|Student@123		|9163123456			|FStudent1 LStudent1|


