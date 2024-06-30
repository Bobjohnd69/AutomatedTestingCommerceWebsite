Feature: Add to cart

  Background: log in
    Given User navigates to the login page
    When User successfully enters the login details from "src/test/resources/TestData/UserData.xlsx" and "SignIn"
    Then User account should be visible like "src/test/resources/TestData/UserData.xlsx" and "SignIn"
  @addToCart
  Scenario: User add a product to cart
    Given User search "src/test/resources/TestData/ProductData.xlsx" in "Product"
    When User click on search product
    And User click buy
    Then User navigates to cart
    And User successfully add to cart product "src/test/resources/TestData/ProductData.xlsx" in "Product"