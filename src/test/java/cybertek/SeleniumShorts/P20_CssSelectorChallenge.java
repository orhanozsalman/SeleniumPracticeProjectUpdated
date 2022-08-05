package cybertek.SeleniumShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P20_CssSelectorChallenge {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");


        //input[data-bv-field='firstname']
        // form input[data-bv-field='firstname']
        // div input[data-bv-field='firstname']
        // form#registrationForm input[data-bv-field='firstname']
        // input.form-control[class='firstname']
        //input[name='firstname'][class='firstname']
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Orhan");

        // input[name='lastname']
        // input[placeholder='lastname']
        // form#registrationForm input[data-bv-field='lastname']
        // input.[data-bv-field='lastname']

        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Ozsalman");

        // input[name='username']
        // input[placeholder='username']
        // form#registrationForm input[data-bv-field='username']
        // input.[data-bv-field='username']

        WebElement userName = driver.findElement(By.cssSelector("input[name='username']"));
        userName.sendKeys("brottblatt");

        // input[name='email']
        // input[placeholder='email']
        // form#registrationForm input[data-bv-field='email']
        // input.[data-bv-field='email']

        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("orhanozsalman@hotmail.com");

        // input[name='password']
        // form#registrationForm input[data-bv-field='password']
        // input.[data-bv-field='password']

        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("1q2w3e4r");

        // input[name='phone']
        // input[name='phone'][type='phone']
        // input.[data-bv-field='phone']

        WebElement phone = driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("536-256-6875");

        // input[name='gender'][value='male']
        // input[type='radio'][name='gender'][value='male']


        //input[name='gender']
        WebElement gender = driver.findElement(By.cssSelector("input[name='gender']"));
        gender.click();

        // input[name='birthday']
        // input[name='birthday'][placeholder='MM/DD/YYYY']
        // input.[data-bv-field='birthday']

        WebElement birthday = driver.findElement(By.cssSelector("input[name='birthday']"));
        birthday.sendKeys("08/25/1983");

        // select[name='department']
        // select[name='department'][class='form-control selectpicker']
        //select.selectpicker[name=='department']


        WebElement department = driver.findElement(By.cssSelector("#registrationForm > div:nth-child(9) > div > select > option:nth-child(2)"));
        department.click();

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


    }
}
