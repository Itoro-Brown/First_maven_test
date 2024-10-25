import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHandling {
    public static void main (String[] args){

        // This work for information alerts , where Okay is the only button available on the alert


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();



        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("JavaScript Alerts")).click();

        driver.findElement(By.xpath("(//button)[1]")).click();

        Alert alert = driver.switchTo().alert();

       String alertText = alert.getText();

        System.out.println(alertText);

        alert.accept();

        String resultText = driver.findElement(By.id("result")).getText();

        System.out.println(resultText);

        driver.close();

        System.out.println("Test Passed");



        // If alert is delayed it is important to apply an explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());


    }


}
