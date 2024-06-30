package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static pages.ProductDetailPage.*;

public class ProductDetailPage {

    @And("User click buy")
    public void user_click_buy() {
        clickBuy();
    }

    @Then("User navigates to cart")
    public void user_navigates_to_cart() {
        clickCartButton();
    }
}
