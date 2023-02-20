package tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        Thread.sleep(5000);
        driver.get("https://www.tesla.com");
        driver.manage().window().maximize();
        //String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().to("https://www.cydeo.com");
    }
}
