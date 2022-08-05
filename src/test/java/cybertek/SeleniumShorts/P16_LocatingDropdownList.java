package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P16_LocatingDropdownList {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/dropdown");

        WebElement dropdownElement =driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
        // driver.findElement(By.id("dropdown"));
        Select selectObj= new Select(dropdownElement);

        selectObj.selectByIndex(2); // select the third item at index 2

        selectObj.selectByValue("1"); // selecct  value attribute 1

        selectObj.selectByVisibleText("Option 2");

        driver.quit();



    }
}
