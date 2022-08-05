package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_DropdownWithNoSelectTag {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/dropdown");

        // go and click
        WebElement dropdownLink = driver.findElement(By.linkText("Dropdown link"));

        dropdownLink.click();

        WebElement itemGoogleSelect = driver.findElement(By.linkText("Google"));

        itemGoogleSelect.click();

        driver.quit();

    }
}
