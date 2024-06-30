package pages;

import Repository.HomePageRepository;
import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class HomePage {

    public static void clickHamburgerMenu() {
        driver.findElement(By.xpath(HomePageRepository.AccountOptionXpath)).click();
    }

    public static void clickSignInLink(){
        driver.findElement(By.xpath(HomePageRepository.signInLinkPath)).click();
    }

    public static void clickClosePopUp() {
        driver.findElement(By.xpath(HomePageRepository.popUpXpath)).click();
    }

    public static String visibilityAccount() throws InterruptedException {
        Thread.sleep(2000);
        String actualAccount = driver.findElement(By.xpath(HomePageRepository.checkSuccessXpath)).getText();
        return actualAccount;
    }

    public static void sendKeySearch(String text){
        driver.findElement(By.xpath(HomePageRepository.searchProductXpath)).sendKeys(text);
    }

    public static void clickFindButton(){
        driver.findElement(By.xpath(HomePageRepository.findButtonXpath)).click();
    }

    public static void clickCartButton() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(HomePageRepository.cartButtonXpath)).click();
    }
}
