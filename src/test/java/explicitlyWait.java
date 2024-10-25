import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitlyWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();



        driver.get("https://the-internet.herokuapp.com/dropdown");

        driver.findElement(By.id("dropdown")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50)); // Explicit wait

        WebElement gmailoption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//option)[3]")));

        gmailoption.click();


        System.out.println("Option clicked .... Test Passed ");


        driver.close();


    }
}
