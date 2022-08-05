package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P07_LocateElementsByName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");  // navigate to google

        WebElement searchBox = driver.findElement(By.name("q"));
        // identify and save the search  box element

        searchBox.sendKeys("selenium" + Keys.ENTER);
        //enter text "selenium and search for it

        driver.quit();
        //close the browser

    }
}
