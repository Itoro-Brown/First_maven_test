import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitWait {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // This is the wait statement that controls wait time , and waits for max  of 10 seconds

            driver.get("https://the-internet.herokuapp.com/dropdown");

            driver.findElement(By.id("dropdown")).click();



            driver.findElement(By.xpath("(//option)[3]")).click();


            driver.close();


        }
    }

