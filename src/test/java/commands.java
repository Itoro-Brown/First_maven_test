import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class commands {

    public static void main (String[] args){

        String browserName = "Chrome";

        WebDriver driver = null;

        if (browserName.equals("Chrome")){

           driver = new ChromeDriver();


        } else if (browserName.equals("Firefox")) {
           driver = new FirefoxDriver();

        } else if (browserName.equals("Safari")) {
          driver =  new SafariDriver();


        }

        driver.manage().window().maximize();


        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");  // This is to open the specify URL which is in testing


        // To continously take action on a particular web element , we have to create a variable which we use as an object to call the various methods

       WebElement Loginfield = driver.findElement(By.id("input-email")); // Here webelement was used to perform an action multiple times

        Loginfield.sendKeys("test123@gmail.com");

        Loginfield.clear();

        Loginfield.sendKeys("brownitoro@gmail.com ");

        //driver.close();

    }
}
