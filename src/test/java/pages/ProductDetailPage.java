package pages;

import Repository.HomePageRepository;
import Repository.ProductDetailRepository;
import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class ProductDetailPage {
    public static void clickBuy(){
        driver.findElement(By.xpath(ProductDetailRepository.buyXpath)).click();
    }
    public static void clickCartButton(){
        driver.findElement(By.xpath(HomePageRepository.cartButtonXpath)).click();
    }
}
