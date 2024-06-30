package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utility.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static pages.ProductPage.*;

public class ProductPage {
    @Then("User click on search product")
    public void user_click_on_search_product() {
        clickSearchProduct();
    }
}
