import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

// Here we use the Selenium filehandler instead of the Apache Api

public class screenshotting {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.applitools.com/app.html");

        File screenImage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // This line takes the screenshot

        FileHandler.copy(screenImage,new File("./screens/ttest1.png"));


        driver.findElement(By.xpath("(//div[@class='icon-w'])[5]")).click();

        File image2Taken = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileHandler.copy(image2Taken,new File("./screens/ttest5.png" ));
    }
}
