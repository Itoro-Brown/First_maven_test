import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleLightBox {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

        driver.findElement(By.name("search")).sendKeys("Hp");

        driver.findElement(By.className("input-group-btn")).click();

        driver.findElement(By.linkText("HP LP3065")).click();

        driver.findElement(By.xpath("//ul[@class='thumbnails']//li[1]//a[1]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

     WebElement closeButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Close (Esc)']")));

       closeButton.click();

        System.out.println("Test Passed ");
    }
}
