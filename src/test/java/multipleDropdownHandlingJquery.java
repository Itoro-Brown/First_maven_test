import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class multipleDropdownHandlingJquery {

   static WebDriver driver ;
    public static void main(String[] args) throws InterruptedException {

       driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        driver.findElement(By.id("justAnInputBox1")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement desiredOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='comboTreeItemTitle'])[23]")));

        desiredOption.click();

        driver.findElement(By.xpath("(//span[@class='comboTreeItemTitle'])[20]")).click();

        driver.findElement(By.xpath("(//li[@class='ComboTreeItemChlid'])[13]")).click();
        Thread.sleep(10000);

        selectAllOptions ();

        driver.close();

    }


    // This method selects all option at once

    public static void selectAllOptions () throws InterruptedException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        driver.findElement(By.id("justAnInputBox1")).click();

        List<WebElement> allOptions = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

        for (WebElement temp : allOptions){

          String optionText =  temp.getText();

            System.out.println(optionText);


        }

        System.out.println("Test Passed ");


        Thread.sleep(50000);



    }
}
