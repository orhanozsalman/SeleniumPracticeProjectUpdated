package cybertek.tests;

import cybertek.test_util.TestBase;
import cybertek.utilities.WebDriverFactory;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P27_iFrameTest extends TestBase {



    @Test
    public void test_iFrame(){

        driver.get("https://practice.cydeo.com/iframe");

        //We need to switch driver's focus to iframe
        //option #1- switching to iframe using id attribute value
        driver.switchTo().frame("mce_0_ifr");

        //option #2- passing index number of iframe
         //driver.switchTo().frame(0);

        //option #3- locate as web element and pass in frame() method
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //Locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        //To be able to verify the header, we must switch back to "main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());

    }

    @Test

    public void test_Nested_iFrame(){

        driver.get("https://practice.cydeo.com/nested_frames");

        //get the text from the bottom
        driver.switchTo().frame("frame-bottom");

        WebElement bottomFrameBodyElm = driver.findElement(By.tagName("body"));

        System.out.println("bottomFrameBodyElm = " + bottomFrameBodyElm.getText());

        //switc out the parent frame

        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //go to middle frame and get the text
        //first go to top frame then go to middle frame

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleFrameDiv = driver.findElement(By.id("content"));
        System.out.println("middleFrameDiv.getText() = " + middleFrameDiv.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        WebElement rightFrameBodyElm = driver.findElement(By.tagName("body"));
        System.out.println("rightFrameBodyElm.getText() = " + rightFrameBodyElm.getText());

        driver.switchTo().defaultContent();



    }
}