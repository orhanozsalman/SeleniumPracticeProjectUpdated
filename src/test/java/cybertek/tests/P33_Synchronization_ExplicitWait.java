package cybertek.tests;

import cybertek.test_util.TestBase;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class P33_Synchronization_ExplicitWait extends TestBase {

    @Test

    public void test_WaitForExpectedTitle(){

        driver.get("https://practice.cydeo.com/dynamic_loading");

        driver.findElement(By.partialLinkText("Example 7")).click();

        WebDriverWait wait = new WebDriverWait(driver,6);

        //wait.until(ExpectedConditions.titleIs("Dynamic title")); bunun yerine alttakini da yapabiliriz
        wait.until(titleIs("Dynamic title"));


        WebElement doneMessage = driver.findElement(By.id("alert"));

        assertTrue(doneMessage.isDisplayed());




    }

    @Test

    public void test_WaitForElementClickable() throws InterruptedException {

        driver.get("https://practice.cydeo.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input[type='text']"));
        driver.findElement(By.xpath("//button[.='Enable']")).click();


        WebDriverWait wait =  new WebDriverWait(driver,5);
        wait.until(elementToBeClickable(inputBox));
        wait.until(presenceOfElementLocated(By.id("message")) );

        inputBox.sendKeys("Hello There");

        Thread.sleep(3000);



    }

}
