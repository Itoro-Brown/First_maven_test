import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class takingSSforWebElements {
   static  WebDriver driver = new FirefoxDriver();
    public static void main(String[] args) throws IOException {


        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

        WebElement eleMentToScreenshot = driver.findElement(By.xpath("(//div[@class='product-thumb transition'])[3]"));

        File srcFile = eleMentToScreenshot.getScreenshotAs(OutputType.FILE);// This takes the screenshot

        FileHandler.copy(srcFile,new File("./Screenshots/item3.png")); // This is where the file is stored and file is named

        // Screenshots of iPad
        driver.findElement(By.linkText("Tablets")).click();
        WebElement tablets = driver.findElement(By.xpath("(//div[@class='row'])[4]"));

        File tabletPhoto = tablets.getScreenshotAs(OutputType.FILE);

        FileHandler.copy(tabletPhoto, new File("./Screenshots/tablet.png"));


        driver.close();



    }

    public  static  void fullPageScreenShot(){

        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");


    }
}
