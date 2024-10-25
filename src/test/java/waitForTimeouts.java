import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitForTimeouts {

    public static void main (String[] args){


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3)); // If the script does not load in 3 seconds the codes fails, thereby it helps in avoiding long time of page loading

        driver.get("https://the-internet.herokuapp.com/dynamic_loading");

        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();


        driver.findElement(By.xpath("(//button)[1]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading"))); // Here you set the condition for the wait and pass the locator of the load icon.

        String textOnPage = driver.findElement(By.id("finish")).getText();

        System.out.println(textOnPage);


        driver.close();


    }
}
