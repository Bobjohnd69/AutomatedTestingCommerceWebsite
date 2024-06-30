
Feature: login to website
  @loggedInUser
  Scenario: Validate user is able to view after log in
    Given User navigates to the login page
    When User successfully enters the login details from "src/test/resources/TestData/UserData.xlsx" and "SignIn"
    Then User account should be visible like "src/test/resources/TestData/UserData.xlsx" and "SignIn"

