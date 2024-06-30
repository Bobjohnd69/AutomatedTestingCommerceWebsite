package pages;

import Repository.ProductPageRepository;
import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class ProductPage {


    public static String visibilitySearchProduct(){
        String search = driver.findElement(By.xpath(ProductPageRepository.searchedProduct)).getText();
        return search;
    }

    public static void clickSearchProduct(){
        driver.findElement(By.xpath(ProductPageRepository.searchedProduct)).click();
    }
}
