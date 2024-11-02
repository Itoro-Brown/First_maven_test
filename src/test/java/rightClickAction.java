import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=product/category&path=24");

        WebElement searchField = driver.findElement(By.name("search"));

        Actions action = new Actions(driver);

        action.contextClick(searchField).perform(); // This will perform a right click on the Search field

        driver.close();
    }
}
