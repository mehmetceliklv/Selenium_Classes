package tests.day02;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {

    public static void main(String[] args) {

        //Amazon web sayfasina gidip
        //java icin arama yapin
        //ve bulunan sonuc sayisini getir

        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("java"+Keys.ENTER);

        //<span>1-48 of over 6,000 results for</span>

        WebElement sonucYazisi= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));

        System.out.println(sonucYazisi.getText());


        // webelementler obje oldugu icin direk yazdirilamazlar
        // webelemntin sahip oldugu yaziyi string olarak yazdirmak icin
        // getText() method u kullanilir


    }
}
