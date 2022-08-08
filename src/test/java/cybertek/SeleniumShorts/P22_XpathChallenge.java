package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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




        /*











        // select[name='job_title']
        // select[name='job_title'][class='form-control selectpicker']
        //select.selectpicker[name=='job_title']

         //WebElement jobTitle = driver.findElement(By.cssSelector("select[name='job_title']"));
        // Select jobTitleSelect = new Select(jobTitle);
        // jobTitleSelect.selectByIndex(3);


        WebElement manager = driver.findElement(By.cssSelector("#registrationForm > div:nth-child(10) > div > select > option:nth-child(3)"));
        manager.click();

        //inlineCheckbox2
        //input#inlineCheckbox2
        //input[type='checkbox'][value='java']

        WebElement java = driver.findElement(By.cssSelector("input#inlineCheckbox3"));
        java.click();

        //#wooden_spoon
        //button.btn.btn-primary
        //button[class='btn-primary']
        //button.btn.btn=primary[type='submit']

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();



        //button[type='submit']
        */
    }
}
