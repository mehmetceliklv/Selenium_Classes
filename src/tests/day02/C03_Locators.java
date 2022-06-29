package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {

        //1. Bir class oluşturun: Locators
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //	a. http://a.testaddressbook.com adresine gidiniz.

        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        WebElement SignInLinki= driver.findElement(By.linkText("Sign in"));
        SignInLinki.click();

        Thread.sleep(3000);

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //	d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //		i. Username : testtechproed@gmail.com
        //		ii. Password : Test1234!
        WebElement mailBox= driver.findElement(By.name("session[email]"));
        mailBox.sendKeys("testtechproed@gmail.com");

        WebElement passBox=driver.findElement(By.id("session_password"));
        passBox.sendKeys("Test1234!");

        WebElement signInButton=driver.findElement(By.name("commit"));
        signInButton.click();
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).


        WebElement dogruKullanici= driver.findElement(By.className("navbar-text"));
        String userName="testtechproed@gmail.com";

        if (dogruKullanici.getText().equals(userName)) {
            System.out.println("Dogru kullanici testi : PASSED");
        }else{
            System.out.println("Dogru kullanici testi : FAILED");
        }

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesLinki= driver.findElement(By.linkText("Addresses"));
        WebElement signOutLinki=driver.findElement(By.linkText("Sign out"));

        if (adressesLinki.isDisplayed()) {
            System.out.println("Addresses linki gorunuyor, Test PASS");
        }else {
            System.out.println("Addresses linki gorunmuyor, Test FAILED");

        }

        if (signOutLinki.isDisplayed()) {
            System.out.println("SignOut linki gorunuyor, Test PASS");
        }else {
            System.out.println("SignOut linki gorunmuyor, Test FAILED");

        }
        //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement>linkler=driver.findElements(By.tagName("a"));

        System.out.println("Sitenin giris sayfasinda olan link sayisi: "+linkler.size());

        // linklerin yazilarini yazdiralim
        // elimizdeki listedeki tum webelement'lerin yazilarini for loop veya for-each loop ile yazdirabiliriz
        // tum elementler yazdirilacaksa bu durumda for-each loop daha kullanisli olacaktir


        int sira=1;
        for (WebElement each:linkler) {
            System.out.println(sira+" "+each.getText());
            sira++;
        }






        driver.close();
}

}
