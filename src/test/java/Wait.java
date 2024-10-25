import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        driver.findElement(By.id("dropdown")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("(//option)[3]")).click();


        driver.close();


    }
}
