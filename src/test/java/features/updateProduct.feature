Feature: Update product bought
  Background: log in
    Given User navigates to the login page
    When User successfully enters the login details from "src/test/resources/TestData/UserData.xlsx" and "SignIn"

  @updateProduct
  Scenario: User update a product in cart
    Given User navigates to cart from home page
    When User change number of items bought