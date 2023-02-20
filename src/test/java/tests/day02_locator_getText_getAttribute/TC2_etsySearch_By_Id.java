package tests.day02_locator_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_etsySearch_By_Id {
    public static void main(String[] args) {
        //TC #2: Etsy practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://amazon.com");
       // WebElement searchBox=driver.findElement(By.id(""));

    }
}
