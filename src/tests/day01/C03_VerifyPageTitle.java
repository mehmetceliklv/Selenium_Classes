package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {

    public static void main(String[] args) {

        //1.Yeni bir class olustruralim(VerifyTitle)

        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2.Amazon ana sayfasina gidelim

        driver.get("https://www.amazon.com");
        //3.Sayfa basliginin (title) "amazon" oldugunu dogrulayin.

        String expectedTitle="amazon";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle) ) {
            System.out.println("Title beklenen deger ile ayni test PASSED");
        }else{

            System.out.println("Title beklenenden farkli,test FAILED");
            System.out.println("Actual title  "+driver.getTitle());
        }


        driver.close();

    }
}
