import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/sample");

      String pageTitle =   driver.getTitle();


        System.out.println("This is the page title : " + pageTitle);
    }
}
