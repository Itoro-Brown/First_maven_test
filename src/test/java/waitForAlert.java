import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitForAlert {
    public  static void main (String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("(//button)[1]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert(); // This is to switch to an alert window

       String alertString = alert.getText();

        System.out.println(alertString);

        alert.accept(); // This is to press Okay on alert windows

        System.out.println("Test Passed ");


        driver.close();
    }
}
