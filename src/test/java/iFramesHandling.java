import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iFramesHandling {

    static  WebDriver driver;
    public static void main(String[] args) {

       driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://docs.oracle.com/javase/8/docs/api/");

        driver.switchTo().frame("classFrame");

        driver.findElement(By.linkText("Description")).click();

        driver.close();
    }

    // iFrames with Webelement instead of name or ID

    public static void iFrameWebelement(){

        driver = new ChromeDriver();

        driver.get("");


    }
}
