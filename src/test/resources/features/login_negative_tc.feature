Feature: Login Negative TC

  @negative_testing @saikal
  Scenario: Login with incorrect username and password
    Given I am on the login page
    When I enter username "invalidusername@cydeo.com"
    And I enter password 'invalidpassword'
    And click the sign in button
    Then verify the error message "Sorry, Wrong Email or Password"