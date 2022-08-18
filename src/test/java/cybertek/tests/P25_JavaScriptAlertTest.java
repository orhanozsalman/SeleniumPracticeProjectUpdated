package cybertek.tests;

import cybertek.test_util.TestBase;
import cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P25_JavaScriptAlertTest extends TestBase {


    @Test

    public void testAlert(){


        driver.get("https://practice.cydeo.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        driver.switchTo().alert().accept();
        //  Alert alertObj = driver.switchTo().alert();
        //  alertObj.accept();


        WebElement confirmButton =driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmButton.click();
        driver.switchTo().alert().dismiss(); // click cancel button


        WebElement promptButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptButton.click();

        Alert alertObj = driver.switchTo().alert();

        System.out.println("Popup Text is " + alertObj.getText());
        alertObj.sendKeys("Hello there");
        alertObj.accept();


        System.out.println("END");


    }

}
