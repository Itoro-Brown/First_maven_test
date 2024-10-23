import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowNAvigation {

    public  static void main(String[] args ){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/windows");

        String defaultWindow =  driver.getWindowHandle(); // This is the first window seen after navigation

        driver.findElement(By.linkText("Click Here")).click();

        driver.findElement(By.linkText("Elemental Selenium")).click();

        //Here you get all the handles for the windows just opened

        Set<String> childWindows = driver.getWindowHandles();

        Iterator itr = childWindows.iterator(); // We use iterator here because items are added in no particular order

        while (itr.hasNext()){

            String focusedWindow = (String) itr.next();

            driver.switchTo().window(focusedWindow);

            if (driver.getTitle().equals("New Window")){
             String textOnpage =   driver.findElement(By.className("New Window")).getText();

                System.out.println(textOnpage);


            }

            break;


        }

        while (itr.hasNext()){
            String secondFocused = (String) itr.next();

            driver.switchTo().window(secondFocused);

            if(driver.getTitle().equals("Home | Elemental Selenium")){

                driver.findElement(By.id("email")).sendKeys("itorobrownn@gmail.com");
            String  newPageTxt =  driver.findElement(By.xpath("//a[@class='hero__subtitle']")).getText();

                System.out.println(newPageTxt);

            }

            break;
        }


        driver.switchTo().window(defaultWindow);
        System.out.println("Code runned successfully ..");

        System.out.println("Test passed ");



    }
}
