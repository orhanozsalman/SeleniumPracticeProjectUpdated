package cybertek.tests;

import cybertek.test_util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class P29_Synchronization_ImplicitWait extends TestBase {
    @Test
    public void testSlowElement()throws InterruptedException{

        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS); ==> TEST BASE'e yerlestirildigi icin yazmaya gerek yok


        driver.get("https://practice.cydeo.com/dynamic_controls");

        //click on remove button

        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        //identify it's gone element
        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());

        //assert the text is gone
        assertEquals("It's gone!", itsGoneElm.getText());

    }
}
