package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P21_LocateElementByXpathYahooSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com/");

        WebElement searchBox= driver.findElement(By.xpath("//input[@id='ybar-sbq']"));
        searchBox.sendKeys("xpath");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[@class='_yb_10zis']")).click();

        searchBox.sendKeys("selenium locators");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.quit();





    }
}
