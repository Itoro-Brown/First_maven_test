import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


// This is done for slider elements , eg a mp3 slider or slider along a straight line

public class DragNDropAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice-automation.com/slider/");

        WebElement itemToMove = driver.findElement(By.xpath("//input[@id='slideMe']"));

        Actions actions = new Actions(driver);

        actions.dragAndDropBy(itemToMove,300, 0).perform();

        driver.close();
    }
}
