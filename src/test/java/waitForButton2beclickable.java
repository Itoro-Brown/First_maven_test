import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitForButton2beclickable {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://verifalia.com/validate-email");

        driver.findElement(By.xpath("//input")).sendKeys("itorobrownn@gmail.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       WebElement validateButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button)[2]")));

       validateButton.click();


       driver.close();
    }
}
