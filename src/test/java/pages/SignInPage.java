package pages;

import Repository.SignInPageRepository;
import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class SignInPage {


    public static void sendkeysUsername(String username){
        driver.findElement(By.xpath(SignInPageRepository.userNameTextXpath)).sendKeys(username);
    }

    public static void sendkeysPassword(String password){
        driver.findElement(By.xpath(SignInPageRepository.passwordTextXpath)).sendKeys(password);
    }

    public static void clickLoginButton(){
        driver.findElement(By.xpath(SignInPageRepository.loginButtonXpath)).click();
    }
}
