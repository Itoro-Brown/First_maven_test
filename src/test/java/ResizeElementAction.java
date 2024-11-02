import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeElementAction {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/resizable/");

        WebElement locateIframe = driver.findElement(By.xpath("//iframe"));

        driver.switchTo().frame(locateIframe);

        WebElement resizeableElement = driver.findElement(By.xpath("(//div[@style='z-index: 90;'])[3]"));

        Actions action = new Actions(driver);

        action.dragAndDropBy(resizeableElement,150,30).perform();

        driver.close();

    }
}
