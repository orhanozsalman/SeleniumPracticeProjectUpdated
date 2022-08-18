package cybertek.tests;

import cybertek.test_util.TestBase;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
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

}
