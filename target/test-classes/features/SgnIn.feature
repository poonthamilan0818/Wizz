
Feature: To cerify the SignIn functionality


  Scenario: To verify the user profile is signed-in
    Given The user is in Wizz home page
    When The user is to click the sign in option
    And The user should navigate to Sign In window
    And The user to enter their mail id and passworn in sign fields
    And The user click the Sign in button
    Then The use should see their profile is logged in
    

  