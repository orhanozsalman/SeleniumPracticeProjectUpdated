package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P19_FindByCssSelector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://search.yahoo.com");

        //use css selector

        WebElement searchBox= driver.findElement(By.cssSelector("input[name='p']"));
        searchBox.sendKeys("css selector");

        WebElement clearText = driver.findElement(By.cssSelector("button#sbq-clear > span.sprite"));
        clearText.click();

        //span[title='Search']
        //button>span[title='Search]
        //button.sbb>span[title='Search'] or button[class='sbb']>span[title='Search']
        //span.ico-syc.mag-glass


        searchBox.sendKeys("selenium locators");
        WebElement searchIcon = driver.findElement(By.cssSelector("span[title=Search]"));
        searchIcon.click();





        driver.quit();

    }
}
