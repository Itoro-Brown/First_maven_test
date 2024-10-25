import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class refactoredwinNavigate {
   static Set<String> childWindows; // All available window handles are made global
   static WebDriver driver;   // Webdriver is made global

    public static  void main (String[] args){

         driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/windows");

        String defaultWindow =  driver.getWindowHandle(); // This is the first window seen after navigation

        driver.findElement(By.linkText("Click Here")).click();

        driver.findElement(By.linkText("Elemental Selenium")).click();

        //Here you get all the handles for the windows just opened
        childWindows = driver.getWindowHandles();


         windowSwitcher("New Window"); // Here each window is gotten based on their title

        String textOnpage =   driver.findElement(By.className("example")).getText();

        System.out.println(textOnpage);


        windowSwitcher("Home | Elemental Selenium");  // Here each window is gotten based on their title

        driver.findElement(By.id("email")).sendKeys("itorobrownn@gmail.com");
        String  newPageTxt =  driver.findElement(By.xpath("//a[@class='hero__subtitle']")).getText();

        System.out.println(newPageTxt);


        // Here user returns to the default window

        driver.switchTo().window(defaultWindow);  // User returns to the default window back

       String defaultpageTitle =  driver.getTitle();

        System.out.println(defaultpageTitle);
        driver.quit();


    }


    // Here is a reusable code for the window switch after ll the window handles is gotten

    public static  void windowSwitcher (String title){

        Iterator itr = childWindows.iterator(); // We use iterator here because items are added in no particular order

        while (itr.hasNext()){

            String focusedWindow = (String) itr.next();

            driver.switchTo().window(focusedWindow);

            if (driver.getTitle().equals(title)){
               break;


            }
    }
}


}
