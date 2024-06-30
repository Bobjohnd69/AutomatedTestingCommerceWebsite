package StepDefinition;

import Repository.ExcelFileRepository;
import io.cucumber.java.en.When;
import utility.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static pages.SignInPage.*;

public class SignInPage {

    @When("User successfully enters the login details from {string} and {string}")
    public void user_successfully_enters_the_login_details(String excelFilePath, String SheetName) throws IOException, InterruptedException {
        Thread.sleep(5000);
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData = reader.getData(excelFilePath, SheetName);
        String email = testData.get(0).get("email");
        String password = testData.get(0).get("password");
        sendkeysUsername(email);
        sendkeysPassword(password);
        clickLoginButton();
    }
}
