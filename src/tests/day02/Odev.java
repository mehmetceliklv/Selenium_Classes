package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        WebElement sonucSayisi= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println("Listelenen Urunlerin sayisi :"+ sonucSayisi.getText());


        driver.navigate().to("https://www.amazon.com/Shopping/b?ie=UTF8&node=9408875011");
        WebElement shopping= driver.findElement(By.id("nav-search-submit-button"));

        shopping.click();

        WebElement clickPhoto = driver.findElement(By.className("s-image"));

        clickPhoto.click();

        Thread.sleep(2000);

        driver.quit();



    }
}
