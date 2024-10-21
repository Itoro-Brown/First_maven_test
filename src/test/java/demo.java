import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class demo {


    // To Start this project I had to add the selenium dependencies and also the webdrivermanager dependency in the pom.xml file
    // This dependencies were gotten from MVN repository they are : Selenium java and Webdrivermanager
    public  static void main (String[] args){


        String browserName = "firefox";   // Here u could switch to any browser you wish, making the code reusable across all browsers

        WebDriver driver = null;

        if (browserName.equals("chrome")){

            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();

        } else if (browserName.equals("safari")) {

            driver = new SafariDriver();
        }


        driver.manage().window().maximize(); // This maximize the browser windows

        driver.get("https://tutorialsninja.com/demo/"); // The web app under testing is launched.

        driver.findElement(By.name("search")).sendKeys("Hp");

        driver.findElement(By.className("input-group-btn")).click();

        driver.close();


    }
}
