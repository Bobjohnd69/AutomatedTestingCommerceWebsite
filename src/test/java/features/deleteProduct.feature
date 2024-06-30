Feature: Delete bought product
  Background: log in
    Given User navigates to the login page
    When User successfully enters the login details from "src/test/resources/TestData/UserData.xlsx" and "SignIn"

  @deleteProduct
  Scenario: User delete a product in cart
    Given User navigates to cart from home page
    When User delete the product from cart
    Then User successfully delete product from cart with message "Giỏ hàng của bạn đang trống"