import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class navWindows {
    public  static void main (String [] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();



        driver.get("https://the-internet.herokuapp.com/windows");

        String parentWindow =  driver.getWindowHandle();

        driver.findElement(By.linkText("Click Here")).click();

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowsHandles = driver.getWindowHandles();

        Iterator<String> itr = windowsHandles.iterator(); // Use iterator

        while(itr.hasNext()){

            String uniqueWindow = itr.next();

            driver.switchTo().window(uniqueWindow);

            if(driver.getTitle().equals("New Window")){

            String childText = driver.findElement(By.className("example")).getText();

                System.out.println(childText);

                break;
            }
        }

        //TO return to the parent window
        driver.switchTo().window(parentWindow);
      String title =   driver.getTitle();
        System.out.println(title + " is the page title...");


    }
}
