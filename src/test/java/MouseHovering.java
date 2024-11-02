import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://saucelabs.com/");

        Actions actions = new Actions(driver); //
        WebElement elem = driver.findElement(By.xpath("(//div[@class ='MuiBox-root css-0'])[1]"));

        actions.moveToElement(elem).perform(); // This will move the mouse to the webElement in focus and it take a webElement in its constructor
                                                // Make sure .perform is added for all Actions class method

        WebElement option1 = driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-buttonLabel css-1mh9myf'])[1]"));

        //actions.moveToElement(option1).perform();

        //actions.click().perform();

        actions.moveToElement(option1).click().build().perform(); // This another optimized way the last two lines can be written

      String pageTile =  driver.getTitle();

        System.out.println(pageTile);

        driver.close();



    }
}
