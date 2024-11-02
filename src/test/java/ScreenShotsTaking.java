import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotsTaking {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://saucelabs.com/");






        File screenHsotTaken2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // This line take the screenshot

        // Where screenshot is stored

        File screenShotFolder = new File("./Screenshots/ttest2.png");

        FileUtils.copyFile(screenHsotTaken2,screenShotFolder);


        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

        File screenHsotTaken3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File screenShotFolder1 = new File("./Screenshots/ttest4.png");

        FileUtils.copyFile(screenHsotTaken3,screenShotFolder1);







        driver.close();
    }
}
