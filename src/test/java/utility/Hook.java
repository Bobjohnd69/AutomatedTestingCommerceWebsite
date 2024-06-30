package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hook {
    public static BrowserDriver driver;
    public static ChromeOptions options;

    @Before
    public void setUp() {
    driver = new BrowserDriver();
    }

    @After()
    public void quit() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();


    }
}
