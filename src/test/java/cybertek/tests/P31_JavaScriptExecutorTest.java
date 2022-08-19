package cybertek.tests;

import cybertek.test_util.TestBase;
import io.cucumber.java.et.Ja;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P31_JavaScriptExecutorTest extends TestBase {

    @Test
    public void TestScrollWholeWindow() throws InterruptedException {

        driver.get("https://practice.cydeo.com/infinite_scroll");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,10000)");

        for (int i = 0; i < 10; i++) {

            jse.executeScript("window.scrollBy(0,10000)");
            Thread.sleep(1000);

        }



    }

    @Test
    public void TestScrollElmInTo_theView () throws InterruptedException {

        driver.get("https://practice.cydeo.com/large");
        Thread.sleep(2000);

        WebElement bottomLink = driver.findElement(By.linkText("CYDEO"));
        WebElement homeLink = driver.findElement(By.linkText("Home"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)",bottomLink);
        Thread.sleep(1000);
        jse.executeScript("arguments[0].scrollIntoView(true)",homeLink);
        Thread.sleep(2000);



    }

}
