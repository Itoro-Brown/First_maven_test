import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;


// These involves using the tab key, spacebar key

public class keyboardAction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

        driver.findElement(By.id("input-firstname")).sendKeys("itoro");

        Actions action = new Actions(driver);

        action.sendKeys(Keys.TAB)  // This acts as the tab key while user hits it on the keyboard
                .sendKeys("Brown")
                .sendKeys(Keys.TAB)
                .sendKeys("itorobrownn@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("07043883244")
                .sendKeys(Keys.TAB)
                .sendKeys("Test123#")
                .sendKeys(Keys.TAB)
                .sendKeys("Test123#")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE) // This acts as a spacebar
                .sendKeys(Keys.ENTER).build().perform();


        driver.close();
    }
}
