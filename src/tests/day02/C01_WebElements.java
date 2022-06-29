package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {

    public static void main(String[] args) throws InterruptedException {

       // <input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
        // data-testid="royal_email" placeholder="Email or phone number" autofocus="1" aria-label="Email or phone number">

        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //Email text boxa Ali yazdiralim/
        WebElement mailTextBox=driver.findElement(By.id("email"));
        mailTextBox.sendKeys("mehmetcelik@gmail.com");

        driver.manage().window().maximize();
        Thread.sleep(2000);


       // WebElement mailKutusuTagNameIle= driver.findElement(By.tagName("input"));
        // mailKutusuTagNameIle.sendKeys("mehmetcelik@gmail.com");
        // input tagname i ile 6 tane webelement oldugundan hangisine yazacagina karar veremiyor
        // webelementi buldugu icin noSuchElementException vermez

        // WebElement yanlisElement= driver.findElement(By.id("emailyanlis"));
        // yanlisElement.sendKeys("mehmetcelik@gmail.com");

        // giris yap butonuna tiklayalim


        WebElement girisButonu= driver.findElement(By.tagName("button"));
        System.out.println(girisButonu.isEnabled());

        girisButonu.click();










    }
}
