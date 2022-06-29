package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Cssselector {
    public static void main(String[] args) {
        //1. Bir class oluşturun : Locators_css
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //	a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        // b. Locate email textbox
        // 	c. Locate password textbox ve
        //	d. Locate signin button
        //	e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //
        //		i. Username : testtechproed@gmail.com
        //		ii. Password : Test1234!



        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement emailTextBox= driver.findElement(By.cssSelector(".form-control"));
        WebElement passWordTextBox= driver.findElement(By.cssSelector("#session_password"));

        // css selector ile kisa yazilis
        //WebElement passwordTexBox=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        // xpath ile yazilis


        emailTextBox.sendKeys("testtechproed@gmail.com");
        passWordTextBox.sendKeys("Test1234!");


        WebElement signInButon=driver.findElement(By.cssSelector("input[type='submit']"));
        //WebElement signInButon=driver.findElement(By.xpath("//input[@type='submit']"));


        signInButon.click();
    }
}
