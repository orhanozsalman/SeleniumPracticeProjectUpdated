package cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory2 {
    public static WebDriver get (String browserName){

        WebDriver driver;

        switch (browserName.toLowerCase()){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver =  new ChromeDriver();;
                driver.manage().window().maximize();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            default:
                System.out.println("Unknown BrowserType " + browserName);
                driver = null;
        }
        return driver;

    }

}
