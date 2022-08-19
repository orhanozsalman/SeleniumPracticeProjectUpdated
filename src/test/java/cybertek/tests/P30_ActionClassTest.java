package cybertek.tests;

import cybertek.test_util.TestBase;
import io.cucumber.java.bs.A;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class P30_ActionClassTest  extends TestBase {

    @Test
    public void testPerformHoverAction(){

        driver.get("https://practice.cydeo.com/hovers");


        //hover over the first image
        // verify the first element
        //img[1]
        //div[@class='figure']img)[1]
        //h5[.='name: user1']


        WebElement firstImage = driver.findElement(By.xpath("//div[@class='figure'][1]"));
        WebElement firstImageText = driver.findElement(By.xpath("//h5[.='name: user1']"));
        System.out.println("Before Hover Over firstImageText = " + firstImageText.isDisplayed());
        assertFalse(firstImageText.isDisplayed());

        //create action class

        Actions actions = new Actions(driver);
        actions.moveToElement(firstImage).perform();

        System.out.println("After Hover Over firstImageText = " + firstImageText.isDisplayed());
        assertTrue(firstImageText.isDisplayed());

        System.out.println("End");


    }

    @Test
    public void testDragAndDrop() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle =driver.findElement(By.id("draggable"));
        WebElement bigCircle =driver.findElement(By.id("droptarget"));

        System.out.println("bigCircle = " + bigCircle.getText());

        Actions actions = new Actions(driver);

        //actions.dragAndDrop(smallCircle,bigCircle).perform();  ==> bunun yerine asagidaki gibi de yapilabilir

        actions.moveToElement(smallCircle).pause(1000)
                .clickAndHold().pause(1000)
                .moveToElement(bigCircle).pause(1000)
                .release()
                .perform();

        System.out.println("bigCircle.getText() = " + bigCircle.getText());



        assertEquals("You did great!", bigCircle.getText());

        Thread.sleep(3000);

    }

    @Test
    public void testKeyboardActions(){


        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));


        //click on the element

        // hold shift and enter text

        //release the shift and enter

        //select all and delete

        Actions actions = new Actions(driver);
        actions.click(searchBox).pause(1000)
                .keyDown(Keys.SHIFT)
                .sendKeys("typing by holding shift").pause(1000)
                .keyUp(Keys.SHIFT)
                .sendKeys("typing after releasing").pause(1000)
                .keyDown(Keys.CONTROL).sendKeys("A").pause(1000)
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE).pause(1000)
                .perform();






    }


    @Test
    public void testRightCLick() throws InterruptedException{

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");

        //locate the div element inside iFrame with css selector()
        //
        driver.switchTo().frame("iframeResult");
        WebElement area = driver.findElement(By.cssSelector("div[contextmenu=\"mymenu\"]"));

        Actions actions =  new Actions(driver);
        actions.contextClick(area).perform();

        Thread.sleep(1000);

        driver.switchTo().alert().accept();

        Thread.sleep(1000);


    }

    @Test
    public void testDoubleClick(){

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");

        driver.switchTo().frame("iframeResult");

        WebElement pElm= driver.findElement(By.xpath("//p['Double-click this paragraph to trigger a function.']"));

        Actions actions = new Actions(driver);
        actions.doubleClick(pElm).perform();

        //assert p element
        WebElement resultELm =  driver.findElement(By.xpath("//p[.='Hello World']"));
        assertTrue(resultELm.isDisplayed());
    }

}
