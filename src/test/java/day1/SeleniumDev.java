package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.InterruptedIOException;

public class SeleniumDev {
    public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver","C:\\Users\\Vetrivel k\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");

        System.out.println(driver.getTitle());
        Thread.sleep(7000);

       //driver.findElement(By.id("//*[@id='email']")).sendKeys("vetri");

        driver.quit();
    }
}

