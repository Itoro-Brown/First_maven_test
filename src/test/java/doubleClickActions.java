import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement doubleClick = driver.findElement(By.id("double-click"));

        Actions action = new Actions(driver);

        action.doubleClick(doubleClick).perform();


    }
}
