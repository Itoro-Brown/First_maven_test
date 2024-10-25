import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPOPUP {

    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");  // The password and user name are added to the url












    }
}
