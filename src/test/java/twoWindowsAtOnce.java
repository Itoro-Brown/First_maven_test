import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class twoWindowsAtOnce {

    public  static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/windows");

      String defaultWindowText =   driver.findElement(By.className("example")).getText();

        System.out.println(defaultWindowText);

      driver.switchTo().newWindow(WindowType.TAB);// This will switch to a new window automatically from the parent window/ WindowType could be Tab or Window

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("itorobrownn@gmail.com");

        driver.findElement(By.id("password")).sendKeys("test123#");
        driver.findElement(By.id("password")).submit();


    }
}
