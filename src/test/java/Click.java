import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Click {

    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        String pageTitle = driver.getTitle();

        String pageURl = driver.getCurrentUrl(); // current page URl

        System.out.println(pageURl);

        System.out.println(pageTitle);  // This is used in getting the current page title

        String  text =   driver.findElement(By.xpath("//button[@id='alertButton']")).getText(); // This gets the text on a particular web element

        System.out.println(text); // The element is printed out on the console

        Thread.sleep(300); // This to give some wait time
        driver.quit();




    }
}
