import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertHandling {

    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("JavaScript Alerts")).click();

        driver.findElement(By.xpath("(//button)[3]")).click();

        Alert alert =driver.switchTo().alert();

       String textonAlert = alert.getText();

        System.out.println(textonAlert);

        alert.sendKeys("I am a tester ");


        alert.accept();

        String inputText = driver.findElement(By.id("result")).getText();

        System.out.println(inputText);

        driver.close();
    }
}
