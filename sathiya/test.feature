Feature: Test TestMeApp
Test the TestMeApp application
Scenario: Validate register functionality
Given open the application
When enter the user name as "sathiyanarayanan"
And Enter first name as "sathiya"
And Enter last name as "narayanan"
And Enter the password details as "gayathri123"
And Enter confrim password as "gayathri123"
And Select the gender
And Enter the emailid as "sathiya@gmail.com"
And Enter the mobile number as "9876543210"
And Enter dob as "19/01/1998"
And Enter the address as "asdfghjklz"
Then Select the security questions
And Enter the answer for the qns as "pink"
Then click register
