package pages;

import Repository.CartPageRepository;
import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class CartPage {


    public static String visibilityProduct() {
        String product = driver.findElement(By.xpath(CartPageRepository.productXpath)).getText();
        return product;
    }

    public static void clickPlusButton(){
        driver.findElement(By.xpath(CartPageRepository.addNumberXpath)).click();
    }

    public static String visibilityNumberOfItem(){
        String numberOfItems = driver.findElement(By.xpath(CartPageRepository.totalPriceXpath)).getText();
        return numberOfItems;
    }

    public static void clickRemoveButton(){
        driver.findElement(By.xpath(CartPageRepository.deleteButtonXpath)).click();
    }

    public static String visibilityEmptyCart(){
        String emptyCart = driver.findElement(By.xpath(CartPageRepository.emptyCartXpath)).getText();
        return emptyCart;
    }
}
