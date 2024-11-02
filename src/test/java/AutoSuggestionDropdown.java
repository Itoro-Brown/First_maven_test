import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutoSuggestionDropdown {
  static   WebDriver driver ;
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("---disable-notifications");


        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.makemytrip.com/");

        WebElement logo = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(logo).click().build().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fromCity']")));

       input.click();



        WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='From']"));

        searchField.click();

        searchField.sendKeys("Niger");

        driver.findElement(By.xpath("//li[@role='option'][1]")).click();







    }
}
