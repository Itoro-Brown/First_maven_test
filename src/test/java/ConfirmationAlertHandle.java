import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Stack;

public class ConfirmationAlertHandle {

    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();



        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("JavaScript Alerts")).click();

        driver.findElement(By.xpath("(//button)[2]")).click();

        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();

        System.out.println(alertText);

        alert.dismiss();

        driver.close();
    }
}
