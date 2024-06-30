package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static pages.HomePage.*;

public class BasePage {

    @Given("User navigates to the login page")
    public void userNavigatesToTheLoginPage() throws InterruptedException {
        clickClosePopUp();
        clickHamburgerMenu();
        clickSignInLink();
    }

    @Then("User account should be visible like {string} and {string}")
    public void userAccountShouldBeVisible(String excelFilePath, String SheetName) throws InterruptedException, IOException {
        String actualAccount = visibilityAccount();
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData = reader.getData(excelFilePath, SheetName);
        String username = testData.get(0).get("username");
        Assert.assertEquals(username, actualAccount);
    }

    @When("User search {string} in {string}")
    public void userSearchIn(String excelFilePath, String SheetName) throws InterruptedException, IOException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData = reader.getData(excelFilePath, SheetName);
        String search = testData.get(0).get("search");
        sendKeySearch(search);
        clickFindButton();
    }

    @When("User navigates to cart from home page")
    public void userNavigatesToHomePage() throws InterruptedException{
        clickCartButton();
    }
}
