package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P22_XpathChallenge {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Orhan");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Ozsalman");

        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("brottblatt");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("orhanozsalman@hotmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("1q2w3e4r");

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("536-256-6875");

        WebElement gender = driver.findElement(By.xpath("//input[@name='gender']"));
        gender.click();

        WebElement birthday = driver.findElement(By.xpath("//input[@name='birthday']"));
        birthday.sendKeys("08/25/1983");

        WebElement department = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[9]/div/select/option[2]"));
        department.click();

        WebElement manager = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[10]/div/select/option[6]\n"));
        manager.click();

        WebElement java = driver.findElement(By.xpath("//input[@id= 'inlineCheckbox2']"));
        java.click();

        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();

        WebElement success = driver.findElement(By.xpath("//h4[@class='alert-heading' and text()='Well done!']"));

        System.out.println("Message Displayed = " + success.isDisplayed());

        driver.quit();


    }
}
