package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverProvider {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(true);
        driver = new ChromeDriver(options);
    }
}
