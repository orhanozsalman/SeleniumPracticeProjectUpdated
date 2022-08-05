package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_LocatorsPractice {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.vytrack.com/user/login");

        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("abcd");

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd");

        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        WebElement alert = driver.findElement(By.className("alert "));
        if (alert.getText().equals("Invalid user name or password.")){
            System.out.println("alert message passed");
        }else{
            System.out.println("alert message failed");
        }

        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("cytrack")){
            System.out.println("url passed");
        }else {
            System.out.println("url failed");
        }

        driver.findElement(By.partialLinkText("Forgot ")).click();

        if(driver.getTitle().equals("Forgot Password")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is incorrect");
        }



    }
}
