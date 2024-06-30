package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static pages.CartPage.*;

public class CartPage {
    @Then("User successfully add to cart product {string} in {string}")
    public void userSuccessfullyAddToCart(String excelFilePath, String SheetName) throws IOException {
        String actualProduct = visibilityProduct();
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData = reader.getData(excelFilePath, SheetName);
        String testProduct = testData.get(0).get("product");
        Assert.assertEquals(actualProduct,testProduct);
    }

    @When("User change number of items bought")
    public void userChangeNumberOfItemsBought() {
        clickPlusButton();
    }

    @Then("User successfully update number of product bought by {string} and {string}")
    public void userSuccessfullyUpdateNumberOfProductBought(String excelFilePath, String SheetName) throws IOException, InterruptedException {
        Thread.sleep(3000);
        String actualNumberOfItems = visibilityNumberOfItem();
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData = reader.getData(excelFilePath, SheetName);
        String testNumberOfItems = testData.get(0).get("quantity");
        Assert.assertEquals(actualNumberOfItems,testNumberOfItems);
    }

    @When("User delete the product from cart")
    public void userDeleteTheProductFromCart() {
        clickRemoveButton();
    }

    @Then("User successfully delete product from cart with message {string}")
    public void userSuccessfullyDeleteProductFromCart(String message) throws InterruptedException {
        Thread.sleep(3000);
        String actualMessage = visibilityEmptyCart();
        Assert.assertEquals(actualMessage,message);
    }
}
